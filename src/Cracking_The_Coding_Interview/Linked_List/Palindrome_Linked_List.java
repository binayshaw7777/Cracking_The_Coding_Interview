/**
 * <br> Problem Statement :
 *
 * Given the head of a singly linked list, return true if it is a palindrome.
 *
 * Example 1:
 * Input: head = [1,2,2,1]
 * Output: true
 *
 * Example 2:
 * Input: head = [1,2]
 * Output: false
 * </br>
 *
 */

package Cracking_The_Coding_Interview.Linked_List;

class PalindromeNode{
    int data;
    PalindromeNode next= null;

    PalindromeNode(int data){
        this.data = data;

    }
}
public class Palindrome_Linked_List {
    public static void main(String[] args){
        int[] data = {1,2,2,1};

        PalindromeNode head = null;
        for (int i = data.length - 1; i >= 0; i--) {
            head = push(data[i], head);
        }
        if (checkPalindrome(head)) {
            System.out.println("The linked list is a palindrome");
        }
        else {
            System.out.println("The linked list is not a palindrome");
        }

    }

    private static PalindromeNode push(int data, PalindromeNode head) {
        PalindromeNode node = new PalindromeNode(data);
        node.next = head;
        return node;
    }

    private static boolean checkPalindrome(PalindromeNode head) {
        PalindromeNode f=head;
        PalindromeNode s=head;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
        }
        if(f!=null){
            s=s.next;
        }
        s = reverse(s);
        f = head;
        while(s!=null){
            if(f.data!=s.data){
                return false;
            }
            f=f.next;
            s=s.next;
        }
        return true;
    }
    // Reverse the other half of the linkedlist
    private static PalindromeNode reverse(PalindromeNode head){
        PalindromeNode p =null;
        while (head!=null){
            PalindromeNode n = head.next;
            head.next = p;
            p=head;
            head=n;
        }
        return p;
    }
}
