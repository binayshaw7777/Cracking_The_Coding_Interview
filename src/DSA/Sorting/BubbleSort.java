package DSA.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Array Elements: ");
        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();
        System.out.println("Current Array: \n"+ Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("Sorted Array: \n"+Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr) {
        for(int i=0; i<arr.length-1; i++) {
            boolean swapped = false;
            for(int j=0; j<arr.length-i-1; j++) {
                if(arr[j+1] < arr[j]) {
                    swapped = true;
                    swap(arr, j+1, j);
                }
            }
            if(!swapped)
                break;
        }
    }

    static void swap(int[] arr, int s, int e) {
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }
}
