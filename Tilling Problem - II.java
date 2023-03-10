// Given a floor of size n x m. Find the number of ways to tile the floor with tiles of size 1 x m . A tile can either be placed horizontally or vertically.

// Input Format
// First line of input contains an integer T denoting the number of test cases. Then T test cases follow.
// The first line of each test case contains two integers N and M.

// Constraints
// 1 <= T<= 1000
// 1 <= N,M <= 100000

// Output Format
// Print answer for every test case in a new line modulo 10^9+7.

// Sample Input
// 2
// 2 3
// 4 4
// Sample Output
// 1
// 2
import java.util.*;
public class Main {
    public static void main(String args[]) {
       Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            long dp[] = new long[100001];
            for (int i = 0; i < m; i++)
                dp[i] = 1;

            for (int i = m; i <= n; i++)
                dp[i] = (dp[i-1] + dp[i - m])%1000000007;

            System.out.println(dp[n]);
		}
}
}
