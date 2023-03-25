// Take N as input. For a value of N=7, we wish to draw the following pattern :

//                             1 
//                         2 1   1 2 
//                     3 2 1       1 2 3 
//                 4 3 2 1           1 2 3 4 
//                     3 2 1       1 2 3 
//                         2 1   1 2 
//                             1 
// Input Format
// Take N as input.

// Constraints
// N is odd number.

// Output Format
// Pattern should be printed with a space between every two values.

// Sample Input
// 7
// Sample Output
//             1 
//         2 1   1 2 
//     3 2 1       1 2 3 
// 4 3 2 1           1 2 3 4 
//     3 2 1       1 2 3 
//         2 1   1 2 
//             1 
// Explanation
// Catch the pattern and print it accordingly.

import java.util.*;
public class Main {
    public static void main(String args[]) {
Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();
	int row = 1;
	int nsp = n-1;
	int nst = 1;
	int nspp = 1;
	int nstt = 1;
	while(row <= n) {
		int csp = 1;
		while(csp <= nsp) {
			System.out.print("  ");
			csp++;
		}
		int cst = 1;
		int x = nst;
		while(cst <= nst) {
			System.out.print(x + " ");
			cst++;
			x--;
		}
		int cspp = 3;
		while(cspp <= nspp) {
			System.out.print("  ");
			cspp++;
		}
		int cstt = 1;
		if(row == 1||row == n)
			{cstt = 2;}
		while(cstt <= nstt) {
			System.out.print(cstt + " ");
			cstt++;
		}
		if(row <= n/2) {
			nsp = nsp - 2;
			nst++;
			nspp = nspp+2;
			nstt++;
		}
		else 
		{
			nsp = nsp + 2;
			nst--;
			nspp = nspp - 2;
			nstt--;
		}
		row++;
		System.out.println();
	}
    }
}

