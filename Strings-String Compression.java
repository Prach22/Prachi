// Take as input S, a string. Write a function that does basic string compression. Print the value returned. E.g. for input “aaabbccds” print out a3b2c2ds.

// Input Format
// A single String S.

// Constraints
// A string of length between 1 to 1000

// Output Format
// The compressed String.

// Sample Input
// aaabbccds
// Sample Output
// a3b2c2ds
// Explanation
// In the given sample test case 'a' is repeated 3 times consecutively, 'b' is repeated twice, 'c' is repeated twice. But, 'd' and 's' occurred only once that's why we do not write their occurrence.

import java.util.*;
public class Main {
    public static void main(String args[]) {
     Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		Compression(str);
	}

	public static void Compression(String str) {
		String s = "";
		int count = 1;
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) != str.charAt(i + 1)) {

				if (count == 1) {
					s = s + str.charAt(i);
				} else {

					s = s + str.charAt(i) + count;
					count = 1;
				}
			} else {
				count++;
			}

		}
		if (count == 1) {
			s += str.charAt(str.length() - 1);
		} else {
			s = s + str.charAt(str.length() - 1) + count;
		}
		System.out.println(s);
    }
}
