// Take as input str, a string. Write a recursive function which prints all the words possible by rearranging the characters of this string which are in dictionary order larger than the given string.
// The output strings must be lexicographically sorted.

// Input Format
// Single line input containing a string

// Constraints
// Length of string <= 10

// All characters are unique

// Output Format
// Display all the words which are in dictionary order larger than the string entered in a new line each. The output strings must be sorted.

// Sample Input
// cab

// Sample Output
// cba
// Explanation
// The possible permutations of string "cab" are "abc" , "acb" ,"bac" , "bca" , "cab" and "cba" . Only one of them is lexicographically greater than "cab". We only print "cba".

import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner scn = new Scanner(System.in);
		String str = scn.next();
		String str_sorted = sortString(str);
		dictionaryOrderLarger(str, str_sorted, "");

	}
	
	public static String sortString(String str) {
		char[] ch_arr = new char[str.length()];
		for(int i = 0; i<str.length(); i++) {
			ch_arr[i] = str.charAt(i);
		}
		Arrays.sort(ch_arr);
		return new String(ch_arr);
	}
	
	public static void dictionaryOrderLarger(String str, String str_sort, String ans){
		if(str_sort.length()==0) {
			if(isLarger(str, ans))
				System.out.println(ans);
			return;
		}
		
		for(int i = 0; i<str_sort.length(); i++) {
			char ch = str_sort.charAt(i);
			String roq = str_sort.substring(0, i) + str_sort.substring(i+1);
			dictionaryOrderLarger(str, roq, ans+ch);
		}
	}
	
	public static boolean isLarger(String str, String ans) {
		for(int i = 0; i<str.length(); i++) {
			if(ans.charAt(i) < str.charAt(i))
				return false;
			if(ans.charAt(i) > str.charAt(i))
				return true;
		}
		return false;
    }
}
