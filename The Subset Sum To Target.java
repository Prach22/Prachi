// Given a set of "n" non-negative integers, and a value "sum", determine if there is a subset of the given set with sum equal to given sum.

// Input Format
// 1st Line: n sum 2nd Line: a1 a2……an (Array Values)

// Constraints
// 1<= n <= 1000
// 1<= sum <= 10^5
// 1<= Ai <=10^4

// Output Format
// Yes, if sum exist No, it sum does not exist

// Sample Input
// 5 10
// 1 2 3 4 5
// Sample Output
// Yes
import java.util.*;
public class Main {
    public static void main(String args[]) {
  Scanner s = new Scanner(System.in);

			int n = s.nextInt();
			int target = s.nextInt();

			int[] a = new int[n];

			for(int i = 0; i < n; ++i)
			{
				a[i] = s.nextInt();
			}
			boolean[][] mem =new boolean[n+1][target + 1];
			

			for(int i = 0; i <= n; ++i)
			{
				mem[i][0] = true;
			}

			for(int i = 1; i <= n; ++i)
			{
				for(int j = 1; j <= target; ++j)
				{
					if(a[i - 1] > j)
					{
						mem[i][j] = mem[i - 1][j];
					}
					else
					{
						mem[i][j] = (mem[i-1][j-a[i-1]] || mem[i-1][j]);
					}
				}
			}

			if(mem[n][target])
			{
				System.out.print("Yes");
			}
			else
			{
				System.out.print("No");
			}
    }
}
