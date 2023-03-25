// Deepak has a limited amount of money that he can spend on his girlfriend. So he decides to buy two roses for her. Since roses are of varying sizes, their prices are different. Deepak wishes to completely spend that fixed amount of money on buying roses for her.
// As he wishes to spend all the money, he should choose a pair of roses whose prices when summed up are equal to the money that he has.
// Help Deepak choose such a pair of roses for his girlfriend.

// NOTE: If there are multiple solutions print the solution that minimizes the difference between the prices i and j. After each test case, you must print a blank line.

// Input Format
// The first line indicates the number of test cases T.
// Then, in the next line, the number of available roses, N is given.
// The next line will have N integers, representing the price of each rose, a rose that costs less than 1000001.
// Then there is another line with an integer M, representing how much money Deepak has.
// There is a blank line after each test case.

// Constraints
// 1≤ T ≤100
// 2 ≤ N ≤ 10000
// Price[i]<1000001

// Output Format
// For each test case, you must print the message: ‘Deepak should buy roses whose prices are i and j.’, where i and j are the prices of the roses whose sum is equal do M and i ≤ j. You can consider that it is always possible to find a solution. If there are multiple solutions print the solution that minimizes the difference between the prices i and j.

// Sample Input
// 2
// 2
// 40 40
// 80

// 5
// 10 2 6 8 4
// 10
// Sample Output
// Deepak should buy roses whose prices are 40 and 40.
// Deepak should buy roses whose prices are 4 and 6.
// Explanation
// Find two such kinds of price of roses which has sum up to equal to Deepak's Money.

import java.util.*;
public class Main {
    public static void main(String args[]) {
   Scanner s = new Scanner(System.in);
     int no_test_cases = s.nextInt();
     while(no_test_cases > 0){
         int arr_len = s.nextInt();
         int [] inp_arr = new int[arr_len];
         for (int i = 0; i < arr_len; i++) {
             inp_arr[i] = s.nextInt();
         }
         int amount = s.nextInt();
         pairOfRosesV2(inp_arr, amount);

         no_test_cases --;
     }
 }

 public static void pairOfRosesV1(int[] roses, int target) {
     int R1 = 0;
     int R2 = 0;
     int ans_diff = Integer.MAX_VALUE;
     for (int i = 0; i < roses.length; i++) {
         for (int j = i + 1; j < roses.length; j++) {
             if ((roses[i] + roses[j]) == target) {
                 int diff = Math.abs(roses[i] - roses[j]);
                 if (diff < ans_diff) {
                     ans_diff = diff;
                     R1 = Math.min(roses[i], roses[j]);
                     R2 = Math.max(roses[i], roses[j]);
                 }

             }
         }

     }
     System.out.println("Deepak should buy roses whose prices are " + R1 + " " + R2 + ".");


 }

 public static void pairOfRosesV2(int[] roses, int target) {
     Arrays.sort(roses);
     int left_idx = 0;
     int right_idx = roses.length - 1;
     int rose1 = 0;
     int rose2 = 0;
     while (left_idx < right_idx) {
         int sum = roses[left_idx] + roses[right_idx];
         if (sum == target) {
             rose1 = roses[left_idx];
             rose2 = roses[right_idx];
             left_idx++;
             right_idx--;
         }
         if (sum > target) {
             right_idx--;
         }
         if (sum < target) {
             left_idx++;
         }
     }
     System.out.println("Deepak should buy roses whose prices are " + rose1 + " and " + rose2 + ".");

    }
}
