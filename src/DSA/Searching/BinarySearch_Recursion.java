package DSA.Searching;

import java.util.Scanner;

public class BinarySearch_Recursion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Array Elements");
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        System.out.println("Enter the element to be searched:");
        int target = sc.nextInt();
        int ans = binarySearchRec(arr, target, 0, n-1);
        if(ans==-1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index: " +ans);
    }

    private static int binarySearchRec(int[] arr, int target, int s, int e) {
        if(s > e ) return -1;
        int mid = s + (e - s) / 2;
        if(target == arr[mid]) return mid;
        else if(target < arr[mid]) return binarySearchRec(arr, target, s, mid-1);
        return binarySearchRec(arr, target, mid+1, e);
    }
}
