// Given an array nums of length n. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

// Return the running sum of nums.

// Input Format
// First line contains an integer n representing number of elements. Next line contains n integers denoting array elements.

// Constraints
// 1 <= nums.length <= 1000
// -10^6 <= nums[i] <= 10^6

// Output Format
// An integer representing running sum array of the given array

// Sample Input
// 4
// 1 2 3 4
// Sample Output
// 1 3 6 10
// Explanation
// Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].

import java.util.*;
public class Main {
    public static void main (String args[]) {
Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int [] arr= new int[N];
		for(int i = 0; i < N; i++) {
			arr[i] = scn.nextInt();
	    }
		int[] sum = runningSum(arr);
		print(sum);
		}
	public static void print(int[]arr) {
		for(int alo : arr) {
			System.out.print(alo + " " );
		}
		System.out.println();
	}
	private static int[] runningSum(int[] nums) {
		// TODO Auto-generated method stub
		int[] ans = new int[nums.length];
		ans[0] = nums[0];
		for(int i = 1; i < nums.length; i++) {
			ans[i] = nums[i] + ans[i-1];
		}
		return ans;
    }
}
