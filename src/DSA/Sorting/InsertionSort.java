package DSA.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Array Elements: ");
        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();
        System.out.println("Current Array: \n"+ Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("Sorted Array: \n"+Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr) {
        for(int i=1; i<arr.length; i++) {
            int temp = arr[i];
            int j = i-1;
            while (j >= 0 && arr[j] > temp) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }
}
