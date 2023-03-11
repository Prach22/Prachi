// Take as input str, a string. Write a recursive function that checks if the string was generated using the following rules and returns a Boolean value:
// 1. the string begins with an 'a'
// 2. each 'a' is followed by nothing or an 'a' or "bb"
// 3. each "bb" is followed by nothing or an 'a' Print the value returned.

// Input Format
// Enter the String

// Constraints
// None

// Output Format
// Display the boolean result

// Sample Input
// abba
// Sample Output
// true

import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
          Scanner sc = new Scanner(System.in);
	        String s= sc.next();
	        boolean b= Solve(s);
	        System.out.print(b);
	        sc.close();
	    }

	    private static boolean Solve(String s) {
	        if (s.length()==0) {
	            return true;
	        }
	        if (s.charAt(0)=='a') {
	            if (s.length()==1) {
	                return true;
	            }
	            if (s.charAt(1)=='a') {
	                return Solve(s.substring(1));
	            }
	            else if(s.length()>=3 &&s.charAt(1)=='b'&&s.charAt(2)=='b'){
	                return Solve(s.substring(3));
	                
	            }else{
	                return false;
	            }
	        }
	            
	        return false;   
    }
}
