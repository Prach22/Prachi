// Given number of rows N, you have to print a Hollow Rhombus. See the output for corresponding given input.

// Input Format
// Single integer N.

// Constraints
// N <= 20

// Output Format
// Print pattern.

// Sample Input
// 5
// Sample Output
//     *****
//    *   *
//   *   *
//  *   *
// *****
// Explanation
// For any input N. First line contains 4 space and then 5 {*} and then the second line contains according to the output format.
import java.util.*;
public class Main {
    public static void main(String args[]) {
Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int numst = n;
		int numsp = n-1;
		int row = 1;
		while(row <= n) {
			int csp = 0;
			while(csp<numsp) {
				System.out.print(" ");
				csp++;
			}
			int cst = 0;
			while(cst<numst) {
				
				if(row == 1 || row == n|| cst == 0 || cst == numst - 1) {
				System.out.print("*");
			
		} else {
			System.out.print(" ");
		}
				cst++;
	}
	 row++;
	 numsp--;
	 System.out.println();
    }
    }
}

