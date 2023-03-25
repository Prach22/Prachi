// Given an array arr of n integers where n > 1, return an array output such that output[i] is equal to the product of all the elements of arr except arr[i].

// Input Format
// First line contains integer N as size of array.
// Next line contains a N integer as element of array.

// Constraints
// arr[i]<=10000000

// Output Format
// print output array

// Sample Input
// 4
// 1 2 3 4
// Sample Output
// 24 12 8 6 

import java.util.*;
public class Main {
    public static void main (String args[]) {
  Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[]arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
			}
		productOfArray(arr);
	}
	public static void productOfArray(int[] arr){
		long res = 1;
		for(long i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				if(j != i) {
					res = res*arr[j];
					// System.out.print(res + " ");
				}
			}
			System.out.print(res + " ");
			res = 1;
		}
    }
}
