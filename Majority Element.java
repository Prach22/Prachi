// Given an array of size n, find the majority element. The majority element is the element that appears more than n/2 times.

// You may assume that the array is non-empty and the majority element always exist in the array.

// Input Format
// First line contains integer N (size of the array) followed by N more integers.

// Constraints
// Output Format
// Majority Element of array

// Sample Input
// 3
// 1 1 2
// Sample Output
// 1
// Explanation
// Number of 1's in the array is more than 3/2 , Hence majority element is 1

import java.util.*;
public class Main {
    public static void main (String args[]) {
Scanner scn = new Scanner(System.in);
    	int n = scn.nextInt();
    	int[] arr = new int[n];
    	 for(int i = 0; i < n; i++) {
    	        arr[i] = scn.nextInt();
    	 }
    	 // n = arr.length;
    	 findmajority(arr,n);
	}
    	 public static void findmajority(int arr[],int n){
    		 int maxcount = 0;
    		 int index = 1;
    		 for(int i = 0; i < n; i++) {
    			 int count = 0;
    			 for(int j = 0; j < n; j++) {
    				 if(arr[i] == arr[j]) {
    					 count++;
    				 }
    			 }
    			 if(count>maxcount) {
    				 maxcount = count;
    				 index = i;
    			 }
    		 }
    		 if(maxcount>n/2) {
    			 System.out.println(arr[index]);
    		 }
    		 else {
    			 System.out.println("not found");
    		 }
    }
}
