// Take as input str, a string. The string contains a single pair of parenthesis “(..)”. Write a recursive function which returns the contents between the parenthesis. E.g. for “xyz(abc)def” return “abc”. Print the value returned.

// Input Format
// Enter the string

// Constraints
// None

// Output Format
// Display the content between the parenthesis

// Sample Input
// abc(x)
// Sample Output
// x

import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		printTextInParenthesis(str,"",0);
		
		
	}
	
	public static void printTextInParenthesis(String ques,String ans,int opening) {
		
		if(ques.length() == 0) {
			return;
		}
		char c = ques.charAt(0);
		
		if(c != '('&&opening==0) {
			printTextInParenthesis(ques.substring(1), ans,opening);
		}else if(c == '(') {
			printTextInParenthesis(ques.substring(1), ans, 1);
		}
		if(c !=')'&&opening==1) {
		printTextInParenthesis(ques.substring(1), ans+c, opening);
		}
		if(c == ')') {
			
			System.out.println(ans);
			return;
		}
		
	}
}
