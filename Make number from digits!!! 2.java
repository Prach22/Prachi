// Take digits one by one and make a single number by concatenating them.

// Digits are given from Left Most place.

// Input Format
// First line contains total digits = num. Following lines contains digits starting from the Left Most place.

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
// 85314
// Explanation
// Self explanatory

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int num = scn.nextInt();
	int[] arr = new int[num];
	for(int i = 0; i < num; i++) {
		arr[i] = scn.nextInt();
	}
	for(int i = 0; i < num; i++) {
	System.out.print(arr[i]);
}
}
}
