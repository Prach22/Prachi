// Now Lakshya bhaiya want to apply make up on the previous prime factorization question. He only wants to know unique prime factors.

// Help him factorize the number while only printing unique prime factors

// Input Format
// Take an input number num.

// Constraints
// n<=1,000,000

// Output Format
// Print its Unique prime factors in a single line

// Sample Input
// 252
// Sample Output
// 2 5 7
// Explanation
// 2 * 2 * 3 * 3 * 7 = 252

import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();
	for(int i = 2; i < n; i++) {
		while(n % i == 0) {
			System.out.print(i + " ");
			n = n/i;
		}
	}
	if(n>2) {
		System.out.println(n);
	}
}
}
