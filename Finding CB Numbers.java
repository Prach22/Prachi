// Deepak and Gautam are having a discussion on a new type of number that they call Coding Blocks Number or CB Number. They use following criteria to define a CB Number.

// 0 and 1 are not a CB number.
// 2,3,5,7,11,13,17,19,23,29 are CB numbers.
// Any number not divisible by the numbers in point 2( Given above) are also CB numbers.
// Deepak said he loved CB numbers.Hearing it, Gautam throws a challenge to him.

// Gautam will give Deepak a string of digits. Deepak's task is to find the number of CB numbers in the string.

// CB number once detected should not be sub-string or super-string of any other CB number.
// Ex- In 4991, both 499 and 991 are CB numbers but you can choose either 499 or 991, not both.

// Further, the CB number formed can only be a sub-string of the string.
// Ex - In 481, you can not take 41 as CB number because 41 is not a sub-string of 481.

// As there can be multiple solutions, Gautam asks Deepak to find the maximum number of CB numbers that can be formed from the given string.

// Deepak has to take class of Launchpad students. Help him by solving Gautam's challenge.

// Input Format
// First line contain size of the string.

// Next line is A string of digits.

// Constraints
// 1 <= Length of strings of digits <= 17

// Output Format
// Maximum number of CB numbers that can be formed.

// Sample Input
// 5
// 81615
// Sample Output
// 2
// Explanation
// 61 and 5 are two CB numbers.

import java.util.*;
public class Main {
    
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		String str=sc.next();
		
		printSubString(str);
		
	}

	private static void printSubString(String str) {
		
		boolean[] vis= new boolean[str.length()];				
		int count=0;											
		for (int len = 1; len <= str.length(); len++)
		{
			for(int j=len;j<=str.length();j++)
			{
				int i=j-len;							
				String s = str.substring(i,j);
				long num = Long.parseLong(s);
				if(isCBNumber(num)==true && isVisited(i, j-1, vis))
				{
					count++;
					for (int k = i; k < j; k++) {
						vis[k]=true;					
					}
				}
					
			}	
		}
		
		System.out.println(count);
	}
	
	
	public static boolean isCBNumber(long n)
	{
		if(n==0 || n==1)
			return false;
		
		int[] arr = {2,3,5,7,11,13,17,19,23};
		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i]==n)
				return true;
		}
		
		for (int i = 0; i < arr.length; i++) {
			if(n%arr[i]==0)
				return false;
		}
		
		return true;	
	}
	
	
	public static boolean isVisited(int i, int j, boolean[] vis)
	{
		for (int k = i; k <=j ; k++) {
			if(vis[k]==true)
				return false;
		}
		
		return true;
	}
}
