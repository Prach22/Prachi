// Take N (number of rows), print the following pattern (for N = 5)
// 1
// 2 2
// 3 0 3
// 4 0 0 4
// 5 0 0 0 5

// Input Format
// There will be an integer in input.

// Constraints
// 0 < N < 100

// Output Format
// Print the pattern.

// Sample Input
// 5
// Sample Output
// 1  
// 2	2  
// 3	0	3    
// 4	0	0	4  
// 5	0	0	0	5
// Explanation
// Each number is separated from other by a tab.If row number is n (>1), total character is n. First and last character is n and rest are 0.

import java.util.*;
public class Main {
    public static void main(String args[]) {
  Scanner sc = new Scanner(System.in); //Taking rows value from the user       
        int n = sc.nextInt();  
        int row = 1;
        int nst = 1;
        int start_byte =1;
        while(row<=n)  {
        	int ntp = start_byte;
        	int cst = 0;
        	while(cst<nst) {
        		if(row == cst+1) {
        			System.out.print(ntp);
        		}else if(cst == 0) {
        			System.out.print(ntp + "\t");
        		}else {
        			System.out.print(0 + "\t");
        		}
        		cst++;
        	}
        	start_byte++;
        	nst++;
        	System.out.println();
        	row++;
    }
    }
}

