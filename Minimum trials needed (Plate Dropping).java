//   Aakash has K identical plates and N floors. He needs to find the lowest floor at which the plate will break down aka critical floor. However, he doesn't like climbing stairs again and again. So he decided to take your help. Help him design a strategy that would tell him the minimum no of trials he need to perform for knowing the critical floor.

// Assume that plate will only break at critical floor and floors higher than that.

// _Hint :
// _Recursion tells u what u intend to calculate._
// Test case 3 is only for students who think that the test cases are easy.

// Input Format
// The first line contains T, the number of test cases.
// Next T line follows 2 space separated integers, first being the number of plates K, next being the number of floors N.

// Constraints
// 0 < T < 10
// 0 < K < 2
// 0 < N < 10

// Output Format
// T lines of required answer

// Sample Input
// 1
// 2 3
// Sample Output
// 2
// Explanation
// Aakash can start dropping plates from floor 1, 2 or 3.

// Consider floor 1 :

// If the plate breaks, critical floor is floor 1 else he moves to floor 2 and repeat the process. By this method minimum no of trials to know the critical floor are 3.
// Consider he starts with 2nd floor.

// Now if the plate breaks, the number of floors left to be checked is 1, floor 1. If it doesn't break, then floors to be tested is floor 3. In both the cases the number of trials are 2. So Akash will start from floor 2


import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int k = sc.nextInt();
			int f = sc.nextInt();
			System.out.println(TDMinimum_trials_needed_Plate_Dropping(k, f, new int[k + 1][f + 1]));
		}

	}

	public static int TDMinimum_trials_needed_Plate_Dropping(int k, int f, int dp[][]) {
		if (f == 0 || f == 1) {
			return f;
		}
		if (k == 1) {
			return f;
		}
		if (dp[k][f] != 0) {
			return dp[k][f];
		}
		int ans = Integer.MAX_VALUE;
		for (int e = 1; e <= f; e++) {
			int tem = 1 + Math.max(TDMinimum_trials_needed_Plate_Dropping(k - 1, e - 1, dp),
					TDMinimum_trials_needed_Plate_Dropping(k, f - e, dp));
			ans = Math.min(tem, ans);
  }
		return dp[k][f] = ans;

	}
    }
    

    

