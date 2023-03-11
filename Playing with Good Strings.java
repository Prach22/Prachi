// A Good String is a string which contains only vowels (a,e,i,o,u) . Given a string S, print a single positive integer N where N is the length of the longest substring of S that is also a Good String.

// Note: The time limit for this problem is 1 second, so you need to be clever in how you compute the substrings.

// Input Format
// A string 'S'

// Constraints
// Length of string < 10^5

// Output Format
// A single positive integer N, where N is the length of the longest sub-string of S that is also a Good String.

// Sample Input
// cbaeicde
// Sample Output
// 3
// Explanation
// Longest good substring is "aei"

import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
         Scanner sc = new Scanner(System.in);
        String st = sc.next();
        System.out.println(goodSubString(st));
    }

    static int goodSubString(String str){
        int max_len = 0;
        int max_len_now = 0;
        int i = 0;
        while (i < str.length()){
            char ch = str.charAt(i);

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                max_len_now++;
                if(max_len_now > max_len){
                    max_len = max_len_now;
                }
            }
            else {
                max_len_now = 0;
            }
            i++;
        }
        return max_len;
    }
}
