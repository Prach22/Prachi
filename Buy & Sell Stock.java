// Consider an array for which on day i, ith element is the price of a given stock.
// we are permitted at most only one transaction(i.e buy one and sell one share of stock).Find the maximum profit.

// Note:Buying a stock is mandatory before selling.

// Input Format
// First line contains integer n as size of array. Next n lines contains n integer as element of array.

// Constraints
// None

// Output Format
// Print the maximum profit.

// Sample Input
// 6
// 7
// 1
// 5 
// 3 
// 6 
// 4
// Sample Output
// 5
// Explanation
// None

import java.util.*;
public class Main {
    public static void main (String args[]) {
  Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();
	int[] arr = new int[n];
	for(int i = 0; i<n;i++) {
	  arr[i] = scn.nextInt();
	}
	System.out.println(maxProfit(arr));
}
public static int maxProfit(int[] arr) {
	int min = Integer.MAX_VALUE;
	int profit1 = 0;
	for(int i = 0; i < arr.length; i++) {
		if(min > arr[i]) {
			min = arr[i];
		}
		int profit = arr[i] - min;
		if(profit>profit1) {
			profit1 = profit;
	}
		}
	
  return profit1;

    }
}
