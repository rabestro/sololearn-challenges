package com.rabestro.time2meet;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        final var sc = new Scanner(System.in);
        int test = sc.nextInt();

        while (test --> 0) {
            final var rows = sc.nextInt();
            final var cols = sc.nextInt();
            final var nums = sc.nextInt();
            final var schema = sc.tokens().limit(rows).toArray(String[]::new);

            final Map map = new Map(rows, cols, schema);
            final var time = map.calculateTime();
            System.out.println(time);
        }
        sc.close();
    }
}

class Map {
    final static int UNCHECKED = -2;
    final static int[][] NEIGHBOURS = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    final int rows;
    final int cols;
    final Cell[][] map;
    final List<Cell> friends = new ArrayList<>();
    final List<Cell> cells = new ArrayList<>();

    public Map(final String[] schema) {
        this(schema.length, schema[0].length(), schema);
    }

    public Map(final int rows, final int cols, final String[] schema) {
        this.rows = rows;
        this.cols = cols;
        map = new Cell[rows][cols];
        for (int x = 0; x < rows; ++x) {
            for (int y = 0; y < cols; ++y) {
                final var type = Type.values()[schema[x].charAt(y) - '0'];
                final var cell = new Cell(x, y, type);
                map[x][y] = cell;
                if (type == Type.FRIEND) friends.add(cell);
                if (type != Type.FAIRY) {
                    cell.moves = -1;
                    cells.add(cell);
                }
            }
        }
    }

    int calculateTime() {
        cells.forEach(this::calculateCell);
        return cells.stream().filter(Cell::isReachable).mapToInt(Cell::getTime).min().orElse(-1);
    }

    void calculateCell(Cell cell) {
        final Queue<Cell> queue = new LinkedList<>();
        cells.forEach(Cell::clearMoves);
        cell.moves = 0;
        queue.add(cell);

        do {
            final var start = queue.remove();
            for (final var xy : NEIGHBOURS) {
                final int nx = start.x + xy[0];
                final int ny = start.y + xy[1];
                final var isInRange = 0 <= nx && nx < rows && 0 <= ny && ny < cols;
                if (isInRange && map[nx][ny].isUnchecked()) {
                    map[nx][ny].moves = start.moves + 1;
                    queue.add(map[nx][ny]);
                }
            }
        } while (!queue.isEmpty());

        final boolean isReachable = friends.stream().noneMatch(i -> i.moves < 0);

        if (isReachable) {
            cell.time = friends.stream().mapToInt(Cell::getMoves).max().orElse(-1);
        } else {
            cell.time = -1;
        }
    }

    enum Type {EMPTY, FAIRY, FRIEND}

    static class Cell {
        final int x;
        final int y;
        final Type type;
        int moves;
        int time;

        public Cell(final int x, final int y, final Type type) {
            this.x = x;
            this.y = y;
            this.type = type;
        }

        public int getMoves() {
            return moves;
        }

        public int getTime() {
            return time;
        }

        void clearMoves() {
            moves = UNCHECKED;
        }

        boolean isUnchecked() {
            return moves == UNCHECKED;
        }

        boolean isReachable() {
            return time >= 0;
        }
    }
}
