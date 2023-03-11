// Medium
// Difficulty
// 95
// Submissions
// 100
// Max Points
// Status: Accepted

// 100/100 Points
// Problem
// Submissions
// Leaderboard
// Discuss
// Take N as input. Print Nth Fibonacci Number, given that the first two numbers in the Fibonacci Series are 0 and 1.

// Input Format
// Constraints
// 0 <= N <= 1000

// Output Format
// Sample Input
// 10
// Sample Output
// 55
// Explanation
// The 0th fibonnaci is 0 and 1st fibonnaci is 1.
import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int i = 1;
		int a = 0;
		int b = 1;
		while (i <= num) {
			int c = a + b;
			//System.out.println(c);
			a = b;
			b = c;
			i++;
		}
		System.out.println(a);
    }
}
