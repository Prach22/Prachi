// Take an input str, a string. Write a recursive function which returns a new string in which all duplicate consecutive characters are separated by a ‘ * ’. E.g. for “hello” return “hel*lo”. Print the value returned

// Input Format
// Enter a String

// Constraints
// 1<= Length of string <= 10^4

// Output Format
// Display the resulting string (i.e after inserting (*) b/w all the duplicate characters)

// Sample Input
// hello
// Sample Output
// hel*lo
// Explanation
// We insert a "*" between the two consecutive 'l' .

import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		duplicateCharacterFormatting(str, "");
	}

	private static void duplicateCharacterFormatting(String str, String asf) {

		if (str.equals("")) {
			System.out.println(asf);
			return;
		}

		char ch = str.charAt(0);
		String ros = str.substring(1);

		if (!ros.equals("") && ch == ros.charAt(0)) {
			duplicateCharacterFormatting(ros, asf + ch+"*");
		} else {
			duplicateCharacterFormatting(ros, asf + ch);
		}
    }
}
