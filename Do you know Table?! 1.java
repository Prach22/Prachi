// Help Lakshya Bhaiya recite tables of an input number x to the limit y.

// Print all the multiples of x till y.

// Note : y is inclusive

// Input Format
// Take two inputs, x and y

// Constraints
// 1<=x<=10,000 1<=y<=10,000

// Output Format
// each line contains the table of the number x

// Sample Input
// 13 50
// Sample Output
// 13
// 26
// 39
// Explanation
// TABLE!!!!!!!!!

import java.util.*;
 public class Main{
public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		int y = scn.nextInt();
		int count = 1;
		while(x * count <= y) {
			System.out.println(x * count);
			count++;
		}
	}

	
}


