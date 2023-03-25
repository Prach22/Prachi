// Given an array of patterns containing only I’s and D’s. I for increasing and D for decreasing. Devise an algorithm to print the minimum number following that pattern. Digits from 1-9 and digits can’t repeat.

// Input Format
// The First Line contains an Integer N, size of the array. Next Line contains N Strings separated by space.

// Constraints
// 1 ≤ T ≤ 100 1 ≤ Length of String ≤ 8

// Output Format
// Print the minimum number for each String separated by a new Line.

// Sample Input
// 4
// D I DD II
// Sample Output
// 21
// 12
// 321 
// 123
// Explanation
// For the Given sample case, For a Pattern of 'D' print a decreasing sequence which is 2 1.

import java.util.*;
public class Main {
    public static void main(String args[]) {
   Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        sc.nextLine();
	        String[] array = sc.nextLine().split(" ");
	        for (String str : array) {
//	            formMinNumberSeq(str);
	            formMinNumberSeqStack(str);
	        }
	    }

	    // Solution Using loop
	    private static void formMinNumberSeq(String str) {
	        int[] ans = new int[str.length() + 1];
	        int count = 1;
	        for (int i = 0; i <= str.length(); i++) {
	            if (i == str.length() || str.charAt(i) == 'I') {
	                ans[i] = count;
	                count++;
	                int j = i - 1;
	                while (j >= 0 && str.charAt(j) == 'D') {
	                    ans[j] = count;
	                    count++;
	                    j--;
	                }
	            }
	        }
	        for (int answer : ans) {
	            System.out.print(answer);
	        }
	        System.out.println();
	    }

	    // Solution Using Stack
	    private static void formMinNumberSeqStack(String string) {
	        Stack<Integer> stack = new Stack<>();
	        for (int i = 0; i <= string.length(); i++) {
	            stack.push(i + 1);
	            if (i == string.length() || string.charAt(i) == 'I') {
	                while (!stack.isEmpty()) {
	                    System.out.print(stack.pop());
	                }
	            }
	        }
	        System.out.println();
    }
}
