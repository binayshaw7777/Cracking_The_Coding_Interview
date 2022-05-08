package Cracking_The_Coding_Interview.Stack_and_Queue;


import java.util.ListIterator;
import java.util.Stack;

import static java.util.Collections.sort;

public class Sort_Stack {
    public static void main(String[] args){
        Stack<Integer> s = new Stack<>();
        s.push(30);
        s.push(-5);
        s.push(18);
        s.push(14);
        s.push(-3);

        System.out.println("Stack elements before sorting: ");
        printStack(s);
        sortStack(s);
        System.out.println("\n\nStack elements after sorting:");
        printStack(s);
    }

    private static void printStack(Stack<Integer> s) {
        ListIterator<Integer> st = s.listIterator();

        // forwarding
        while (st.hasNext())
            st.next();

        // printing from top to bottom
        while (st.hasPrevious())
            System.out.print(st.previous() + " ");
    }

    public static void sortStack(Stack<Integer> s) {
        if (!s.isEmpty())
        {
            // Remove the top item
            int x = s.pop();
            // Sort remaining stack
            sortStack(s);
            // Push the top item back in sorted stack
            sortedInsert(s, x);
        }
    }

    private static void sortedInsert(Stack<Integer> s, int x) {
        if (s.isEmpty() || x > s.peek())
        {
            s.push(x);
            return;
        }

        // If top is greater, remove the top item and recur
        int temp = s.pop();
        sortedInsert(s, x);

        // Put back the top item removed earlier
        s.push(temp);
    }

}
