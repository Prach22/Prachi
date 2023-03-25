// You are given N elements, a1,a2,a3….aN. Find the number of good sub-arrays.
// A good sub-array is a sub-array [ai,ai+1,ai+2….aj] such that (ai+ai+1+ai+2+….+aj) is divisible by N.

// Input Format
// The first line contains the number of test cases T. First line of each test case contains an integer N denoting the number of elements. Second line of each test case contains N integers, a1, a2, a3….aN, where ai denotes the ith element of the array.

// Constraints
// 1<=T<=10
// 1<=N<=10^5
// |ai|<=10^9

// Output Format
// Output a single integer denoting the number of good sub-arrays.

// Sample Input
// 2
// 5
// 1 1 1 1 1
// 5
// 5 5 5 5 5
// Sample Output
// 1
// 15
// Explanation
// In first test case, there is only one sub-array [1, 1, 1, 1, 1], such that 1+1+1+1+1=5, which is divisible by N=5

import java.util.*;
public class Main {
    public static void main(String args[]) {
        	Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}

			DivisibleSubarrays(arr, n);

		}

	}

	public static void DivisibleSubarrays(int[] arr, int n) {
				int[] ans = new int[n];
		int sum = 0;
		ans[0] = 1;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			sum = sum % n;
			if (sum < 0) {
				sum += n;

			}

			ans[sum]++;// ans[sum] = ans[sum]+1;

		}
		long res = 0;

		for (int i = 0; i < ans.length; i++) {
			if (ans[i] >= 2) {
				long p = ans[i];
				res = res + (p * (p - 1)) / 2;

			}

		}
		System.out.println(res);

    }
}
