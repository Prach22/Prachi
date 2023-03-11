// Take as input N, a number. Write a recursive function which prints counting from 0 to N in lexicographical order. In lexicographical (dictionary) order 10, 100 and 109 will be printed before 11.

// Input Format
// Enter a number N.

// Constraints
// None

// Output Format
// Display all the numbers upto N in a lexicographical order

// Sample Input
// 10
// Sample Output
// 0 1 10 2 3 4 5 6 7 8 9 

import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		Recursion_Lexicographical_Order(0, num);

	}
	 public static void Recursion_Lexicographical_Order(int curr, int num) {
			if (curr > num) {
				return;
			}
			System.out.print(curr+" ");
			int x = 0;
			if (curr == 0) {
				x = 1;
			}
			while(x <= 9){
				Recursion_Lexicographical_Order(curr * 10 + x, num);
				x++;
			}
    }
}
