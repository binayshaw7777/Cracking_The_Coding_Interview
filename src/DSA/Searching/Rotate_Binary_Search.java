package DSA.Searching;

import java.util.Scanner;

public class Rotate_Binary_Search {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int n =sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Array Elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be found: ");
        int target = sc.nextInt();
        int answer = search(arr,target,0,arr.length-1);
        System.out.println("Element found at index" +answer);
    }

    public static int search(int[]arr, int target,int start,int end){
        if(start>end){
            return -1;
        }
        int middle = start + (end-start)/2;
        if (arr[middle] == target){
            return middle;
        }
        if (arr[start] <= arr[middle]){
            if (target >= arr[start] && target <= arr[middle]){
                return search(arr,target,start,middle-1);
            }else{
                return search(arr,target,middle+1,end);
            }
        }
        if (target >= arr[middle] && target <= arr[end]){
            return search(arr,target,middle+1,end);
        }else{
            return search(arr,target,start,middle-1);
        }
    }
}
