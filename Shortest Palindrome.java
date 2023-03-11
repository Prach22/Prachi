// Given a string s, you are allowed to convert it to a palindrome by adding characters in front of it. Find and return the shortest palindrome you can find by performing this transformation.

// Input Format
// Take input String s

// Constraints
// length of String <10000

// Output Format
// print the shortest palindrome string

// Sample Input
// aacecaaa
// Sample Output
// aaacecaaa

import java.util.*;
public class Main {
    public static void main (String args[]) {
  Scanner in = new Scanner(System.in);
		Main sp = new Main();
		String s = in.next();
		System.out.println(sp.Main(s));
	}

 public String Main(String s) {
 	char[] string = s.toCharArray();
     int start = 0;
     int end = string.length - 1;
     while (start < end) {
     	if (isPalindrome(string, start, end)) {
     		break;
     	} 
     	end--;
     }

     char[] front = new char[string.length - end - 1];        
     for (int i = 0, j = string.length - 1; i < front.length && j > end; i++, j--) {
     	front[i] = string[j];
     }

     return new String(front) + new String(string);
 }

 public boolean isPalindrome(char[] string, int start, int end) {
 	while (start < end) {
 		if (string[start] == string[end]) {
 			start++;
 			end--;
 		} else {
 			return false;
 		}
 	}
 	return true;
    }
}
