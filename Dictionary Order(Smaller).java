// Take as input str, a string. Write a recursive function which returns all the words possible by rearranging the characters of this string which are in dictionary order smaller than the given string. The output strings must be lexicographically sorted.

// Input Format
// Single line input containing a string

// Constraints
// Length of string <= 10

// All characters are unique

// Output Format
// Display all the words which are in dictionary order smaller than the string entered in a new line each. The output strings must be sorted.

// Sample Input
// cab
// Sample Output
// abc
// acb
// bac
// bca
// Explanation
// The possible permutations of string "cab" are "abc" , "acb" ,"bac" , "bca" , "cab" and "cba" . Only four of them are lexicographically less than "cab". We print them in lexicographical order.

import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
	String s = sc.next();
	ArrayList<String> li = new ArrayList<>();
	allpermutation(s,"", li, s);
	Collections.sort(li);
	for(String st : li)
		System.out.println(st);
}
public static void allpermutation(String ques, String ans, List<String> li, String s)
{
	if(ques.length()==0)
	{
		if(s.compareTo(ans) > 0)
			li.add(ans);
		return;
	}
	for(int i = 0; i<ques.length() ; i++)
	{
		char ch= ques.charAt(i);
		String ros= ques.substring(0,i)+ ques.substring(i+1);
		allpermutation(ros, ans+ch, li, s);
	}
    }
}
