// You are given a running data stream of n integers. You read all integers from that running data stream and find effective median of elements read so far in efficient way. All numbers are unique in the datastream. Print only the integer part of the median.

// Input Format
// First line contains integer t as number of test cases. Each test case contains following input. First line contains integer n which represents the length of the data stream and next line contains n space separated integers.

// Constraints
// 1 < t < 100
// 1< n < 10000

// Output Format
// Print the effective median of running data stream..

// Sample Input
// 1
// 6
// 5 15 1 3 2 8
// Sample Output
// 5 10 5 4 3 4
// Explanation
// Iteration 1 : Array = {5} Median = 5

// Iteration 2 : Array = {5,15} Median = (5+15)/2 = 10

// Iteration 3 : Array = {1,5,15} Median = 5

// Iteration 4 : Array = {1,3,5,15} Median = (3+5)/2 = 4
// Iteration 5 : Array = {1,2,3,5,15} Median = 3
// Iteration 6 : Array = {1,2,3,5,8,15} Median = (3+5)/2 = 4

import java.util.*;
public class Main {
    public static void main(String args[]) {
   Scanner s = new Scanner(System.in);

	        int t = s.nextInt();

	        while(t-- != 0)
	        {
	            int n = s.nextInt();

	            int[] a = new int[n];

	            PriorityQueue<Integer> minH = new PriorityQueue<Integer>();
	            PriorityQueue<Integer> maxH = new PriorityQueue<Integer>(Collections.reverseOrder());
	            int median = 0;
	            for (int i = 0; i < a.length; i++) {
	                a[i] = s.nextInt();
	            }
			
			printMedian(a);
	            System.out.println();
	        }
	    }

	     public static void swap(int[] ar, int i , int j) 
	     {
	        int t = ar[i];
	        ar[i] = ar[j];
	        ar[j] = t;
	    }

	    public static void printMedian(int[] a) {

	        int med = a[0];
	        PriorityQueue<Integer> smaller = new PriorityQueue<>(Collections.reverseOrder());
	        PriorityQueue<Integer> greater = new PriorityQueue<>();

	        smaller.add(a[0]);
	        System.out.print(med + " ");

	        for (int i = 1; i < a.length; i++) {

	            int x = a[i];
	            if (smaller.size() > greater.size()) {
	                if (x < med) {
	                    greater.add(smaller.remove());
	                    smaller.add(x);
	                } else
	                    greater.add(x);
	                med = (smaller.peek() + greater.peek()) / 2;
	            }
	            else if (smaller.size() == greater.size()) {
	                if (x < med) {
	                    smaller.add(x);
	                    med = smaller.peek();
	                } else {
	                    greater.add(x);
	                    med = greater.peek();
	                }
	            }
	            else {
	                if (x > med) {
	                    smaller.add(greater.remove());
	                    greater.add(x);
	                } else
	                    smaller.add(x);
	                med = (smaller.peek() + greater.peek()) / 2;

	            }
	            System.out.print(med + " ");
	        }
    }
}
