/**
 * <br> Problem Statement :
 *
 * Implement an algorithm to delete a node in the middle of the linked list.
 *
 * Example:
 * Input = 1->2->3->4->null
 * Output = 1->2->4->null
 * </br>
 *
 */



package Cracking_The_Coding_Interview.Linked_List;

class Node{
    int data;
    Node next;

    Node(int data,Node next){
        this.data = data;
        this.next =next;
    }
}
public class Delete_Middle_Node {
    public static void main(String[] args){
        int[] arr = {1,2,3,4};

        // points to the head node of the linked list
        Node head =null;
        //construct linked list
        for(int i=arr.length -1; i>=0;i--){
            head = new Node(arr[i],head);
        }
        deletemiddlenode(head);
        // print linked list
        printlist(head);
    }

    private static Node deletemiddlenode(Node head) {
        if (head == null || head.next == null){
            return null;
        }
        Node slow=head;
        Node fast=head;
        Node prev =head;
        while (fast!=null && fast.next!=null){
            prev=slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = slow.next;
        return head;
    }
    private static void printlist(Node head) {
        Node ptr = head;
        while (ptr != null)
        {
            System.out.print(ptr.data + " —> ");
            ptr = ptr.next;
        }
        System.out.println("null");
    }
}
