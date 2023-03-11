// Take as input S, a string. Write a function that toggles the case of all characters in the string. Print the value returned.

// Input Format
// String

// Constraints
// Length of string should be between 1 to 1000.

// Output Format
// String

// Sample Input
// abC
// Sample Output
// ABc
// Explanation
// Toggle Case means to change UpperCase character to LowerCase character and vice-versa.

import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner scn = new Scanner(System.in);
	String str = scn.next();
	System.out.println(toggleCase(str));
  }
	public static String toggleCase(String str){

		
		String s = "";


		for (int i = 0; i < str.length(); i++) {
			
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				char uc = (char)(str.charAt(i) - 'a' + 'A'); 
				s = s+uc+"";
			} else{
				char lc = (char)(str.charAt(i) - 'A' + 'a');
				s = s+lc+"";
			}

		}

		return s;

    }
}
