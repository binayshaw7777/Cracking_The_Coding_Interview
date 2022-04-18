package Cracking_The_Coding_Interview.Linked_List;

class NodeList{
    int data;
    NodeList next;

    NodeList(int data, NodeList next){
        this.data = data;
        this.next =next;
    }
}
public class Partition_Linked_List {
    public static void main(String[] args){

        int[] arr = {3,5,8,5,10,2,1};

        // points to the head node of the linked list
        NodeList node =null;
        //construct linked list

        for(int i=arr.length -1; i>=0;i--){
            node = new NodeList(arr[i],node);
        }
        partition(node,5);
        // print linked list
        printlist(node);
    }

    private static NodeList partition(NodeList node, int i) {
        NodeList curr = node;
        NodeList p = node;
        while (curr != null) {
            if (curr.data < i) {
                // Swap DATA values
                int temp = p.data;
                p.data = curr.data;
                curr.data = temp;

                p = p.next;
            }
            curr = curr.next;
        }
        return node;
    }


    private static void printlist(NodeList head) {
        NodeList ptr = head;
        while (ptr != null)
        {
            System.out.print(ptr.data + " —> ");
            ptr = ptr.next;
        }
        System.out.println("null");
    }
}


