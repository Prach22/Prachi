// Take N (number of rows), print the following pattern (for N = 4).

//                        1 
//                      2 3 2
//                    3 4 5 4 3
//                  4 5 6 7 6 5 4
// Input Format
// Constraints
// 0 < N < 10

// Output Format
// Sample Input
// 4
// Sample Outpu
//      1
// 		2	3	2
// 	3	4	5	4	3
// 4	5	6	7	6	5	4
// Explanation
// Each number is separated from other by a tab.

import java.util.*;
public class Main {
    public static void main(String args[]) {
Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int start_bye = 1;
		int nsp = n - 1;
		int nst = 1;
		int row = 1;
		int ntp = 1;
		while (row <= n) {

			int csp = 0;
			while (csp < nsp) {
				System.out.print("  ");
				csp++;
			}

			ntp = start_bye;
			int cst = 0;
			while (cst < nst) {
//				System.out.print(ntp+"\t");

				System.out.print(ntp + " ");
				cst++;
				if (cst <= nst / 2) {
					ntp++;
				} else {
					ntp--;
				}

			}

			nst = nst + 2;
			nsp--;
			row++;
			start_bye++;
			System.out.println();
		}
    }
}

