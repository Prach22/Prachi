// Given a binary number ,help Von Neuman to find out its decimal representation. For eg 000111 in binary is 7 in decimal.

// Input Format
// The first line contains N , the number of binary numbers. Next N lines contain N integers each representing binary represenation of number.

// Constraints
// N<=1000 Digits in binary representation is <=16.

// Output Format
// N lines,each containing a decimal equivalent of the binary number.

// Sample Input
// 4
// 101
// 1111
// 00110
// 111111
// Sample Output
// 5
// 15
// 6
// 63
// Explanation
// For binary number fedcba , Decimal number = f * 25 + e * 24 + d * 23 + …..+ a * 20.

import java.util.*;
public class Main {
    public static void main(String args[]) {
Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();
	int i =0;
	while(i<n){
		int num = scn.nextInt();
		int ans =0;
		int mult = 1;
		while(num!=0){
			int digit = num%10;
			num = num/10;
			ans = ans+digit*mult;
			mult = mult*2;
		}
		System.out.println(ans);
		i++;
	}
}
}
