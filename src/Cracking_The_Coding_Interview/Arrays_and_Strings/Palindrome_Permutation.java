/**
 * <br> Problem Statement :
 *
 * Given a string, write a function to check if it is a
 * permutation of a palindrome. A palindrome is a word
 * or phrase that is same forwards and backwards. A
 * permutation is a rearrangement of letters. The palindrome
 * does not need to be limited to just dictionary words.
 *
 * ex. Input : Tact Coa
 * Output : True (permutations : "taco cat", "atco cta", etc.)
 *
 * </br>
 *
 */


package Cracking_The_Coding_Interview.Arrays_and_Strings;

import java.util.HashMap;
import java.util.Scanner;

public class Palindrome_Permutation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String st;
        System.out.print("Enter your String: ");
        st=sc.next();
        System.out.println(PermutationPalindrome(st));
    }
    public static boolean PermutationPalindrome(String st){
        HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();  // Maps each character to a number. a->0 ,b->1 ,c->2
        int oddCounts = 0;
        st = st.toLowerCase();
        for (int i = 0; i < st.length(); i++) {

            char ch = st.charAt(i);
            if (((int) st.charAt(i)) < ((int) 'a') || (int) st.charAt(i) > ((int) 'z'))   // iterates through each character in string 'st' until it finds one which is not 'a' or 'z'
                continue;

            charCount.put(ch, (charCount.get(ch) == null ? 0 : charCount.get(ch) + 1));

            if (charCount.get(ch) % 2 == 1) { //checks whether the characters are odd or even
                oddCounts++;
            } else {
                oddCounts--;
            }
        }
        return (oddCounts <= 1);
    }

}
