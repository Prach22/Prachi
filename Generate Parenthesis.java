// Given an integer 'n'. Print all the possible pairs of 'n' balanced parentheses.
// The output strings should be printed in the sorted order considering '(' has higher value than ')'.

// Input Format
// Single line containing an integral value 'n'.

// Constraints
// 1<=n<=11

// Output Format
// Print the balanced parentheses strings with every possible solution on new line.

// Sample Input
// 2
// Sample Output
// ()() 
// (()) 

import java.util.*;
public class Main {
    public static void main(String args[]) {
  Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		generateParenthesis(n, 0, 0, "");
	}
	
	public static void generateParenthesis(int n, int sp, int ep, String ans) {
		if(sp == n && ep == n) {
			System.out.println(ans);
			return;
		}
		if(sp>n || ep>sp)
			return;
			generateParenthesis(n, sp, ep+1, ans + ')');
			generateParenthesis(n, sp+1, ep, ans + "(");
    }
}
