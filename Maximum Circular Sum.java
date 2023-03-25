// You are provided n numbers (both +ve and -ve). Numbers are arranged in a circular form. You need to find the maximum sum of consecutive numbers.

// Input Format
// First line contains integer t which is number of test case.
// For each test case, it contains an integer n which is the size of array and next line contains n space separated integers denoting the elements of the array.

// Constraints
// 1<=t<=100
// 1<=n<=1000
// |Ai| <= 10000

// Output Format
// Print the maximum circular sum for each testcase in a new line.

// Sample Input
// 1
// 7
// 8 -8 9 -9 10 -11 12
// Sample Output
// 22
// Explanation
// Maximum Circular Sum = 22 (12 + 8 - 8 + 9 - 9 + 10)

import java.util.*;
public class Main {
    public static void main(String args[]) {
   Scanner sc = new Scanner(System.in);
	        int t = sc.nextInt();
	        while(t-- > 0){
	            int m = sc.nextInt();
	            int[] a = new int[m];
	            for(int i = 0 ; i < m ; i++){
	                a[i] = sc.nextInt();
	            }
	            System.out.println(maxCircularSum(a , m));
	        }
	    }

	    public static int maxCircularSum(int a[], int n)
	    {
	        if (n == 1)
	            return a[0];
	        int sum = 0;
	        for (int i = 0; i < n; i++) {
	            sum += a[i];
	        }
	        int curr_max = a[0], max_so_far = a[0],
	                curr_min = a[0], min_so_far = a[0];
	        for (int i = 1; i < n; i++)
	        {
	            curr_max = Math.max(curr_max + a[i], a[i]);
	            max_so_far = Math.max(max_so_far, curr_max);
	            curr_min = Math.min(curr_min + a[i], a[i]);
	            min_so_far = Math.min(min_so_far, curr_min);
	        }
	        if (min_so_far == sum) {
	            return max_so_far;
	        }
	        return Math.max(max_so_far, sum - min_so_far);
    }
}
