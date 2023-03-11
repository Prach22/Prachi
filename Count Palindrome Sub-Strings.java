// You are given a string, count all palindrome substring in a given string with size >=2.

// Input Format
// The input string S.

// Constraints
// Length of the string is less than 500.

// Output Format
// An integer n representing the count of palindromic substrings

// Sample Input
// abaab
// Sample Output
// 3
// Explanation
// 3 SubStrings are as follows : aba baab aa

import java.util.*;
public class Main {
    public static void main (String args[]) {
  Scanner scn = new Scanner(System.in);
			String str = scn.next();
			System.out.println(
				CountPS(str.toCharArray(), str.length()));
		}
	static int CountPS(char str[], int n)
	{
		int dp[][] = new int[n][n];
		boolean P[][] = new boolean[n][n];
		for (int i = 0; i < n; i++)
			P[i][i] = true;
		for (int i = 0; i < n - 1; i++) {
			if (str[i] == str[i + 1]) {
				P[i][i + 1] = true;
				dp[i][i + 1] = 1;
			}
		}
		for (int gap = 2; gap < n; gap++) {
			for (int i = 0; i < n - gap; i++) {
				int j = gap + i;
				if (str[i] == str[j] && P[i + 1][j - 1])
					P[i][j] = true;
				if (P[i][j] == true)
					dp[i][j] = dp[i][j - 1] + dp[i + 1][j]
							+ 1 - dp[i + 1][j - 1];
				else
					dp[i][j] = dp[i][j - 1] + dp[i + 1][j]
							- dp[i + 1][j - 1];
			}
		}
		return dp[0][n - 1];
    }
}
