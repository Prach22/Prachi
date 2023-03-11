// Take as input N, a number. Write a recursive function to find Nth triangle where 1st triangle is 1, 2nd triangle is 1 + 2 = 3, 3rd triangle is 1 + 2 + 3 = 6, so on and so forth. Print the value returned.

// Input Format
// Integer N is the single line of input.

// Constraints
// 1 <= N <= 100

// Output Format
// Print the output as a single integer which is the nth triangle.

// Sample Input
// 3
// Sample Output
// 6

import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		findNthTriangle(n,1,0);
	}

	private static void findNthTriangle(int n, int time, int ans) {
		if(n==0)
		{
			System.out.println(ans);
			return;
		}
		
		findNthTriangle(n-1,time+1,ans+time);

    }
}
