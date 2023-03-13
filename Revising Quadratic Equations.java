// Given coefficients of a quadratic equation , you need to print the nature of the roots (Real and Distinct , Real and Equal or Imaginary) and the roots.
// If Real and Distinct , print the roots in increasing order.
// If Real and Equal , print the same repeating root twice
// If Imaginary , no need to print the roots.

// Note : Print only the integer part of the roots.

// Input Format
// First line contains three integer coefficients a,b,c for the equation ax^2 + bx + c = 0.

// Constraints
// -100 <= a, b, c <= 100

// Output Format
// Output contains one/two lines. First line contains nature of the roots .The next line contains roots(in non-decreasing order) separated by a space if they exist. If roots are imaginary do not print the roots. Output the integer values for the roots.

// Sample Input
// 1 -11 28
// Sample Output
// Real and Distinct
// 4 7
// Explanation
// The input corresponds to equation ax^2 + bx + c = 0. Roots = (-b + sqrt(b^2 - 4ac))/2a , (-b - sqrt(b^2 - 4ac))/2a

import java.util.*;
public class Main {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
	        int a, b, c, root1, root2, check;
	        a = sc.nextInt();
	        b = sc.nextInt();
	        c = sc.nextInt();

	        check = (b * b) - (4 * a * c);

	        if(check > 0){
	            root1 = (-b + (int)Math.sqrt(check))/ 2 * a;
	            root2 = (-b - (int)Math.sqrt(check))/ 2 * a;
	            System.out.println("Real and Distinct");
	            if(root1 > root2){
	                System.out.println(root2 + " " + root1);
	            }
	            else{
	                System.out.println(root1 + " " + root2);
	            }
	        }
	        else if(check < 0){
	            System.out.println("Imaginary");
	        }
	        else {
	            root1 = (-b + (int)Math.sqrt(check))/ 2 * a;
	            System.out.println("Real and Equal");
	            System.out.println(root1 + " " + root1);
	        }
    }
}

