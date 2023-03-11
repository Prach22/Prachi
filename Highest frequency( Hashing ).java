// Given an array find the number which comes with maximum frequency. It must work in O(n) time complexity.

// Input Format
// Enter the size of the array N and add N more numbers and store in an array

// Constraints
// 1 <= N <= 10^7
// -109 <= A[i] <= 109

// Output Format
// Display the number with the maximum frequency.

// Sample Input
// 5
// 1 2 2 2 3
// Sample Output
// 2
// Explanation
// 2 has the highest frequency in the array i.e. 3.
import java.util.*;
public class Main {
    public static void main (String args[]) {
  Scanner s = new Scanner(System.in);

			int n = s.nextInt();

			Map<Integer, Integer> fq = new HashMap<>();

			for(int i = 0; i < n; ++i)
			{
				int num = s.nextInt();
				if(fq.containsKey(num))
				{
					fq.replace(num, fq.get(num) + 1);
				}
				else
				{
					fq.put(num, 1);
				}
			}
			int maxVal = 0;
			int maxKey = 0;
			for(Map.Entry<Integer, Integer> key : fq.entrySet())
			{
				if(maxVal < fq.get(key.getKey()))
				{
					maxKey = key.getKey();
					maxVal = key.getValue();
				}
			}
			System.out.print(maxKey);
    }
}
