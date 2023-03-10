// Given a string, count the number of distinct subsequences of it ( including empty subsequence ). For the uninformed, A subsequence of a string is a new string which is formed from the original string by deleting some of the characters without disturbing the relative positions of the remaining characters. For example, "AGH" is a subsequence of "ABCDEFGH" while "AHG" is not.

// Input Format
// First line of input contains an integer 't' denoting number of test cases.
// Next t lines contain a string each.

// Constraints
// 1<=t<=100
// 1<=length of s<=100000
// s will contain upper letters only.

// Output Format
// For each test case ,print ans%1000000007 in a new line each ,where ans is the number of distinct subsequences.

// Sample Input
// 2
// AAA
// ABCDEFG
// Sample Output
// 4
// 128
// Explanation
// For "AAA" , the distinct subsequences that can be formed are { '', 'A' , 'AA' , 'AAA }. So we print 4 , no of distinct subsequences.

import java.util.*;
public class Main {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
//         sc.readLine();
        String[] s = new String[t];
        for (int i = 0; i < t; i++) {
            s[i] = sc.nextLine();
        }
        for (int i = 0; i < t; i++) {
            System.out.println(countSub(s[i]));
        }
    }
    static final int MAX_CHAR = 256;
    static final int mod = 1000000007;
    static int countSub(String str)
    {
        int[] last = new int[MAX_CHAR];
        Arrays.fill(last, -1);
        int n = str.length();
        int[] dp = new int[n+1];
        dp[0] = 1;
        for (int i=1; i<=n; i++)
        {
            dp[i] = (2*dp[i-1])%mod;
            if (last[(int)str.charAt(i-1)] != -1)
                dp[i] = (dp[i]%mod - dp[last[(int)str.charAt(i-1)]%mod ] +mod)%mod;
            last[(int)str.charAt(i-1)] = (i-1);
        }

        return dp[n];
    }

    private static int count(String s, int i,int l) {
        if(i ==l)return 0;
        if(i ==l-1)return 2;
        int repitition = countOcc(s,s.charAt(i),0,i);
        return 2* count(s,i+1,l) - repitition;
    }

    private static int countOcc(String s, char charAt, int i, int i1) {
        int count =0;
        while(i!=i1){
            if(s.charAt(i) == charAt){
                count++;
            }
            i++;
        }
        return count;
    }
}
