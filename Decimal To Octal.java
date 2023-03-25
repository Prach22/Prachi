// Take N (number in decimal format). Write a function that converts it to octal format. Print the value returned.

// Input Format
// Constraints
// 0 < N <= 1000000000

// Output Format
// Sample Input
// 63
// Sample Output
// 77
// Explanation
// Both input and output are integers

import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
	int N = scn.nextInt();
	int [] octalNum = new int[100];
	int i = 0;
	while (N != 0){
		octalNum[i] = N % 8;
		N = N/8;
		i++;
	}
	for(int j = i - 1; j >= 0; j--)
		System.out.print(octalNum [j]);
    }
}
