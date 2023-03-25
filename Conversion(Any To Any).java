// Take sb (source number system base), db (destination number system base) and sn (number in source format). Write a function that converts sn to its counterpart in destination number system. Print the value returned.

// Input Format
// Constraints
// 0 < N <= 1000000000
// sb and db <= 10

// Output Format
// Sample Input
// 8
// 2 
// 33
// Sample Output
// 11011
// Explanation
// All input output is as integers and in separate lines.

import java.util.*;
public class Main {
    public static void main(String args[]) {
  Scanner scn = new Scanner(System.in);
	int sb = scn.nextInt();
	int db = scn.nextInt();
	long num = scn.nextLong();
	int a = 1;
	long ans = 0;
	while(num!=0) {
		long dig = num % 10;
		ans = ans + dig * a;
		a = a * sb;
		num = num / 10;
	}
	long dec = ans;
	int p = 0;
	int b = 1;
	while(ans != 0) {
		p = (int) (p + (ans % db)*b);
		b= b*10;
		ans = ans/db;
	}
	System.out.println(p);
    }
}
