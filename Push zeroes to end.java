// You are given an integer array of size N .
// You have to push all zeroes to the end of the array and order of rest of the elements remains same .

// Input Format
// First Line contains an integer N .
// Second Line consists of an integer array .

// Constraints
// 1 < = N < = 104

// Output Format
// print all elements of the array after pushing all zeroes to end , the numbers should be separated by a space.

// Sample Input
// 5
// 2 3 0 0 1
// Sample Output
// 2 3 1 0 0
// Explanation
// Initial array : [2,3,0,0,1]
// array after pushing all zeroes to end is : [2,3,1,0,0]

import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
        int [] arr = new int [n];     
        		for(int i = 0; i < n; i++) {
        			arr[i] = scn.nextInt();
        		}
        int temp = 0;        
        for (int i = 0; i < arr.length; i++) {     
            for (int j = i+1; j < arr.length; j++) {     
               if(arr[i] < arr[j]) {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }    
            
        System.out.println();    
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");    
        }    
    }
}
