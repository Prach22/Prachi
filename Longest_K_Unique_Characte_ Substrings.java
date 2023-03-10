// Given a string you need to print the size of the longest possible substring that has exactly k unique characters.
// Note:- If there is no possible substring print -1.

// Input Format
// The first line of input contains an integer T denoting the no of test cases .Each test case contains two lines . The first line of each test case contains a string s and the next line conatains an integer k.

// Constraints
// 1<=T<=100
// 1<=k<=10

// Output Format
// For each test case in a new line print the required output.

// Sample Input
// 2
// aaaa
// 1
// qmb
// 6
// Sample Output
// 4
// -1

  import java.util.*;
public class Main {
    public static void main (String args[]) {
   Scanner sc=new Scanner(System.in);
	        int t=sc.nextInt();
	        while(t-- >0)
	        {
	            String str=sc.next();
	            int k=sc.nextInt();
	            System.out.println(LongestKUniqueCharacterSubstrings(str,k));
	        }
	    }
	    public static int LongestKUniqueCharacterSubstrings(String str,int k)
	    {
	        int ei=0;
	        int si=0;
	        int ans=-1;
	        int frq[]=new int[256];
	        int UniqueChar=0;
	        while(ei<str.length())
	        {
	            char ch=str.charAt(ei);
	            if(frq[ch]==0)
	            {
	                UniqueChar++;
	            }
	            frq[ch]=frq[ch]+1;

	            while(UniqueChar>k)
	            {
	                char c=str.charAt(si);
	                si++;
	                frq[c]=frq[c]-1;
	                if(frq[c]==0)
	                {
	                    UniqueChar--;
	                }
	            }
	            if(UniqueChar==k)
	            {
	                ans=Math.max(ans,ei-si+1);
	            }
	            ei++;
	        }
	        return ans;
    }
}
