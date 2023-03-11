// Given an array, the task is to calculate the sum of lengths of contiguous subarrays having all elements distinct

// Input Format
// An integer n denoting size of array followed by n integers

// Constraints
// 1<=N<=10^5

// Output Format
// The answer mod 10^9+7

// Sample Input
// 3
// 1 2 3
// Sample Output
// 10
// Explanation
// {1, 2, 3} is a subarray of length 3 with distinct elements. Total length of length three = 3. {1, 2}, {2, 3} are 2 subarray of length 2 with distinct elements. Total length of lengths two = 2 + 2 = 4 {1}, {2}, {3} are 3 subarrays of length 1 with distinct element. Total lengths of length one = 1 + 1 + 1 = 3 Sum of lengths = 3 + 4 + 3 = 10

import java.util.*;
public class Main {
    public static void main(String args[]) {
   Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int arr[] = new int[num];
		for (int i = 0; i < num; i++)
		{
			arr[i] = sc.nextInt();
		}
		int ans = getLength(arr,0,num-1);
		System.out.println(ans);
		sc.close();
	}

	private static int getLength(int[] arr, int start, int end)
	{
		int ans=0;
		int j=0;
		HashSet<Integer> hs = new HashSet<>();
		for (int i = 0; i < arr.length; i++)
		{
			while(j<arr.length && !hs.contains(arr[j]))
			{
				hs.add(arr[j]);
				j++;
			}
			
			ans = ans + ((j-i)*(j-i+1))/2;
			hs.remove(arr[i]);
		}
		return ans;
    }
}
