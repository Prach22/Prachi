// Take as input S, a string. Write a function that returns the character with maximum frequency. Print the value returned.

// Input Format
// String

// Constraints
// A string of length between 1 to 1000.

// Output Format
// Character

// Sample Input
// aaabacb
// Sample Output
// a
// Explanation
// For the given input string, a appear 4 times. Hence, it is the most frequent character.

import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
         Scanner scn = new Scanner(System.in);
	        String str = scn.next();
	        System.out.println(highestOccurringCharacter(str));
	    }
	public static char highestOccurringCharacter(String str) {
        int[] frequency = new int[256];
        int maxFrequency = 0;
        for (int i = 0; i < str.length(); i++) {
            frequency[str.charAt(i)]++;
            maxFrequency = Math.max(maxFrequency, frequency[str.charAt(i)]);
        }
        char answer = '\0';

        for (int i = 0; i < str.length(); i++) {
            if (frequency[str.charAt(i)] == maxFrequency) {
                answer = str.charAt(i);
                break;
            }
        }
        return answer;
    }
}
