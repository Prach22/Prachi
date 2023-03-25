// You are given 2 numbers (N , M); the task is to find N√M (Nth root of M).

// Input Format
// First line contains a single integer T denoting the number of test cases. Next T lines contains tow integers N and M

// Constraints
// 1 <= T <= 200
// 2 <= N <= 20
// 1 <= M <= 10^9+5

// Output Format
// For each test case, in a new line, print an integer denoting Nth root of M if the root is an integer else print -1.

// Sample Input
// 2
// 2 9
// 3 9
// Sample Output
// 3
// -1

import java.util.Scanner;

   public class Main {
  public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int t = scn.nextInt();
	while(t > 0) {
		int N = scn.nextInt();
		int M = scn.nextInt();
		int e = M;
		int s = 1;
		int res = -1;
		while(s <= e) {
			int mid = (s-e)/2 + e;
			int mul = (int)Math.pow(mid, N);
			if(mul == M) {
				res = mid;
				break;
			}
			if(mul < M) {
				s = mid + 1;
			}else if(mul > mid) {
				e = mid - 1;
			}
		}
		System.out.println(res);
		t--;
	}
}
}

