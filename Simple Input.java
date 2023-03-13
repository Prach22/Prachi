// Given a list of numbers, stop processing input after the cumulative sum of all the input becomes negative.

// Input Format
// A list of integers to be processed

// Constraints
// All numbers input are integers between -1000 and 1000.

// Output Format
// Print all the numbers before the cumulative sum become negative.

// Sample Input
// 1
// 2
// 88
// -100
// 49
// Sample Output
// 1
// 2
// 88

import java.util.*;
public class Main {
    public static void main(String args[]) {
{
    
		Scanner scn = new Scanner(System.in);
		int n ;
		int sum = 0;
		while(scn.hasNextInt())
		{
			n = scn.nextInt();
			sum = sum + n;
			if(n > -1000 && n < 1000)
			{if(sum >= 0)
			{System.out.println(n);
			}
			else
			{
				break;
			}
			}
		}
	
}
    }
}
