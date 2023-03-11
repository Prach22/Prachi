// Kartik Bhaiya, mentor at Coding Blocks, organized a party for their interns at Coding Blocks. In a party of N people, only one person is known to everyone. Such a person may be present in the party, if yes, she/he doesn’t know anyone in the party. We can only ask questions like “does A know B? “.
// Find the stranger (celebrity) in minimum number of questions.

// Input Format
// First line contains N, number of persons in party. Next line contains the matrix of N x N which represents A knows B when it's value is one.

// Constraints
// None

// Output Format
// Print the celebrity ID which is between 0 and N-1. If celebrity is not present then print "No Celebrity".

// Sample Input
// 4
// 0 0 1 0
// 0 0 1 0
// 0 0 0 0
// 0 0 1 0
// Sample Output
// 2
// Explanation
// In the given case there are 4 persons in the party let them as A, B, C, D. The matrix represents A knows B when it's value is one. From the matrix, A knows C, B knows C and D knows C. Thus C is the celebrity who doesnot know anyone and it's ID is 2. Hence output is 2.

import java.util.*;
public class Main {
    public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
		
		int size = scan.nextInt();
		
		int[][] arr1 = new int[size][size];
		
		for (int x = 0; x<size; x++) {
			
			for (int y = 0; y < size; y++)
				arr1[x][y] = scan.nextInt();

		}
		
		int answer = Kartik_Bhaiya_And_The_Celebrity_Problem(arr1, size);
		
		if (answer == -1)
			System.out.println("No Celebrity");
		
		else
			System.out.println(answer);

	}

	public static int Kartik_Bhaiya_And_The_Celebrity_Problem(int[][] arr1, int size) {
		
		Stack<Integer> st1 = new Stack<>();
		
		for (int x = 0; x < size; x++)
			st1.push(x);

		while (st1.size() > 1) {
			
			int a1 = st1.pop();
			
			int b1 = st1.pop();
			
			if (arr1[a1][b1] == 1)
				st1.push(b1);
			
		    else
				st1.push(a1);

		}
		
		int Celebrity_C = st1.pop();
		
		for (int x = 0; x < arr1.length; x++) {
			
			if (x == Celebrity_C)
				continue;
			
			if (arr1[Celebrity_C][x] == 1 || arr1[x][Celebrity_C] == 0)
				return -1;
			
		}

		return Celebrity_C;
    }
}
