package Cracking_The_Coding_Interview.Linked_List;

class ListNode{
    int data;
    ListNode next;

    ListNode(int data,ListNode next){
        this.data = data;
        this.next =next;
    }
}
public class Remove_Duplicates {
    public static void main(String[] args){
        int[] arr = {5,3,5,4,8,8,9,1};

        // points to the head node of the linked list
        ListNode head =null;
        //construct linked list
        for(int i=arr.length -1; i>=0;i--){
            head = new ListNode(arr[i],head);
        }
        removeDuplicates(head);
        // print linked list
        printlist(head);
    }

    private static void printlist(ListNode head) {
        ListNode ptr = head;
        while (ptr != null)
        {
            System.out.print(ptr.data + " —> ");
            ptr = ptr.next;
        }
        System.out.println("null");
    }

    private static void removeDuplicates(ListNode head) {
        ListNode current = head;
        while(current!=null){
            ListNode temp = current;
            while(temp.next!=null){
                if (temp.next.data == current.data){
                    temp.next = temp.next.next;
                }else{
                    temp = temp.next;
                }
            }
            current = current.next;
        }
    }
}

