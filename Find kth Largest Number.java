//  Find the kth largest element in an unsorted array.
// Note:It is the kth largest element in the sorted order, not the kth distinct element.

// Input Format
// First line contains integer n as size of array. Second line contains the value of k. Third line contains n integers as element of array.

// Constraints
// 1 ≤ k ≤ array's length.

// Output Format
// Print the kth largest element as output.

// Sample Input
// 6
// 2
// 3 2 1 5 6 4
// Sample Output
// 5

import java.util.*;
public class Main {
    public static void main (String args[]) {
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>();
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int i = 0;

		for (; i < k; i++) {
			heap.add(arr[i]);
		}

		while (i < n) {

			if (heap.peek() < arr[i]) {
				heap.poll();
				heap.add(arr[i]);
				i++;
			} else {
				i++;
			}

		}

		System.out.println(heap.peek());

    }
}
