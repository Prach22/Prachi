// Take as input S, a string. Write a function that removes all consecutive duplicates. Print the value returned.

// Input Format
// String

// Constraints
// A string of length between 1 to 1000

// Output Format
// String

// Sample Input
// aabccba
// Sample Output
// abcba
// Explanation
// For the given example, "aabccba", Consecutive Occurrence of a is 2, b is 1, and c is 2.

// After removing all of the consecutive occurences, the Final ans will be : - "abcba".

import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
         Scanner scn = new Scanner (System.in);
	        String s = scn.next();
	        System.out.println(RemoveDuplicates(s));
	    }
	    public static String RemoveDuplicates(String input)
	    {
	        if (input.length() <= 1)
	            return input;
	        if (input.charAt(0) == input.charAt(1))
	            return RemoveDuplicates(
	                    input.substring(1));
	        else
	            return input.charAt(0)
	                    + RemoveDuplicates(
	                    input.substring(1));
    }
}


