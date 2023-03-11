// You are at a casino. There are N stacked cards on pile . Each card has a number written on it. Then there will be Q iterations. In ith iteration, you start picking up the cards in Ai-1th pile from the top one by one and check whether the number written on the card is divisible by the ith prime number. If the number is divisible, you stack that card on pile Bi. Otherwise, you stack that card on pile Ai. After Q iterations, cards can only be on pile B1, B2, B3, . . . BQ, AQ . Output numbers on these cards from top to bottom of each piles in order of B1, B2, B3, . . . BQ, AQ .

// Input Format
// First line contains N and Q. The next line contains N space separated integers representing the initial pile of cards i.e., A0. The leftmost value represents the bottom plate of the pile.

// Constraints
// N < 10^5
// Q < 10^5
// |Ai| < 10^9

// Output Format
// Output N lines, each line containing the number written on the card.

// Sample Input
// 5 1
// 3 4 7 6 5
// Sample Output
// 4
// 6
// 3
// 7
// 5
// Explanation
// Initially:

// A0 = [3, 4, 7, 6, 5]<-TOP

// After 1st iteration:

// A0 = []<-TOP

// A1 = [5, 7, 3]<-TOP

// B1 = [6, 4]<-TOP

// Now first print B1 from top to bottom then A1 from top to bottom.

import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int Q = scn.nextInt();
		Stack<Integer> a0 = new Stack<>();
		for(int i=0;i<n;i++) {
			a0.push(scn.nextInt());
		}
		int[] primes = new int[Q];
		int i = 0;
		int count = 0;
		while (count < Q) {
			if (isPrime(i)) {
				primes[count] = i;
				count++;
			}
			i++;
		}
		playingWithCards(primes, a0, Q);

	}

	private static void playingWithCards(int[] primes, Stack<Integer> a0, int Q) {
		ArrayList<Stack<Integer>> A = new ArrayList<>();
		ArrayList<Stack<Integer>> B = new ArrayList<>();
		B.add(new Stack<Integer>());
		A.add(a0);
		for (int i = 1; i <= Q; i++) {
			Stack<Integer> nB = new Stack<>();
			Stack<Integer> nA = new Stack<>();
			while (!A.get(i - 1).isEmpty()) {
				int te = A.get(i - 1).pop();
				if (te % primes[i - 1] == 0) {
					nB.push(te);
				} else {
					nA.push(te);
				}
			}
			A.add(nA);
			B.add(nB);
		}
		for (int i = 1; i < B.size(); i++) {
			while (!B.get(i).isEmpty()) {
				System.out.println(B.get(i).pop());
			}
		}
		while (!A.get(A.size() - 1).isEmpty()) {
			System.out.println(A.get(A.size() - 1).pop());
		}

	}

	public static boolean isPrime(int n) {
		if (n == 0 || n == 1) {
			return false;
		}
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
    }
}
