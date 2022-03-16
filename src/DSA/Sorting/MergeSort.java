package DSA.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the Array Elements: ");
        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();
        System.out.println("Current Array: \n"+ Arrays.toString(arr));
        arr = mergeSort(arr);
        System.out.println("Sorted Array: \n"+Arrays.toString(arr));
    }

    static int[] mergeSort(int[] arr) {
        if(arr.length==1)
            return arr;
        int mid = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        return  merge(left, right);
    }
    public static int[] merge(int[] left, int[] right) {
        int[] mix = new int[left.length + right.length];
        int i=0, j=0, k=0;

        while(i < left.length && j < right.length) {
            if(left[i] < right[j]) {
                mix[k] = left[i];
                i++;
            } else {
                mix[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < left.length) {
            mix[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length) {
            mix[k] = right[j];
            j++;
            k++;
        }
        return mix;
    }
}
