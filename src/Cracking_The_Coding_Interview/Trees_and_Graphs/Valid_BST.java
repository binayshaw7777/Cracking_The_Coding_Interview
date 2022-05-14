package Cracking_The_Coding_Interview.Trees_and_Graphs;

public class Valid_BST {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    public static boolean ValidBST(Node root){
        return isValidBST(root,null,null);
    }

    private static boolean isValidBST(Node root, Integer max, Integer min) {
        // and empty binary tree is a valid binary tree
        if (root == null) return true;
        if (max!=null && root.data >=max) return false;
        if (min!=null && root.data<=min) return false;

        return isValidBST(root.left,root.data,min) && isValidBST(root.right,max, root.data);
    }
    public static void main( String args[] ) {
        // Creating a binary tree
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(2);
        root.left.left.left = new Node(1);
        root.left.right = new Node(7);
        root.right.left = new Node(13);
        root.right.left.right = new Node(14);
        root.right.right = new Node(21);

        if (ValidBST(root))
            System.out.println("A valid BST");
        else
            System.out.println("Not a valid BST");
    }
}
