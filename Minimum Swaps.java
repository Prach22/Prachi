// You are given an unordered array consisting of consecutive integers [1, 2, 3, …, n] without any duplicates. You are allowed to swap any two elements. You need to find the minimum number of swaps required to sort the array in ascending order.

// Input Format
// The first line contains an integer, n, the size of the array . The second line contains n space-separated integers arr[i].

// Constraints
// 1 <= n <= 10^5 1 <= arr[i] <= n

// Output Format
// Print the minimum number of swaps to sort the given array.

// Sample Input
// 4
// 4 3 1 2
// Sample Output
// 3
import java.util.*;
public class Main {
    public static void main (String args[]) {
  Scanner scan=new Scanner(System.in);
	           int arrSize= scan.nextInt();
	           int[] list=new int[arrSize];
	           //int[] arr=new int[arrSize];
	           for (int i = 0; i < arrSize; i++) {
	               list[i]=scan.nextInt();
	           }
	           //System.out.println(Arrays.toString(list));
	           int count=0;
	           for (int i = 0; i < arrSize; i++) {
	               if (list[i]!=(i+1)) {
	                   count++;

	                   for (int j = 0; j < arrSize; j++){
	                       int b=0;
	                       if(list[j]==i+1){
	                           b=list[j];
	                           list[j]=list[i];
	                           list[i]=b;
	                           break;
	                       }
	                   }
	               }
}
	           System.out.println(count);
    }
}
