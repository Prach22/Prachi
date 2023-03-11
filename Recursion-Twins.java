// Take an input str, a string. A “twin” is defined as two instances of a char separated by a char. E.g. "AxA" the A's make a “twin”. “twins” can overlap, so "AxAxA" contains 3 “twins” - 2 for A and 1 for x. Write a function which recursively counts number of “twins” in a string. Print the value returned.

// Input Format
// Enter the string

// Constraints
// None

// Output Format
// Display the number of twins

// Sample Input
// AXAXA
// Sample Output
// 3

import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner scn = new Scanner(System.in);
		String str = scn.next();
		int i = 0;
		int count = 0;
		twins(str, i, count);

	}

	public static void twins(String str, int i, int count) {
		if (i == str.length()-2) {
			System.out.println(count);
			return;
		}
		if (str.charAt(i) == str.charAt(i + 2)) {
