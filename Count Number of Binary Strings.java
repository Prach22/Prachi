// You are provided an integers N. You need to count all possible distinct binary strings of length N such that there are no consecutive 1’s.

// Input Format
// First line contains integer t which is number of test case. For each test case, it contains an integer n which is the the length of Binary String.

// Constraints
// 1<=t<=100 1<=n<=90

// Output Format
// Print the number of all possible binary strings.

// Sample Input
// 2
// 2
// 3
// Sample Output
// 3
// 5
// Explanation
// 1st test case : 00, 01, 10 2nd test case : 000, 001, 010, 100, 101

import java.util.*;
public class Main {
    public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
	        int t = scanner.nextInt();
	        for (int i = 0; i < t; i++) {
	            int n = scanner.nextInt();
	            long[] dp = new long[n + 3];
	            Arrays.fill(dp, -1);
	            System.out.println(sol(n + 2, dp));
	        }
	 }
    private static long sol(int n, long[] arr) {
        if (n == 0 || n == 1) {
            return n;
        }
        if (arr[n] != -1) {
            return arr[n];
        }
        long N_1 = sol(n - 1, arr);
        long N_2 = sol(n - 2, arr);

        long N = N_1 + N_2;
        return arr[n] = N;
    }
}
