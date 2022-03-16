package DSA.Searching;

import java.util.Scanner;

public class BinarySearch {
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
        int ans = binarysearch(arr,target);
        if(ans==-1){
            System.out.println("Element not found");
        }else {
            System.out.println("Element found at index: " +ans);
        }

    }
    private static int binarysearch(int[]arr, int target){
        int s=0 , e = arr.length-1;
        while(s<=e){
            int m = s + (e-s)/2;
            if(target<arr[m]){
                e = m-1;
            }else if(target>arr[m]){
                s = m+1;
            }else
            {
                return m;
            }
        }
        return -1;
    }
}
