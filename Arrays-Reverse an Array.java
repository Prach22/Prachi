// Take as input N, the size of array. Take N more inputs and store that in an array. Write a function that reverses the array. Print the values in reversed array.

// 1.It reads a number N.
// 2.Take Another N numbers as input and store them in an Array.
// 3.Reverse the elements in the Array.
// 4.Print the reversed Array.

// Input Format
// First-line contains a single integer n denoting the size of the array.
// Next, N line contains a single integer denoting the elements of the array.

// Constraints
// N cannot be Negative. Range of Numbers can be between -1000000000 to 1000000000.

// Output Format
// Print the elements of the reversed array

// Sample Input
// 5
// 0
// 4 
// 6 
// 8 
// 9
// Sample Output
// 9 
// 8 
// 6 
// 4 
// 0 
// Explanation
// In the sample case , arr=[0,4,6,8,9] is reversed to arr=[9,8,6,4,0].

import java.util.*;
public class Main {
    public static void main(String args[]) {
  Scanner scn = new Scanner(System.in);
	int N = scn.nextInt();
	int[] arr= new int[N];
	for(int i = 0; i < N;i++) {
		arr[i] = scn.nextInt();
	}
		int[] rev_arr = Rev(arr);
		//RevPrint(rev_arr);
		print(rev_arr);
}
   public static void print(int[]arr) {
	   for(int alo : arr) {
		   System.out.println(alo + " ");
	   }
	   System.out.println();
   }
   public static int[] Rev(int[] arr) {
	   int[]ans = new int[arr.length];
	   int i = 0;
	   int j = arr.length-1;
	   while(j >= 0) {
		   ans[i] = arr[j];
		   i++;
		   j--;
	   }
	   for(int idx = 0; idx < arr.length; idx++) {
		   arr[idx] = ans[idx];
	   }
	   return ans;
   }
   public static void RevPrint(int[] arr) {
	   for(int i = arr.length-1; i >= 0; i--) {
		   System.out.print(arr[i] + " ");
	   }
	   System.out.println();
   }
   public static void Rev2(int[] arr) {
	   int s = 0;
	   int e = arr.length-1;
	   while(s < e) {
		   int temp = arr[s];
		   arr[s] = arr[e];
		   arr[e] = temp;
		   s++;
		   e--;
	   }
    }
}
