// Take as input str, a string. We are concerned with all the possible ascii-subsequences of str. E.g. “ab” has following ascii-subsequences “”, “b”, “98”, “a”, “ab”, “a98”, “97”, “97b”, “9798”

// a. Write a recursive function which returns the count of ascii-subsequences for a given string. Print the value returned.

// b. Write a recursive function which prints all possible ascii-subsequences for a given string (void is the return type for function).

// Input Format
// Enter the string

// Constraints
// None

// Output Format
// Display the number of ASCII-subsequences and display all the ASCII- subsequences

// Sample Input
// ab
// Sample Output
//  b 98 a ab a98 97 97b 9798
// 9

import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
       Scanner scn=new Scanner(System.in);
		String str=scn.next();
		printAsciiSubsequences(str, "");
		System.out.println();
		System.out.println(countAsciiSubsequences(str));
		scn.close();

	}
	public static void printAsciiSubsequences(String ques,String ans) {
		if(ques.length()==0) {
			System.out.print(ans+" ");
			return;
		}
		
		char ch=ques.charAt(0);
		String roq=ques.substring(1);
		printAsciiSubsequences(roq, ans);
		printAsciiSubsequences(roq, ans+ch);
		printAsciiSubsequences(roq, ans+(int)ch);
	}
	public static int countAsciiSubsequences(String ques) {
		if(ques.length()==0) {
			return 1;
		}
		String roq=ques.substring(1);
		int x=countAsciiSubsequences(roq);
		int y=countAsciiSubsequences(roq);
		int z=countAsciiSubsequences(roq);
		return x+y+z;
    }
}
