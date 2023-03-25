// Given an integer N, print Pascal Triangle upto N rows. 

// Input Format
// Single integer N.

// Constraints
// N <= 10

// Output Format
// Print pascal triangle.

// Sample Input
// 4
// Sample Output
//        1
//      1   1
//    1   2   1
//  1   3   3   1
// Explanation
// Last row has one " "

import java.util.*;
public class Main {
    public static void main(String args[]) {
Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();
	for(int line = 1; line <= n; line++) {
		for(int j = 0; j <= n-line; j++) {
			System.out.print(" ");
		}
		int c = 1;
		for(int i = 1; i <= line; i++) {
			System.out.print(c + " ");
			c = c * (line-i)/i;
		}
		System.out.println();
	}
    }
}
