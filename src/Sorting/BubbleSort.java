package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,4,7,3,6,2,0,1};
        System.out.println("Before sort an array : "+ Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("After sort an array : "+ Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr) {
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            System.out.println("Iteration : "+i+"---"+Arrays.toString(arr));
        }
    }
}

// Code Working Procedure

//Before sort an array : [5, 4, 7, 3, 6, 2, 0, 1]
//Iteration : 0---[4, 5, 3, 6, 2, 0, 1, 7]
//Iteration : 1---[4, 3, 5, 2, 0, 1, 6, 7]
//Iteration : 2---[3, 4, 2, 0, 1, 5, 6, 7]
//Iteration : 3---[3, 2, 0, 1, 4, 5, 6, 7]
//Iteration : 4---[2, 0, 1, 3, 4, 5, 6, 7]
//Iteration : 5---[0, 1, 2, 3, 4, 5, 6, 7]
//Iteration : 6---[0, 1, 2, 3, 4, 5, 6, 7]
//Iteration : 7---[0, 1, 2, 3, 4, 5, 6, 7]
//After sort an array : [0, 1, 2, 3, 4, 5, 6, 7]

