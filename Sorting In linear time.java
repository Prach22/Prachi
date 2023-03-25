// Given an array having n elements representing balls of various colours like red, white or blue, sort them in-place so that balls of the same colour are adjacent, with the colours in the order red, white and blue.
// To represent the colour red, white, and blue we will use the integers 0, 1, and 2 respectively.
// Note:You are not suppose to use the sort function for this problem.

// Input Format
// First line contains integer n as size of array. Next n lines contains a single integer as element of array.

// Constraints
// None

// Output Format
// Print the balls in order so that balls of same colour are adjacent.

// Sample Input
// 6
// 2 0 2 1 1 0
// Sample Output
// 0 0 1 1 2 2 

import java.util.*;
public class Main {
    public static void main (String args[]) {
  Scanner sc= new Scanner (System.in);
		int n=sc.nextInt();
		int [] arr=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();	
		}
		linear(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}

	}
	public static void linear(int [] arr) {
		int i=0;
		int j=arr.length-1;
		int k=0;
		while(k<=j) {
			if(arr[k]==2) {
				int temp=arr[j];
				arr[j]=arr[k];
				arr[k]=temp;
				j--;
				
			}
			else if(arr[k]==0) {
				int temp=arr[i];
				arr[i]=arr[k];
				arr[k]=temp;
				i++;
				k++;
				
			}
			else {
				k++;
			}
		}
    }
}
