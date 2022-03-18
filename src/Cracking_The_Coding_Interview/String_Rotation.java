/**
 * <br> Problem Statement :
 *
 * Assume you have a method isSubstring which checks
 * if one word is a substring of another. Given two
 * strings s1 and s2, write code to check if s2 is 
 * a rotation of s1 using only one call to isSubstring.
 *
 * ex. "waterbottle" is a rotation of "erbottlewat"
 *
 * </br>
 *
 */


package Cracking_The_Coding_Interview;
import java.util.Scanner;
public class String_Rotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two String to check is they're Rotated String or not.");
        System.out.println("First String: ");
        String s1 = sc.nextLine();
        System.out.println("Second String: ");
        String s2 = sc.nextLine();
        // s1 = xy = waterbottle && // s2 = yx = erbottlewat
        //x = wat, y = erbottle
        System.out.println(isRotation(s1, s2));
    }

    public static boolean isRotation(String s1, String s2) { //checks if rotated or not
        int length = s1.length();
        if(length!=s2.length()) return false;
        String concat = s1+s1; //concat = wat.erbottlewat.erbottle, s2 = .erbottlewat.  I used . just to show the subtring
        return isSubstring(concat, s2);
    }

    public static boolean isSubstring(String concat, String s2) { //checks if s2 is a part of concat string
        return concat.contains(s2); //String method to check if concat contains s2 in it.
    }
}
