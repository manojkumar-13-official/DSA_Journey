package Recursion;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,1,2,3,4};
        int target = 7;
        int result = findIndex(arr,target,0,arr.length-1);
        System.out.println(result);
    }

    private static int findIndex(int[] arr, int target, int st, int end) {
        if(st > end){
            return -1;
        }
        int mid = st + (end - st)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[mid]>=arr[st]){
            if(target >= arr[st] && target <= arr[mid]){
                return findIndex(arr,target,st,mid-1);
            }else{
                return findIndex(arr,target,mid+1,end);
            }
        }

        if(target>=arr[mid] && target<=arr[end]){
            return findIndex(arr,target,mid+1,end);
        }
        return findIndex(arr,target,st,mid-1);
    }
}
