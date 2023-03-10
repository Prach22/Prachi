// Piyush and Nimit are playing a coin game. They are given n coins with values x1, x2 …. xn where 'n' is always even. They take alternate terms. In each turn, a player picks either the first coin or the last coin from the row and removes it from the row. The value of coin is received by that player. Determine the maximum value that Piyush can win with if he moves first. Both the players play optimally.

// Input Format
// First line contains the number of coins 'n'.
// Second line contains n space separated integers where ith index denotes the value of ith coin.

// Constraints
// 1 < N <= 10000 , N is always even
// 0 <= Ai <= 1000000

// Output Format
// Print a single line with the maximum possible value that Piyush can win with.

// Sample Input
// 4
// 1 2 3 4
// Sample Output
// 6
// Explanation
// Piyush will pick the coin 4. Then Nimit can pick either 1 or 3. In both the cases Piyush picks coin 2 and wins with a total of 6.

import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] coin = new int[n];
		for (int i = 0; i < n; i++) {
			coin[i] = sc.nextInt();

		}
		int[][] dp = new int[n][n];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
		System.out.println(Optimal_GameStrategy_II(coin, 0, n - 1, dp));

	}

	public static int Optimal_GameStrategy_II(int[] coin, int i, int j, int[][] dp) {

		if (i > j) {
			return 0;
		}
		if (i + 1 == j) {
			return Math.max(coin[i], coin[j]);
		}
		if(dp[i][j]!=-1) {
			return dp[i][j];
		}

		int op1 = coin[i] + Math.min(Optimal_GameStrategy_II(coin, i + 2, j, dp),
				Optimal_GameStrategy_II(coin, i + 1, j - 1, dp));

		int op2 = coin[j] + Math.min(Optimal_GameStrategy_II(coin, i + 1, j - 1, dp),
				Optimal_GameStrategy_II(coin, i, j - 2, dp));

		return dp[i][j] = Math.max(op1, op2);
    }
}
