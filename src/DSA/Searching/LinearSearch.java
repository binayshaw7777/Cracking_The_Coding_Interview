package DSA.Searching;

import javax.lang.model.element.Element;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Array Elements");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched:");
        int target = sc.nextInt();
        int x = linearsearch(arr,target);
        if (x==-1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element found at index: " +x);
        }

    }
    private static int linearsearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            int a = arr[i];
            if(a==target){
               return i;
            }
        }
        return -1;
    }
}


