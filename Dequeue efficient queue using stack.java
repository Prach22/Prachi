// Implement a Queue using two stacks Make it Dequeue efficient.

// Input Format
// Enter the size of the queue N add 0 - N-1 numbers in the queue

// Constraints
// Output Format
// Display the numbers in the order they are dequeued and in a space separated manner

// Sample Input
// 5
// Sample Output
// 0 1 2 3 4

import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
         Scanner scn=new Scanner(System.in);
        MyQueue q=new MyQueue();
        int num=scn.nextInt();

        for(int index=0;index<num;index++)
        {
            q.push(index);
        }
        while(!q.empty()){
            System.out.print(q.pop()+" ");
        }

    }
