// You are provided a sequence of number. All numbers of that sequence is in increasing order (including 1) and whose only prime factors are 2, 3 or 5 (except 1). You need to find the nth number of that sequence.

// Input Format
// First line contains integer t which is number of test case. For each test case, it contains an integer n.

// Constraints
// 1<=t<=100 1<=n<=10000

// Output Format
// Print nth number of that sequence.

// Sample Input
// 2
// 7
// 10
// Sample Output
// 8
// 12
// Explanation
// Sequence : 1, 2, 3, 4, 5, 6, 8, 9, 10, 12, …..

import java.util.*;
public class Main {
    public static void main(String args[]) {
 Scanner scn = new Scanner(System.in);
	        int t = scn.nextInt();
	        while(t-- > 0) {
	            int n = scn.nextInt();
	            System.out.println(ugly(n));
	        }
	    }

	    public static long ugly(int n) {
	        long[] dp = new long[n + 1];
	        int i2 = 0, i3 = 0, i5 = 0;
	        long next_multiple_of_2 = 2;
	        long next_multiple_of_3 = 3;
	        long next_multiple_of_5 = 5;
	        long next_ugly_no=1;
	        dp[0] = 1;
	        for (int i = 1; i < n; i++) {
	            next_ugly_no = Math.min(next_multiple_of_2, Math.min(next_multiple_of_3, next_multiple_of_5));
	            dp[i]=next_ugly_no;
	            if(next_multiple_of_2==next_ugly_no) {
	                i2++;
	                next_multiple_of_2=dp[i2]*2;
	            }
	            if(next_multiple_of_3==next_ugly_no) {
	                i3++;
	                next_multiple_of_3=dp[i3]*3;
	            }
	            if(next_multiple_of_5==next_ugly_no) {
	                i5++;
	                next_multiple_of_5=dp[i5]*5;
	            }
	        }
	        return next_ugly_no;
    }
}
