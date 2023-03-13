// Take N (number of rows), print the following pattern (for N = 4).

//                        1           1
//                        1 2       2 1  
//                        1 2 3   3 2 1
//                        1 2 3 4 3 2 1   
// Input Format
// Constraints
// 0 < N < 10

// Output Format
// Sample Input
// 4
// Sample Output
// 1						1
// 1	2				2	1
// 1	2	3		3	2	1
// 1	2	3	4	3	2	1

import java.util.*;
public class Main {
    public static void main(String args[]) {
Scanner scn = new Scanner(System.in);
	int N = scn.nextInt();
	int nst = 1;
	int row = 1;
	int nsp = 2*N-3;
	int ntp = 1;
	int startby = 1;
	while(row <= N) {
	int cst1 = 0;
	ntp = startby;
	while(cst1 < nst) {
		System.out.print(ntp + "\t");
		cst1++;
		ntp++;
	}
     int csp = 0;
     while(csp < nsp) {
    	 System.out.print("\t");
    	 csp++;
     }
     int cst2 = 1;
 	ntp = startby;
 	if(row == N) {
 		cst2 = 2;
 	}
 	ntp = row;
 	if(row == N) {
 		ntp = row-1;
 	}
 	while(cst2 <= nst) {
 		System.out.print(ntp + "\t");
 		cst2++;
 		ntp--;
 	}
 	nsp = nsp-2;
 	row++;
 	nst++;
     System.out.println();
        }
    }
}
