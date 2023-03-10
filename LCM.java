// Take the following as input.

// A number (N1)
// A number (N2)
// Write a function which returns the LCM of N1 and N2. Print the value returned.

// Input Format
// Constraints
// 0 < N1 < 1000000000
// 0 < N2 < 1000000000

// Output Format
// Sample Input
// 4 
// 6
// Sample Output
// 12
// Explanation
// The smallest number that is divisible by both N1 and N2 is called the LCM of N1 and N2.

import java.util.*;
public class Main {
    public static void main(String args[]) {
Scanner scn = new Scanner(System.in);
	int N1 = scn.nextInt();
	int N2 = scn.nextInt();
	int divisor = N1;
	int dividend = N2;
	int lcm;
	while (divisor != 0) {
		int rem = dividend % divisor;
		dividend = divisor;
		divisor = rem;
	}
	//System.out.println(dividend);
	 lcm = N1*N2/dividend;
	 
	System.out.println(lcm);
    }
}
