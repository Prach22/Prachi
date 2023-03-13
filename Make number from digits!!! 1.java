// Take digits one by one and make a single number by concatenating them.

// Digits are given from 1's place.

// Input Format
// First line contains total digits = num. Following lines contains digits starting from 1's place

// Constraints
// 1<=num<=12

// 0<=digits<=9

// Output Format
// print the number in a single line

// Sample Input
// 5
// 8
// 5
// 3
// 1
// 4
// Sample Output
// 41358

import java.util.Scanner;

  public class Main {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int num = scn.nextInt();
	int i = 1; String ans ="";
	while(i <= num) {
		int digit = scn.nextInt();
		ans = digit + ans;
		i++;
	}
	System.out.println(ans);
}
}
