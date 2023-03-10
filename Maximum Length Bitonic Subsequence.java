// You are provided n numbers of array. You need to find the maximum length of biotonic subsequence. A subsequence is biotonic if it is first increasing and then decreasing or entirely increasing or decreasing. Please Note: the heights of the building in the elements should be strictly increasing and then strictly decreasing.

// Input Format
// First line contains integer t which is number of test case.
// For each test case, in the first line you are given an integer n which is the size of array and the next line contains n space separated integers denoting the elements of the array.

// Constraints
// 1<=t<=100
// 1<=n<=1000
// | Ai | <= 10000

// Output Format
// Print the maximum length of biotonic subsequence for each testcase in a new line.

// Sample Input
// 2
// 8
// 1 11 2 10 4 5 2 1
// 6
// 80 60 30 40 20 10
// Sample Output
// 6
// 5
// Explanation
// For 1st test case : Maximum length = 1, 2, 4, 5, 2, 1
// For 2nd test case : Maximum length = 80, 60, 40, 20 10 or 80, 60, 30, 20 10

import java.util.*;
public class Main {
    public static void main(String args[]) {
  	Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			
			System.out.println(BitonicSubsequnce(arr));

		}

	}

	public static int BitonicSubsequnce(int arr[]) {
		int Is[] = new int[arr.length];
		int Ds[] = new int[arr.length];
		Arrays.fill(Is, 1);
		Arrays.fill(Ds, 1);
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] > arr[j] && Is[i] < Is[j] + 1) {
					Is[i] = Is[j ]+1;
				}
			}

		}
		for (int j = arr.length - 2; j >= 0; j--) {
			for (int i = arr.length - 1; i > j; i--) {
				if (arr[i] < arr[j] && Ds[j] < Ds[i] + 1) {
					Ds[j] = Ds[i] + 1;
				}
			}
		}
		int max = Is[0] + Ds[0] - 1;
		for (int i = 1; i < arr.length; i++) {
			if (max < Is[i] + Ds[i] - 1) {
				max = Is[i] + Ds[i] - 1;
			}
		}
		return max;
    }
}
