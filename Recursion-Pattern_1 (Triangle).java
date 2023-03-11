// Take as input N, a number. Print the following pattern. Can you do it recursively ?!

// Hint : Bigger Problem? Smaller Problem ? wrt pattern

// (for N =4)

// *

// * *

// * * *

// * * * *

// * * * * *

// Input Format
// Enter the value of N

// Constraints
// None

// Output Format
// Tab separated (*)

// Sample Input
// 5
// Sample Output
// *
// *	*
// *	*	*
// *	*	*	*
// *	*	*	*	*

import java.util.*;
public class Main {
    public static void main(String args[]) {
         Scanner sc= new Scanner(System.in);
	        int num=sc.nextInt();
	        RightStar(num);
	    }
		    public static void RightStar(int n){
		        for(int i=0; i<n; i++){
		            for(int j=0; j<=i; j++){
		                System.out.print("* ");
		            }
		            System.out.println();
		        }
		    }
		  
		}
