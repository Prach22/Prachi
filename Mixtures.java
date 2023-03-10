// Harry Potter has n mixtures in front of him, arranged in a row. Each mixture has one of 100 different colors (colors have numbers from 0 to 99).

// He wants to mix all these mixtures together. At each step, he is going to take two mixtures that stand next to each other and mix them together, and put the resulting mixture in their place.

// When mixing two mixtures of colors a and b, the resulting mixture will have the color (a+b) mod 100.

// Also, there will be some smoke in the process. The amount of smoke generated when mixing two mixtures of colors a and b is a*b.

// Find out what is the minimum amount of smoke that Harry can get when mixing all the mixtures together.
// You can find the original problem here.

// Input Format
// The first line of each input file will contain n, the number of mixtures. The second line will contain n integers between 0 and 99 - the initial colors of the mixtures.

// Constraints
// 1 <= n <= 100

// Output Format
// Output the minimum amount of smoke.

// Sample Input
// 3
// 40 60 20
// Sample Output
// 2400
// Explanation
// There are two possibilities: first mix 40 and 60 (smoke: 2400), getting 0, then mix 0 and 20 (smoke: 0); total amount of smoke is 2400. first mix 60 and 20 (smoke: 1200), getting 80, then mix 40 and 80 (smoke: 3200); total amount of smoke is 4400. The first scenario is a much better way to proceed.

import java.util.*;
public class Main {
    public static void main(String args[]) {
   Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0; i<n;i++){
				arr[i] = sc.nextInt();
			}
			int dp[][] = new int[arr.length][arr.length];
			for(int row[]: dp){
				Arrays.fill(row, -1);
			}

			System.out.println(sol(arr, 0, arr.length-1, dp));
	    }

		public static int sol(int[] arr, int l, int r, int[][] dp){
			if(l>=r)
				return 0;

			if(dp[l][r]!=-1)
				return dp[l][r];

			int minCost = Integer.MAX_VALUE;
			for(int part=l; part<r; part++){
				int p1 = sol(arr, l, part, dp);
				int p2 = sol(arr, part+1, r, dp);
				int individual_cost = new_color_comb(arr, l, part) * new_color_comb(arr, part+1, r);  //(ab) (cd) => [(a+b)%100] * [(c+d)%100]
				int cost = p1 + p2 + individual_cost;
				minCost = Math.min(minCost, cost);
				dp[l][r]=minCost;
			}
			return minCost;
		}

		public static int new_color_comb(int arr[], int l, int r){
			int sum=0;
			for(int i=l; i<=r; i++){
				sum+= arr[i];
			}
			return sum %100;
    }
}
