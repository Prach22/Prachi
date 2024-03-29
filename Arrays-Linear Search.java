// Take as input N, the size of an array. Take N more inputs and store that in an array. Take another number’s input as M. Write a function which returns the index on which M is found in an array, in case M is not found -1 is returned. Print the value returned.

// It reads a number N.
// 2.Take Another N numbers as an input and store them in an Array.
// Take another number M as an input.
// If M is found in the Array the index of M is returned else -1 is returned and print the value returned.
// Input Format
// Constraints
// N cannot be Negative. Range of Numbers can be between -1000000000 to 1000000000. M can be between -1000000000 to 1000000000.

// Output Format
// Sample Input
// 5
// 2
// 4
// 6
// 9
// 17
// 17
// Sample Output
// 4
// Explanation
// Given array = {2, 4, 6, 9, 17}. Target number = 17. Index = 4.

import java.util.*;
public class Main {
    public static void main(String args[]) {
         
	    int counter, num, item, array[];
	      //To capture user input
	      Scanner input = new Scanner(System.in);
	      num = input.nextInt(); 
	      array = new int[num]; 
	      for (counter = 0; counter < num; counter++)
	        array[counter] = input.nextInt();
	      item = input.nextInt();

	      for (counter = 0; counter < num; counter++)
	      {
	         if (array[counter] == item) 
	         {
	           System.out.println(counter);
	           break;
	         }
	      }
	      if (counter == num)
	        System.out.println(-1);
	   }
}
