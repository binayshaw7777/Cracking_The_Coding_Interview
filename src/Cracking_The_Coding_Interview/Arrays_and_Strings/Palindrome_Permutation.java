/**
 * <br> Problem Statement :
 *
 * Given a string, write a function to check if it is a
 * permutation of a palindrome. A palindrome is a word
 * or phrase that is same forwards and backwards. A
 * permutation is a rearrangement of letters. The palindrome
 * does not need to be limited to just dictionary words.
 *
 * ex 1. Input : Tact Coa
 * Output : True (permutations : "taco cat", "atco cta", etc.)
 * ex 2. Input : civil
 *  Output : False
 * </br>
 *
 */


package Cracking_The_Coding_Interview.Arrays_and_Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class Palindrome_Permutation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String st;
        System.out.print("Enter your String: ");
        st=sc.next();
        System.out.println(PermutationPalindrome(st));
    }
    public static boolean PermutationPalindrome(String st){
        if (st == null){
            return false;
        }
        int oddCount=0;
        st = st.toLowerCase();
        Map<Character,Integer> countMap = new HashMap<>();
        for(int i=0;i<st.length();i++){
            char curr = st.charAt(i);
            if (Character.isLetter(curr) || Character.isDigit(curr)){
                if (countMap.containsKey(curr)){
                    countMap.put(curr, countMap.get(curr)+1);
                }else{
                    countMap.put(curr,1);
                }
            }
        }

        for (Entry<Character, Integer> data : countMap.entrySet()){
            if (data.getValue() % 2!=0){
                oddCount++;
            }
        }
        return oddCount<=1;
    }

}
