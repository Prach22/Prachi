// You will be given a Binary Tree. Your task is to print the binary tree in Vertical Fashion. The image below describes how we define a vertical traversal of a tree.

// Input Format
// You will be given an Integer N denoting the number of levels in the corresponding tree. On the next line you will be given (2^N)-1 order integers denoting the level order input for the tree. If at any level any node is absent then that will denoted by -1 and every integer other than -1 shows the presence of a node at that level.

// Constraints
// 1 <= N <= 10^5

// Output Format
// Print all nodes of a given column in the same line.

// Image

// Sample Input
// 4 1 2 3 4 5 6 7 -1 -1 -1 -1 -1 8 -1 9 -1 -1 -1 -1
// Sample Output
// 4 2 1 5 6 3 8 7 9
// Explanation
// Refer to the image.
// We are to simply print the traversal of each vertical level from left to right , using pre order traversal. {4} {2} {1 5 6} {3 8} {7} {9}
import java.util.*;
public class Main {
    public static void main(String args[]) {
  BTree tree = new BTree();
	        tree.insert();
	        HashMap<Integer, ArrayList<Integer>> map = tree.bottomDisplay();
	        ArrayList<Integer> list = new ArrayList<>(map.keySet());

	        Collections.sort(list);

	        for(int key : list)
	        {
	            ArrayList<Integer> values = map.get(key);
	            for(int val : values)
	            {
	                System.out.print(val + " ");
	            }
	        }
	    }

	    static class BTree
	    {
	        Node root;
	        private static class Node
	        {
	            int data;
	            Node left;
	            Node right;
	            public Node(int data)
	            {
	                this.data = data;
	                left = null;
	                right = null;
	            }
	        }

	        public void insert()
	        {
	            Scanner s = new Scanner(System.in);
		    int k = s.nextInt();
	            int val = s.nextInt();
	            root = new Node(val);

	            Queue<Node> queue = new LinkedList<>();

	            queue.add(root);

	            while(!queue.isEmpty())
	            {
	                int valLeft = s.nextInt();
	                int valRight = s.nextInt();
	                Node temp = queue.remove();

	                if(valLeft != -1)
	                {
	                    temp.left = new Node(valLeft);
	                    queue.add(temp.left);
	                }
	                if(valRight != -1)
	                {
	                    temp.right = new Node(valRight);
	                    queue.add(temp.right);
	                }
	            }
	        }

	        public HashMap<Integer,ArrayList<Integer>> bottomDisplay()
	        {
	            HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
	            bottomDisplay(this.root,map,0);
	            return map;

	        }

	        private void bottomDisplay(Node node,HashMap<Integer,ArrayList<Integer>> map, int d)
	        {
	            if(node == null)
	            {
	                return;
	            }

	            if(!map.containsKey(d))
	            {
	                map.put(d, new ArrayList<>());
	            }
	            map.get(d).add(node.data);


	            bottomDisplay(node.left, map, d-1);
	            bottomDisplay(node.right, map, d+1);

	        }
    }
}
