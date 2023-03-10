// Given a rod of length n and a list of prices of rods of length of i, where 1<=i<=n, find the optimal way to cut the rod into smaller rods to maximize profit.The rod of length i has a value price[i-1].

// Input Format
// An integer N representing length of prices array. Prices array. An integer n representing rod length

// Constraints
// 1<=n<=1000
// 1<=prices[i]<=1000

// Output Format
// An integer representing maximum profit

// Sample Input
// 8
// 1 5 8 9 10 17 17 20
// 4
// Sample Output
// 10
// Explanation
// Best: Cut the rod into two pieces of length 2 each to gain revenue of 5 + 5 = 10

// Cut Profit 4 9 1, 3 (1 + 8) = 9 2, 2 (5 + 5) = 10 3, 1 (8 + 1) = 9 1, 1, 2 (1 + 1 + 5) = 7 1, 2, 1 (1 + 5 + 1) = 7 2, 1, 1 (5 + 1 + 1) = 7 1, 1, 1, 1 (1 + 1 + 1 + 1) = 4

import java.util.*;
public class Main {
    public static void main (String args[]) {
  Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] cost = new int[size+1];
		for (int i = 1; i <= size; i++) {
			cost[i] = sc.nextInt();
		}
		int rod = sc.nextInt();
		maximizeRodCutting("dp", rod, cost);
	}
		private static int max(int a, int b) {
			return (a > b) ? a : b;
		}
		private static int maximizeRodCutting(int rodSize, int[] prices) {
			int maxVal = Integer.MIN_VALUE;
			if (rodSize == 0 || rodSize == 1) {
				return prices[rodSize];
			}
			
			else {
				for (int i = 1; i <= rodSize; i++) {
					maxVal = max(maximizeRodCutting(rodSize-i, prices) + 
								prices[i],
								maxVal);
				}
			}
			return maxVal;
		}

		
		private static void maximizeRodCutting(String dp, int rodSize, int[] prices) {
			if (rodSize < 0 || prices == null || prices.length == 0)
				return;
			int[] maxCost = new int[rodSize+1];
			maxCost[1] = prices[1];
			for (int i = 1; i <= rodSize; i++) {
				int maxVal = Integer.MIN_VALUE;
				for (int j = 0; j <= i; j++) {
					maxVal = max(maxVal, prices[j] + maxCost[i-j]);
				}
				maxCost[i] = maxVal;
			}
			System.out.println( maxCost[rodSize]);
    }
}
