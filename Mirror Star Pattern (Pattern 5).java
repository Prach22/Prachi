// Take N (number of rows - only odd numbers allowed), print the following pattern (for N = 5).

//       *
//    *  *  *  
// *  *  *  *  *  
//    *  *  *
//       *
// Input Format
// Constraints
// 0 < N < 10 (only odd numbers allowed)

// Output Format
// Sample Input
// 5
// Sample Output
//       *
//     * * *
//   * * * * *
//     * * *
//       *
// Explanation
// Each '*' is separated from other by a tab.

import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    sol_2(n);

    sc.close();
}

public static void sol_2 (int n) {
    int space = (n-1)/2, star=1;
    int row = 1;

    while(row<=n){
        int col=1;
        while(col <= space){
            System.out.print("  ");
            col++;
        }
        col=1;
        while(col <= star){
            System.out.print("* ");
            col++;
        }
        System.out.println();
        row++;

        if(row <= (n/2)+1) {
            star+=2;
            space--;
        }
        else{
            star-=2;
            space++;
        }
    }
    }
}

