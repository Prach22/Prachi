// You are given an N*M grid. Each cell (i,j) in the grid is either blocked, or empty. The rat can move from a position towards left, right, up or down on the grid.
// Initially rat is on the position (1,1). It wants to reach position (N,M) where it's cheese is waiting for. There exits a unique path in the grid . Find that path and help the rat reach its cheese.

// Input Format
// First line contains 2 integers N and M denoting the rows and columns in the grid.
// Next N line contains M characters each. An 'X' in position (i,j) denotes that the cell is blocked and ans 'O' denotes that the cell is empty.

// Constraints
// 1 <= N , M <= 10

// Output Format
// Print N lines, containing M integers each. A 1 at a position (i,j) denotes that the (i,j)th cell is covered in the path and a 0 denotes that the cell is not covered in the path.
// If a path does not exits then print "NO PATH FOUND"

// Sample Input
// 5 4
// OXOO
// OOOX
// XOXO
// XOOX
// XXOO
// Sample Output
// 1 0 0 0 
// 1 1 0 0 
// 0 1 0 0 
// 0 1 1 0 
// 0 0 1 1 

import java.util.*;
public class Main {
    public static void main(String args[]) {
  Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		char[][] matrix = new char[n][m];
		for (int i = 0; i < n; i++) {
			String str = scn.next();
			for (int j = 0; j < m; j++) {
				matrix[i][j] = str.charAt(j);
			}
		}
		int[][] res = new int[n][m];
		if (ratChasesItsCheese(matrix, 0, 0, res, new boolean[n][m])) {
			for (int i = 0; i < res.length; i++) {
				for (int j = 0; j < res[0].length; j++) {
					System.out.print(res[i][j] + " ");
				}
				System.out.println();
			}
		} else {
			System.out.println("NO PATH FOUND");
		}
		scn.close();

	}

	public static boolean ratChasesItsCheese(char[][] matrix, int cr, int cc, int[][] res, boolean[][] visited) {
		if (cr == matrix.length - 1 && cc == matrix[0].length - 1) {
			res[cr][cc]=1;
			return true;
		}
		if (cr < 0 || cc < 0 || cr == matrix.length || cc == matrix[0].length
				|| visited[cr][cc] || matrix[cr][cc] == 'X') {
			return false;
		}
		res[cr][cc] = 1;
		visited[cr][cc] = true;
		if (ratChasesItsCheese(matrix, cr - 1, cc, res, visited)) { // top
			return true;
		}
		if (ratChasesItsCheese(matrix, cr, cc + 1, res, visited)) { // right
			return true;
		}
		if (ratChasesItsCheese(matrix, cr + 1, cc, res, visited)) { // bottom
			return true;
		}
		if (ratChasesItsCheese(matrix, cr, cc - 1, res, visited)) { // left
			return true;
		}

		res[cr][cc] = 0;
		visited[cr][cc] = false;
		return false;
    }
}
