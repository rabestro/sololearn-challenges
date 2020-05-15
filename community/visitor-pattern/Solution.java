package rabestro.visitor;

import java.util.*;

enum Color {
    RED, GREEN
}

abstract class Tree {

    private int value;
    private Color color;
    private int depth;

    public Tree(int value, Color color, int depth) {
        this.value = value;
        this.color = color;
        this.depth = depth;
    }

    public int getValue() {
        return value;
    }

    public Color getColor() {
        return color;
    }

    public int getDepth() {
        return depth;
    }

    public abstract void accept(TreeVis visitor);
}

class TreeNode extends Tree {

    private ArrayList<Tree> children = new ArrayList<>();

    public TreeNode(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitNode(this);

        for (Tree child : children) {
            child.accept(visitor);
        }
    }

    public void addChild(Tree child) {
        children.add(child);
    }
}

class TreeLeaf extends Tree {

    public TreeLeaf(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitLeaf(this);
    }
}

abstract class TreeVis {
    public abstract int getResult();

    public abstract void visitNode(TreeNode node);

    public abstract void visitLeaf(TreeLeaf leaf);

}

class SumInLeavesVisitor extends TreeVis {
    private int sum = 0;

    public int getResult() {
        return sum;
    }

    public void visitNode(TreeNode node) {
    }

    public void visitLeaf(TreeLeaf leaf) {
        sum += leaf.getValue();
    }
}

class ProductOfRedNodesVisitor extends TreeVis {
    private static final int MODULO = 1_000_000_000 + 7;
    private long product = 1;

    public int getResult() {
        return product > 0 ? (int) product : 1;
    }

    public void visitNode(TreeNode node) {
        if (node.getColor() == Color.RED) {
            product *= node.getValue();
            product %= MODULO;
        }
    }

    public void visitLeaf(TreeLeaf leaf) {
        if (leaf.getColor() == Color.RED) {
            product *= leaf.getValue();
            product %= MODULO;
        }
    }
}

class FancyVisitor extends TreeVis {
    private int sumInNodes = 0;
    private int sumInGreen = 0;

    public int getResult() {
        return Math.abs(sumInNodes - sumInGreen);
    }

    public void visitNode(TreeNode node) {
        if (node.getDepth() % 2 == 0) {
            sumInNodes += node.getValue();
        }
    }

    public void visitLeaf(TreeLeaf leaf) {
        if (leaf.getColor() == Color.GREEN) {
            sumInGreen += leaf.getValue();
        }
    }
}

public class Solution {
    private static final class MyTree {
        int value;
        int depth;
        int parent;
        boolean hasChildren;
        Color color;
    }
    private static final class Edge {
        int x;
        int y;

        public Edge(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    private static final List<Edge> edges = new LinkedList<>();
    private static MyTree[] myTree;

    private static Edge retrieveEdge(int index) {
        for (int i = 0; i < edges.size(); ++i) {
            final Edge edge = edges.get(i);
            if (edge.x == index || edge.y == index) {
                edge.y = edge.y == index ? edge.x : edge.y;
                edge.x = index;
                edges.remove(i);
                return edge;
            }
        }
        return null;
    }

    private static void makeTree(int index) {
        Edge edge;
        while (null != (edge = retrieveEdge(index))) {
            myTree[edge.y].depth = myTree[edge.x].depth + 1;
            myTree[edge.y].parent = edge.x;
            myTree[edge.x].hasChildren = true;
            makeTree(edge.y);
        }
    }

    public static Tree solve() {
        final Scanner sc = new Scanner(System.in);
        final int n = Integer.parseInt(sc.nextLine());
        final Tree[] trees = new Tree[n];
        myTree = new MyTree[n];
        String[] values = sc.nextLine().split(" ");
        String[] colors = sc.nextLine().split(" ");
        System.err.println("Start processing...");
        for (int i = 0; i < n; ++i) {
            myTree[i] = new MyTree();
            myTree[i].value = Integer.parseInt(values[i]);
            myTree[i].color = colors[i].charAt(0) == '0' ? Color.RED : Color.GREEN;
        }

        for (int i = 0; i < n - 1; i++) {
            edges.add(new Edge(sc.nextInt() - 1, sc.nextInt() - 1));
        }
        makeTree(0);

        for (int i = 0; i < n; i++) {
            if (myTree[i].hasChildren) {
                trees[i] = new TreeNode(myTree[i].value, myTree[i].color, myTree[i].depth);
            } else {
                trees[i] = new TreeLeaf(myTree[i].value, myTree[i].color, myTree[i].depth);
            }
        }
        for (int i = 1; i < n; i++) {
            TreeNode parent = (TreeNode) trees[myTree[i].parent];
            parent.addChild(trees[i]);
        }
        return trees[0];
    }

    public static void main(String[] args) {
        Tree root = solve();
        SumInLeavesVisitor vis1 = new SumInLeavesVisitor();
        ProductOfRedNodesVisitor vis2 = new ProductOfRedNodesVisitor();
        FancyVisitor vis3 = new FancyVisitor();

        root.accept(vis1);
        root.accept(vis2);
        root.accept(vis3);

        int res1 = vis1.getResult();
        int res2 = vis2.getResult();
        int res3 = vis3.getResult();

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
    }
}
