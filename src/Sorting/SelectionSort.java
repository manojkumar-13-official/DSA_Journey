package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,7,3,6,2,0,1};
        System.out.println("Before sort an array : "+ Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("After sort an array : "+ Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr) {
        int n = arr.length;
        for(int i=0;i<n;i++){
            int min_idx = i;
            for(int j=i+1;j<n;j++){
                if(arr[j] < arr[min_idx]){
                    min_idx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
            System.out.println("Iteration : "+i+"----"+ Arrays.toString(arr)+"--- MinIndex : "+min_idx);
        }
    }
}

// Code Working Procedure

//Before sort an array : [5, 4, 7, 3, 6, 2, 0, 1]
//Iteration : 0----[0, 4, 7, 3, 6, 2, 5, 1]--- MinIndex : 6
//Iteration : 1----[0, 1, 7, 3, 6, 2, 5, 4]--- MinIndex : 7
//Iteration : 2----[0, 1, 2, 3, 6, 7, 5, 4]--- MinIndex : 5
//Iteration : 3----[0, 1, 2, 3, 6, 7, 5, 4]--- MinIndex : 3
//Iteration : 4----[0, 1, 2, 3, 4, 7, 5, 6]--- MinIndex : 7
//Iteration : 5----[0, 1, 2, 3, 4, 5, 7, 6]--- MinIndex : 6
//Iteration : 6----[0, 1, 2, 3, 4, 5, 6, 7]--- MinIndex : 7
//Iteration : 7----[0, 1, 2, 3, 4, 5, 6, 7]--- MinIndex : 7
//After sort an array : [0, 1, 2, 3, 4, 5, 6, 7]
