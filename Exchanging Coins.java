// Tughlaq introduces a strange monetary system. He introduces copper coins and each coin has a number written on it. A coin n can be exchanged in a bank into three coins: n/2, n/3 and n/4. A coin can also be sold for gold. One can get as much grams of gold as the number written on the coin. You have one copper coin. What is the maximum weight of gold one can get from it?

// Input Format
// The input file contains a single integer n, the number on the coin.

// Constraints
// 0 <= n <= 1 000 000 000

// Output Format
// Print the maximum weight of gold you can get.

// Sample Input
// 12
// Sample Output
// 13

import java.util.*;
public class Main {
   public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        long n = sc.nextLong();
	        map = new HashMap<>();
	        System.out.println(maxProfit(n));
	    }
	 private static HashMap<Long, Long> map;

	    private static long maxProfit(long n) {
	        if (map.get(n) != null)
	            return map.get(n);
	        if (n < 12)
	            return n;
	        long x = maxProfit(n / 2) + maxProfit(n / 3) + maxProfit(n / 4);
	        map.put(n, Math.max(x, n));
	        return map.get(n);
    }
}
