// Farmer John has built a new long barn, with N (2 <= N <= 100,000) stalls. The stalls are located along a straight line at positions x1,…,xN (0 <= xi <= 1,000,000,000).

// His C (2 <= C <= N) cows don't like this barn layout and become aggressive towards each other once put into a stall. To prevent the cows from hurting each other, FJ wants to assign the cows to the stalls, such that the minimum distance between any two of them is as large as possible. What is the largest minimum distance?

// Input Format
// First line contains N and C, separated by a single space, representing the total number of stalls and number of cows respectively. The next line contains N integers containing the indexes of stalls.

// Constraints
// 2 <= N <= 100,000
// 0 <= xi <= 1,000,000,000
// 2 <= C <= N

// Output Format
// Print one integer: the largest minimum distance.

// Sample Input
// 5 3
// 1 2 8 4 9
// Sample Output
// 3
// Explanation
// Problem Credits - (Spoj)[http://www.spoj.com/problems/AGGRCOW/]

import java.util.*;
public class Main {
    public static void main(String args[]) {
   Scanner scn = new Scanner(System.in);
				int n = scn.nextInt();
				int c = scn.nextInt();
				int[] arr = new int[n];

				for (int i = 0; i < arr.length; i++) {
					arr[i] = scn.nextInt();
				}

				Arrays.sort(arr);

				Aggressive(arr, c);

			}

			public static void Aggressive(int[] arr, int c) {

				int low = 0;
				int high = arr[arr.length - 1];
				int max = 1;
				int mid;
				while (low < high) {
					mid = (low + high) / 2;

					if (Possible(arr, mid, c)) {
						if (max < mid) {
							max = mid;
						}
						low = mid + 1;
					} else {
						high = mid;
					}

				}

				System.out.println(max);
			}

			private static boolean Possible(int[] arr, int mid, int c) {

				int val = arr[0];
				int cows = 1;
				for (int i = 1; i < arr.length; i++) {
					if (arr[i] - val >= mid) {
						cows++;
						val = arr[i];
						if (c == cows) {
							return true;
						}
					}
				}

				return false;
            }
}
