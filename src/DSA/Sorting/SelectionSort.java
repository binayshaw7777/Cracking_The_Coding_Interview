package DSA.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Array Elements: ");
        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();
        System.out.println("Current Array: \n"+ Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("Sorted Array: \n"+Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr) {
        for(int i=0; i<arr.length-1; i++) {
            int min = i;
            for(int j = i+1; j<arr.length; j++) {
                if(arr[j] < arr[min])
                    min = j;
            }
            if(min!=i)
                swap(arr, min, i);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
