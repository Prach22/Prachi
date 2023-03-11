//   Take as input N, a number. Print the following pattern (for N = 5)

//        *    *   *   *   *   
//        *    *   *   *
//        *    *   *
//        *    *   
//        *    
// Input Format
// Enter value of N

// Constraints
// None

// Output Format
// Tab separated (*)

// Sample Input
// 5
// Sample Output
// *	*	*	*	*	
// *	*	*	*	
// *	*	*	
// *	*	
// *	

import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		inverted_Triangle(n);
	}

	public static void inverted_Triangle(int n) {
		if (n == 0) {
			return;
		}
		for (int i = 0; i < n; i++) {
			System.out.print("*\t");
		}
		System.out.println();
		inverted_Triangle(n - 1);
    }
}
