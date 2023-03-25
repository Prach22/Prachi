// You are given number of pages in n different books and m students. The books are arranged in ascending order of number of pages. Every student is assigned to read some consecutive books. The task is to assign books in such a way that the maximum number of pages assigned to a student is minimum.

// Input Format
// First line contains integer t as number of test cases. Next t lines contains two lines. For each test case, 1st line contains two integers n and m which represents the number of books and students and 2nd line contains n space separated integers which represents the number of pages of n books in ascending order.

// Constraints
// 1 < t < 50
// 1< n < 100
// 1< m <= 50
// 1 <= Ai <= 1000

// Output Format
// Print the maximum number of pages that can be assigned to students.

// Sample Input
// 1
// 4 2
// 12 34 67 90
// Sample Output
// 113 
// Explanation
// 1st students : 12 , 34, 67 (total = 113)
// 2nd students : 90 (total = 90)
// Print max(113, 90)

import java.util.*;
public class Main {
    public static void main(String args[]) {
      Scanner scn = new Scanner(System.in);
		 int t = scn.nextInt();
		 while(t > 0) {
			 int N = scn.nextInt();
			 int M = scn.nextInt();
			 int[]arr = new int[N];
			 for(int i =0; i < N; i++) {
				 arr[i] = scn.nextInt();
			 }
			 int sum = 0;
			 for(int i = 0; i < N; i++) {
				 sum = sum + arr[i];
			 }
			 int s = arr[N - 1];
			 int e = sum;
			 int result = Integer.MAX_VALUE;
			 while(s <= e) {
				 int std = 1;
				 int curSum = 0;
				 int mid = (s + e)/2;
				 for(int i = 0; i < N; i++) {
				 curSum = curSum + arr[i];
				 if(curSum > mid) {
					 std++;
					 curSum = arr[i];
				 }
			 }
				 if(std <= M) {
					 result = mid;
					  e = mid - 1;
				 } else {
					 s = mid + 1;
				 }
		 }
			 System.out.println(result);
			 t--;
	 }
	 }
}

