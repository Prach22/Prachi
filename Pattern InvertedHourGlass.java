// Take N as input. For a value of N=5, we wish to draw the following pattern :

//              5                   5 
//              5 4               4 5 
//              5 4 3           3 4 5 
//              5 4 3 2       2 3 4 5 
//              5 4 3 2 1   1 2 3 4 5 
//              5 4 3 2 1 0 1 2 3 4 5 
//              5 4 3 2 1   1 2 3 4 5 
//              5 4 3 2       2 3 4 5 
//              5 4 3           3 4 5 
//              5 4               4 5 
//              5                   5 
// Input Format
// Take N as input.

// Constraints
// Output Format
// Pattern should be printed with a space between every two values.

// Sample Input
// 5
// Sample Output
// 5                   5 
// 5 4               4 5 
// 5 4 3           3 4 5 
// 5 4 3 2       2 3 4 5 
// 5 4 3 2 1   1 2 3 4 5 
// 5 4 3 2 1 0 1 2 3 4 5 
// 5 4 3 2 1   1 2 3 4 5 
// 5 4 3 2       2 3 4 5 
// 5 4 3           3 4 5 
// 5 4               4 5 
// 5                   5 

import java.util.*;
public class Main {
    public static void main(String args[]) {
Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();
	int nsp = 2*n - 1;
	int nr = 2*n + 1;
	int num = n;
	int a = 0;
	for(int i = 1; i <= nr; i++) {
		if(i > n + 1)
			a = nr-i+1;
		else
			a= i;
		for(int cst = 1;cst <= a; cst++) {
			System.out.print(num + " ");
			num--;
			
		}
		for(int csp = 1;csp <= nsp; csp++) {
			System.out.print(" ");
	} 
		for(int cst = 1;cst <= a; cst++) {
			num++;
			if(num!=0)
			System.out.print(" " + num);
}
		if(i <= (nr) / 2)
			nsp -= 2;
		else
			nsp += 2;
		System.out.println();
}
    }
}
