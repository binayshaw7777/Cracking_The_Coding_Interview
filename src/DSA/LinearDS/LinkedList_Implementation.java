package DSA.LinearDS;

class ListNode {
    int data;
    ListNode next;
}

public class LinkedList_Implementation {

    public static ListNode head;

    public static void main(String[] args) {
        int[] keys = { 1, 2, 3, 4 };
        constructList(keys);
        printList(head);
    }

    public static void printList(ListNode head) {
        ListNode ptr = head;
        while (ptr != null) {
            System.out.print(ptr.data + " —> ");
            ptr = ptr.next;
        }
        System.out.println("null");
    }

    public static ListNode push(int data) {
        ListNode newNode = new ListNode();
        newNode.data = data;
        newNode.next = head;
        return newNode;
    }

    public static void constructList(int[] keys) {
        for (int i = keys.length - 1; i >= 0; i--) {
            head = push(keys[i]);
        }
    }
}
