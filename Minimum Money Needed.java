// Cody went to the market to buy some oranges for his N friends. There he finds orange wrapped in packets, with the price of i^th packet as val[i]. Now he wants to buy exactly W kg oranges, so he wants you to tell him what minimum price he should pay to buy exactly W kg oranges. Weight of i^th packet is i kg. If price of i^th packet is -1 then this packet is not available for sale. The market has infinite supply of orange packets.

// Input Format
// First line of input contains two space separated integers N and W, the number of friend he has and the amount of Oranges in kilograms which he should buy.

// The second line contains W space separated integers in which the i^th^ integer specifies the price of a ‘i’kg apple packet. A value of -1 denotes that the corresponding packet is unavailable

// Constraints
// 1 <= N,W,val[ ] <= 10^3

// Output Format
// Output a single integer denoting the minimum price Code should pay to get exactly W kg oranges. Else print -1 if it is not possible to fill the bag.

// Sample Input
// 5 5
// 1 2 3 4 5
// Sample Output
// 5
import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int w = sc.nextInt();
		int val[] = new int[w];
		for (int i = 0; i < w; i++) {
			val[i] = sc.nextInt();
		}
		int wt[] = new int[val.length];
		for (int i = 0; i < val.length; i++) {
			if (val[i] != -1)
				wt[i] = i + 1;
			else
				wt[i] = 0;
		}
		int dp[][] = new int[w + 1][w + 1];
		System.out.println(MoneyNeeded(val, w, w, dp));

	}

	public static int MoneyNeeded(int arr[], int w, int n, int[][] dp) {
		if (w == 0) {
			return 0;
		}
		if (n == 0 && w == 0) {
			return 0;
		}
		if (w < 0) {
			return Integer.MAX_VALUE;
		}
		if (n == 0 && w > 0) {
			return Integer.MAX_VALUE;
		}
		if (dp[n][w] != 0) {
			return dp[n][w];
		}
		if (arr[n - 1] < 0) {
			return dp[n][w] = MoneyNeeded(arr, w, n - 1, dp);
		}
		if (w < n) {
			return dp[n][w] = MoneyNeeded(arr, w, n - 1, dp);
		}
		return dp[n][w] = Math.min(arr[n - 1] + MoneyNeeded(arr, w - n, n, dp), MoneyNeeded(arr, w, n - 1, dp));
    }
}
