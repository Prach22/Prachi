// Take as input S, a string. Write a function that replaces every even character with the character having just higher ASCII code and every odd character with the character having just lower ASCII code. Print the value returned.

// Input Format
// String

// Constraints
// Length of string should be between 1 to 1000.

// Output Format
// String

// Sample Input
// abcg
// Sample Output
// badf

import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc= new Scanner (System.in);
		String str= sc.next();
		Strings_Odd_Even( str);

	}
	public static void Strings_Odd_Even(String str) {
		String ans="";
		for (int i=0;i<str.length();i++) {
			char ch =str.charAt(i);
			if ((i+1)%2==0) {
				ans= ans+ (char) (str.charAt(i)-1);
				
			}
			else{
				ans= ans+ (char) (str.charAt(i)+1);
			}
		}
		System.out.println(ans);
    }
}

