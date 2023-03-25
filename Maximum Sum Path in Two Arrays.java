// You are provided two sorted arrays. You need to find the maximum length of bitonic subsequence. You need to find the sum of the maximum sum path to reach from beginning of any array to end of any of the two arrays. You can switch from one array to another array only at common elements.

// Input Format
// First line contains integer t which is number of test case. For each test case, it contains two integers n and m which is the size of arrays and next two lines contains n and m space separated integers respectively.

// Constraints
// 1<=t<=100 1<=n,m<=100000

// Output Format
// Print the maximum path.

// Sample Input
// 1
// 8 8
// 2 3 7 10 12 15 30 34
// 1 5 7 8 10 15 16 19
// Sample Output
// 122
// Explanation
// 122 is sum of 1, 5, 7, 8, 10, 12, 15, 30, 34

import java.util.*;
public class Main {
    public static void main(String args[]) {
  Scanner sc=new Scanner(System.in);

	        int t=sc.nextInt();

	        while(t-- > 0){
	            int m = sc.nextInt();
	            int n = sc.nextInt();
	            int arr[] = new int[m];
	            int a[] = new int[n];
	            for(int i=0;i<m;i++)
	                arr[i]=sc.nextInt();
	            for(int i=0;i<n;i++)
	            {
	                a[i]=sc.nextInt();
	            }
	            int ma=maxPathSum(arr,a,m,n);
	            System.out.println(ma);
	        }
	    }

	    static int max(int p, int q)
	    {
	        return (p > q) ? p : q;
	    }


	    static int maxPathSum(int a1[], int a2[], int m, int n)
	    {
	        int i = 0, j = 0;
	        int result = 0, sum1 = 0, sum2 = 0;
	        while (i < m && j < n) {

	            if (a1[i] < a2[j])
	                sum1 += a1[i++];
	            else if (a1[i] > a2[j])
	                sum2 += a2[j++];
	            else {
	                result += max(sum1, sum2) + a1[i];
	                sum1 = 0;
	                sum2 = 0;
	                i++;
	                j++;
	            }
	        }


	        while (i < m)
	            sum1 += a1[i++];

	        while (j < n)
	            sum2 += a2[j++];
	        result += max(sum1, sum2);

	        return result;
    }
}
