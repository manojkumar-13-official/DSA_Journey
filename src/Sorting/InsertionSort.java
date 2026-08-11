package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {8,7,1,2,0};
        System.out.println("Before sort an array : "+ Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("After sort an array : "+ Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr) {
        int n = arr.length;
        for(int i=1;i<arr.length;i++){
            int temp = arr[i];
            int j = i-1;
            while(j>=0 && arr[j] > temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
            System.out.println("Iteration : "+i+"---"+Arrays.toString(arr));
        }
    }
}

// Code Working procedure
//Before sort an array : [8, 7, 1, 2, 0]
//Iteration : 1---[7, 8, 1, 2, 0]
//Iteration : 2---[1, 7, 8, 2, 0]
//Iteration : 3---[1, 2, 7, 8, 0]
//Iteration : 4---[0, 1, 2, 7, 8]
//After sort an array : [0, 1, 2, 7, 8]