// A Boston number is a composite number, the sum of whose digits is the sum of the digits of its prime factors obtained as a result of prime factorization (excluding 1 ). The first few such numbers are 4,22 ,27 ,58 ,85 ,94 and 121 . For example, 378 = 2 × 3 × 3 × 3 × 7 is a Boston number since 3 + 7 + 8 = 2 + 3 + 3 + 3 + 7. Write a program to check whether a given integer is a Boston number.

// Input Format
// There will be only one line of input:N , the number which needs to be checked.

// Constraints
// 1 < N < 2,147,483,647 (max value of an integer of the size of 4 bytes)

// Output Format
// 1 if the number is a Boston number. 0 if the number is a not Boston number.

// Sample Input
// 378
// Sample Output
// 1
// Explanation
// Self Explanatory

import java.util.*;
public class Main {
    public static void main(String args[]) {
Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();
	int org = n;
	int i = 2;
	int count = 0;
	int a = 0;
	while(i <= n) {
		while(n % i == 0) {
			if(i < 10) {
				count = count + i;
			} else {
				int num = i;
				int ans = 0;
				while(num != 0) {
					int digit = num % 10;
					ans = ans + digit;
					num = num/10;
				}
				count = count + ans;
			}
			n = n/i;
		}
		i++;
	}
	//if(n>2) {
	//System.out.println(n);}
	//System.out.println(count);
	int num = org;
	int ans = 0;
	while(num != 0) {
		int digit = num % 10;
		ans = ans + digit;
	//	System.out.println(ans);
		num = num/10;
	}
	//System.out.println(ans);
   if(ans == count) {
	   System.out.println("1");
   }else {
	   System.out.println("0");
   }
    }
}
