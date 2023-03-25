// Help Lakshya bhaiya do prime factorization!!

// Input Format
// Take an input number num.

// Constraints
// n<=100,000

// Output Format
// Print its prime factors in a single line

// Sample Input
// 12
// Sample Output
// 2 2 3
// Explanation
// Warning!! match the spacing!!

import java.util.Scanner;
import java.lang.Math;

public class Main {
	
public static void primeFcators(int n) {
	while(n % 2 == 0) {
		System.out.print(2 + " ");
		n = n / 2;
	}
	for(int i = 3; i <= Math.sqrt(n); i += 2 ) {
		while(n % i ==0) { 
			
			System.out.print(i + " ");
			n = n / i;
		}
	}
  if(n > 2) {
	  System.out.print(n);
}
}
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();
	primeFcators(n);
}
}
