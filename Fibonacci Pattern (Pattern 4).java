// Take N (number of rows), print the following pattern (for N = 4)
// 0
// 1 1
// 2 3 5
// 8 13 21 34

// Input Format
// Constraints
// 0 < N < 100

// Output Format
// Sample Input
// 4
// Sample Output
// 0 
// 1    1 
// 2    3     5 
// 8   13    21    34
// Explanation
// Each number is separated from other by a tab. For given input n, You need to print n(n+1)/2 fibonacci numbers. Kth row contains , next k fibonacci numbers.

import java.util.*;
public class Main {
    public static void main(String args[]) {
Scanner scn = new Scanner(System.in);
  int n = scn.nextInt();
  int a = 0;
  int b = 1;
  for(int i = 1; i <= n; i++) {
	  for(int j = 1; j <= i; j++) {
	  System.out.print(a + "\t");
	  int c = a + b;
	  a = b;
	  b = c;
  }
	  System.out.println();
}
    }
}

