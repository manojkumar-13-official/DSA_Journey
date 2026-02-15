package Binary_Search;

import java.util.Scanner;

public class PeakAndFloorElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2,3,5,9,14,16,18};
        int target = 1;
        int peak = findPeakElement(arr,target);
        int floor = findFloorElement(arr,target);

        System.out.println("The Peak Element in the Array : "+peak);
        System.out.println("The Floor Element in the Array : "+floor);

    }

    // If the target element is present in the array it return that otherwise it returns the next greatest element than target
    private static int findPeakElement(int[] arr, int target) {
        // Return -1 if the target element is greater than the last element in the array.
        if(target > arr[arr.length-1]){
            return -1;
        }
        int start = 0,end = arr.length-1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(target < arr[mid]){
                end = mid-1;
            }else if(target > arr[mid]){
                start = mid+1;
            }else {
                return mid;
            }
        }
        return start;
    }

    // If the target element is present in the array it returns that otherwise it returns the next smallest element than target.
    private static int findFloorElement(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(target < arr[mid]){
                end = mid - 1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return end;
    }
}
