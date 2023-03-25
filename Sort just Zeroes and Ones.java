// Sort just 0 and 1

// Input Format
// A line containing N number of 0s and 1s Next line follows a long sequence of 0 and 1 seperated by space

// Constraints
// N will not exceed 10^7

// Output Format
// Sorted Sequence

// Sample Input
// 7
// 1 0 0 1 1 0 1
// Sample Output
// 0 0 0 1 1 1 1


import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		for(int i = 0;i<N;i++) {
			arr[i] = sc.nextInt();
		}
		int numZeros = 0, numOnes = 0;
		for(int i = 0;i<N;i++) {
			if(arr[i] == 0) {
				numZeros++;
			}
			else {
				numOnes++;
			}
		}
		int arr_new[] = new int[N];
		for(int i = 0;i<numZeros;i++) {
			arr_new[i] = 0;
		}
		for(int i = numZeros;i<N;i++) {
			arr_new[i] = 1;
		}
		for(int i = 0;i<N;i++) {
			System.out.print(arr_new[i]+" ");
		}
    }
}
