// Given a series of N Integers, check if it is possible to split sequence into two sequences -
// s1 to si and si to sN such that first sequence is strictly decreasing and second is strictly increasing. Print true/false as output.

// Input Format
// First line contains a single integer N denoting the number of elements int the series.
// Next N lines contain a single integer each denoting the elements of the array S.

// Constraints
// 0 < N < 1000 Each number in sequence S is > 0 and < 1000000000

// Output Format
// Print boolean output - "true" or "false" defining whether the sequence is increasing - decreasing or not.

// Sample Input
// 5 
// 1 
// 2 
// 3 
// 4 
// 5
// Sample Output
// true
// Explanation
// Carefully read the conditions to judge which all sequences may be valid. Don't use arrays or lists.

import java.util.*;
public class Main {
    public static void main(String args[]) {
Scanner scn = new Scanner(System.in);
	int N = scn.nextInt();
	int[] S = new int[N];
	for(int i = 0;i<N;i++){
		S[i] = scn.nextInt();
	}
	int i = 0;
	while(i<N-1 && S[i]>S[i+1]){
		i++;
	}
	while(i<N-1 && S[i]<S[i+1]){    
		i++;
	}
	if(i==N-1){
		System.out.println("true");
	}
	else{
		System.out.println("false");
    }

    }
}


