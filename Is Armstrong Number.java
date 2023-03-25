// Take the following as input.

// A number
// Write a function which returns true if the number is an armstrong number and false otherwise, where Armstrong number is defined as follows.

// A positive integer of n digits is called an Armstrong number of order n (order is number of digits) if.

// abcd… = pow(a,n) + pow(b,n) + pow(c,n) + pow(d,n) + ….

// 1634 is an Armstrong number as 1634 = 1^4 + 6^4 + 3^4 + 4^4

// 371 is an Armstrong number as 371 = 3^3 + 7^3 + 1^3

// Input Format
// Single line input containing an integer

// Constraints
// 0 < N < 1000000000

// Output Format
// Print boolean output for each testcase.
// "true" if the given number is an Armstrong Number, else print "false".

// Sample Input
// 371
// Sample Output
// true
// Explanation
// Use functions. Write a function to get check if the number is armstrong number or not. Numbers are armstrong if it is equal to sum of each digit raised to the power of number of digits.

import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();
	System.out.println(isArm(n));
	// int n = 1000;
	//printArmTill(n);
}

  //public static void printArmTill(int n) {

	//for (int i = 1; i <= n; i++) {
	//	if (isArm(i)) {
		//	System.out.println(i);
		//}
	//}
//}

public static boolean isArm(int num) {
	int nod = numOfDig(num);
	int sum = 0;
	int back_up = num;
	while (num != 0) {
		int digit = num % 10;
		sum = sum + (int) Math.pow(digit, nod);

		num = num / 10;
	}
	if (sum == back_up) {
		return true;
	} else {
		return false;
	}
}

public static int numOfDig(int num) {
	int ans = 0;
	while (num != 0) {
		num = num / 10;
		ans++;
	}
	return ans;

}

}
