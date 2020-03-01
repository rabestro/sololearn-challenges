// https://www.sololearn.com/post/249658/?ref=app
// Input: number
// Output: Graph

import java.util.*;

public class Graph {
	public static void main(String[] args) {
		final var sc = new java.util.Scanner(System.in);
		final var graph = sc.next().chars().map(i -> i - '0').toArray();
		var isOdd = true;
		int h = 0, x = 0, max = 0, min = 0;
		
		for (var digit : graph) {
			x += digit; 
			h += isOdd ? digit: -digit;
			if (h > max) max = h;
			if (h < min) min = h;
			isOdd = !isOdd;
		}
		char[][] map = new char[1 + max - min][x];
		for (var row : map) Arrays.fill(row, ' ');
		x = 0; h = max; isOdd = false;
		
		for (var digit : graph) {
			isOdd = !isOdd;
			while (digit --> 0) {
				map[h][x++] = isOdd ? '/' : '\\';
				if (digit > 0) h += isOdd ? -1 : 1;
			}
		}
		
		for (var row : map) System.out.println(row);
	}
}
