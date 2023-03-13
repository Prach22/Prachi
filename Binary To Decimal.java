// Take N (number in binary format). Write a function that converts it to decimal format and Print the value returned.

// Input Format
// Constraints
// 0 < N <= 1000000000

// Output Format
// Sample Input
// 101010
// Sample Output
// 42
// Explanation
// For binary number fedcba , Decimal number = f * 25 + e * 24 + d * 23 + …..+ a * 20.

import java.util.*;
public class Main {
    public static void main(String args[]) {
Scanner scn = new Scanner(System.in);
	int N = scn.nextInt();
int t =N;
int i = 0;
int dec = 0;
	while(t>0){
		int rem = t % 10;
		t = t/10;
		dec = dec+rem*(int)Math.pow(2,i);
		i++;
		}
		System.out.println(dec);
	}
}
