package DSA.Binary_Tree;

import java.util.*;

public class Right_View {

    // Binary tree node
    private static class Node {
        int val;
        Node left, right;

        public Node(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    // Driver code
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        // construct binary tree as shown in
        // above diagram
        Node root = new Node(10);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(7);
        root.left.right = new Node(8);
        root.right.right = new Node(15);
        root.right.left = new Node(12);
        root.right.right.left = new Node(14);

        RV(root, list, 0);
        System.out.println(list);
    }

    //Function to print Right View of a Binary Tree
    private static void RV(Node root, List<Integer> list, int level) {
        if (root == null) return;
        if (level == list.size()) list.add(root.val);
        RV(root.right, list, level+1);
        RV(root.left, list, level+1);
    }
}
