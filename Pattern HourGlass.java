// Take N as input. For a value of N=5, we wish to draw the following pattern :

//                           5 4 3 2 1 0 1 2 3 4 5
//                             4 3 2 1 0 1 2 3 4 
//                               3 2 1 0 1 2 3 
//                                 2 1 0 1 2 
//                                   1 0 1 
//                                     0 
//                                   1 0 1 
//                                 2 1 0 1 2 
//                               3 2 1 0 1 2 3 
//                             4 3 2 1 0 1 2 3 4 
//                           5 4 3 2 1 0 1 2 3 4 5
// Input Format
// Take N as input.

// Constraints
// N <= 20

// Output Format
// Pattern should be printed with a space between every two values.

// Sample Input
// 5
// Sample Output
//  5 4 3 2 1 0 1 2 3 4 5
//    4 3 2 1 0 1 2 3 4 
//      3 2 1 0 1 2 3 
//        2 1 0 1 2 
//          1 0 1 
//            0 
//          1 0 1 
//        2 1 0 1 2 
//      3 2 1 0 1 2 3 
//    4 3 2 1 0 1 2 3 4 
//  5 4 3 2 1 0 1 2 3 4 5

import java.util.*;
public class Main {
    public static void main(String args[]) {
   Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printHourGlassPattern(n);
    }

    public static void printHourGlassPattern(int n){
        //Upper part
        for(int i=0;i<=n;i++){
            for(int space=0;space<i;space++){
                System.out.print("  ");
            }
            int count=n-i;
            for(int j=0;j<n-i;j++){
                System.out.print(count + " ");
                count--;
            }

            System.out.print(count + " " );
            count++;
            for(int j=0;j<n-i;j++){
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
        //lower part
        int num=0;
        for(int i=0;i<n;i++){
            for(int space=0;space<n-i-1;space++){
                System.out.print("  ");
            }
            num=i+1;
            for(int x=0;x<=i;x++){
                System.out.print(num + " ");
                num--;
            }
            System.out.print(num + " ");
            num++;
            for(int x=0;x<=i;x++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
