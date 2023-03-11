// Given a positive integer, find maximum integer possible by doing at-most K swap operations on its digits.

// Input Format
// Two positive integers N and K where N denotes the number on which swaps are supposed to be performed and K denotes the maximum swaps available.

// Constraints
// 0 <= N <= 10^12 0 <= K <= 10

// Output Format
// Single Maximum integer possible by doing at-most K swap operations on digits of N

// Sample Input
// 254 1
// Sample Output
// 524


import java.util.*;
public class Main {
    public static void main (String args[]) {
  Scanner scn = new Scanner(System.in);
		String n = scn.next();
		int k = scn.nextInt();
		String max = maxNum(n, k, n);
		System.out.println(max);
		
	}
	
	public static String maxNumWithKswaps(char[] charr, int k, String max) {
		
		if(k==0) {
			return max;
		}
		
		for(int i = 0; i<charr.length-1; i++) {
			for(int j = i+1; j<charr.length; j++) {
				if(charr[i]<charr[j]) {
					swap(charr, i, j);
					String str = String.valueOf(charr);
					if(str.compareTo(max) > 0)
						max = str;
					max = maxNumWithKswaps(charr, k-1, max);
					swap(charr, i, j);
				}
			}
		}
		return max;
		
	}
	
	public static void swap(char[] charr, int i, int j) {
		char temp = charr[i];
		charr[i] = charr[j];
		charr[j] = temp;
	}
	
	public static String maxNum(String str, int k, String max) {
		if(k==0)
			return max;
		for(int i = 0; i < str.length()-1; i++) {
			for(int j = i+1; j<str.length(); j++) {
				if(str.charAt(i)<str.charAt(j)) {
					str = swap(str, i, j);
					if(str.compareTo(max)>0) {
						max = str;
					}
					max = maxNum(str, k-1, max);
					str = swap(str, i, j);
				}
			}
		}
		return max;
	}
		
	public static String swap(String str, int i, int j) {
		return str.substring(0, i) + str.charAt(j) + str.substring(i+1, j) + str.charAt(i) + str.substring(j+1);
    }
    }
