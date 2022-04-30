package Cracking_The_Coding_Interview.Binary_Tree;

import java.util.*;

public class Left_View {

    // Binary tree node
    private static class Node {
        int val;
        Left_View.Node left, right;

        public Node(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    /* testing for example nodes */
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        /* creating a binary tree and entering the nodes */
        Node root = new Node(10);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(7);
        root.left.right = new Node(8);
        root.right.right = new Node(15);
        root.right.left = new Node(12);
        root.right.right.left = new Node(14);

        LV(root, list, 0);
        System.out.println(list);
    }

    //Function to print Right View of a Binary Tree
    private static void LV(Left_View.Node root, List<Integer> list, int level) {
        if (root == null) return;
        if (level == list.size()) list.add(root.val);
        LV(root.left, list, level + 1);
        LV(root.right, list, level + 1);
    }
}
