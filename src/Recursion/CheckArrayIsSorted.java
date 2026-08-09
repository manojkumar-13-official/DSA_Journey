package Recursion;

import java.util.Scanner;

public class CheckArrayIsSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for(int i=0;i<n;i++){
//            arr[i] = sc.nextInt();
//        }
        int[] arr = {1,2,3,8,5,6,7};
        boolean result = checkArrayIsSorted(arr,0);
        if(result){
            System.out.println("Given Array is Sorted");
        }else{
            System.out.println("Given Array is Not Sorted");
        }
    }

    private static boolean checkArrayIsSorted(int[] arr, int index) {
        if(index == arr.length-1){
            return true;
        }
        return arr[index] < arr[index+1] && checkArrayIsSorted(arr,index+1);
    }
}
