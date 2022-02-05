package Cracking_The_Coding_Interview;
import java.util.Scanner;
public class isUnique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st;
        System.out.println("Enter your String: ");
        st=sc.nextLine();
        System.out.println(unique(st)+" "+unique1(st));
    }
    public static boolean unique(String s) { //Naive Solution
        if(s.length()>128) return false;
        boolean[] charset = new boolean[128];
        for(int i=0; i<s.length(); i++) {
            int val = s.charAt(i);
            if(charset[val]) return false;
            charset[val] = true;
        }
        return  true;
    }

    public static boolean unique1(String s) { //Optimal
        int c = 0;
        for(int i=0; i<s.length(); i++) {
            int val = s.charAt(i);
            if((c & (1 << val)) > 0) return false;
            c |= (1 << val);
        }
        return true;
    }
}
