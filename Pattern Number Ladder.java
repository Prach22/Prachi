// Take N (number of rows), print the following pattern (for N = 4)

// 1
// 2 3
// 4 5 6
// 7 8 9 10

// Input Format
// Constraints
// 0 < N < 100

// Output Format
// Sample Input
// 4
// Sample Output
// 1  
// 2	3  
// 4	5	6  
// 7	8	9	10
// Explanation
// Each number is separated from other by a tab.
import java.util.*;
public class Main {
    public static void main(String args[]) {
       
        Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int ntp = 1;
		int row = 1;
		int nst = 1;
		while(row <= N) {
			int cst = 0;
			while(cst < nst) {
				System.out.print(ntp + "\t");
				cst++;
				ntp++;
			}
			row++;
			nst++;
			System.out.println();
		}
    }
}


