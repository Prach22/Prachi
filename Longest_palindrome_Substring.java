//A regular palindrome is a string of numbers or letters that is the same forward as backward. For example, the string "ABCDEDCBA" is a palindrome because it is the same when the string is read from left to right as when the string is read from right to left.

//A substring is a contiguous sequence of characters within a string. For instance, "the best of" is a substring of "It was the best of times".

//Now the question is, given a string, find the longest substring which is a palindrome.

//Input Format
// first line represents the number of testcases t The second line represents Input string

//Constraints
//1<=t<=100
//1<=string.length<=1000

//Output Format
//Longest palindromic substring Print length of the substring in next line

//Sample Input
//2
//ababbagh
//ilovecodinggnidoc
//Sample Output
//abba
//4
//codinggnidoc
//12


import java.util.*;
public class Main {
   public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        sc.nextLine();
        while(testCase-- > 0){
        longestPalindromeSubstring(sc.nextLine());
        }
	}
	static void longestPalindromeSubstring(String str) {
	    int n = str.length();
	    boolean dp[][] = new boolean[n][n]; 
	    
	    for(int i = 0; i < n ; i++)
	        dp[i][i] = true; 
	   
	    int start = 0 ; 
	    int maxLength = 1; 
	    for(int i = 0; i < n - 1; i++){
	        if(str.charAt(i) == str.charAt(i + 1)) {
	            dp[i][i + 1] = true;
	           if(maxLength < 2) {
	            maxLength = 2 ; 
	            start = i ; 
	           }
	        }
	    }
	    for(int len = 3; len <= n; len++) {
	        for(int i = 0; i < n - len + 1; i++) {
	            int j = i + len - 1 ; 
	            if(dp[i + 1][j - 1] && str.charAt(i) == str.charAt(j)) {
	                dp[i][j] = true;
	                if(maxLength < len){
	                    maxLength = len ; 
	                    start = i ; 
	                }
	            }
	        }
	    }
	    System.out.println(str.substring(start, start + maxLength)); 
	    System.out.println(str.substring(start, start + maxLength).length());
	}
}
