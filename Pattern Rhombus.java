// Take N (number of rows), print the following pattern (for N = 3).

//                          1
//                        2 3 2
//                      3 4 5 4 3
//                        2 3 2
//                          1
// Input Format
// Constraints
// 0 < N < 10

// Output Format
// Sample Input
// 3
// Sample Output
//    1
// 	2	3	2
// 3	4	5	4	3
// 	2	3	2
// 		1
// Explanation
// Each number is separated from other by a tab.

import java.util.*;
public class Main {
    public static void main(String args[]) {
  Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();
	int nr = 2*n-1;      // number of rows
	int nsp = n - 1;     //initializing number of spaces
	int num = 1;         //initializing number 
	int a = 0;           // this variable gives us the position till number
	int nst = 1 ;         //initializing number of numbers in a row
		for(int i = 1; i <= nr; i++) {
		a = i;
		if(i > n) {
			a = nr-i+1;
		}
		// work for space
		for(int csp = 1; csp <= nsp; csp++) {
			System.out.print("\t");
		}
		// work for numbers
		for(int cst = 1; cst <= nst; cst++) {
			System.out.print(num + "\t");
		if(cst < a) {
			num++;
		}else {
			num--;
		}
	}
		// preparation for next iteration
		if(i <= nr/2) {
			nsp = nsp-1;
			num += 2;
			nst += 2;
		}else {
			nsp = nsp + 1;
			nst -= 2;	
		}
		System.out.println();
		}
    }
}

