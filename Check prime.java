// Take as input a number N, print "Prime" if it is prime if not Print "Not Prime".

// Input Format
// Constraints
// 2 < N <= 1000000000

// Output Format
// Sample Input
// 3
// Sample Output
// Prime
// Explanation
// The output is case specific

import java.util.*;
public class Main {
    public static void main(String args[]) {
Scanner scn = new Scanner(System.in);
int n = scn.nextInt();
	int div = 1;
	int numfactor = 0;
	while (div <= n) {
		int rem = n % div;
		if (rem == 0) {
			numfactor = numfactor + 1;
		}
		div++;
	}
	if(numfactor==2){
		System.out.println("Prime");
	}else{
		System.out.println("Not Prime");
	}

    }
}
