package Binary_Search;

import java.util.Arrays;
import java.util.Scanner;

public class FirstAndLastPositionOfElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {5,7,7,8,8,10,12,12,15};
        int target = 7;
        int[] result = findFirstAndLastPositionOfElement(arr,target);
        System.out.print(Arrays.toString(result));
    }

    private static int[] findFirstAndLastPositionOfElement(int[] arr, int target) {
        int[] result = {-1,-1};
        result[0] = searchIndex(arr,target,true);
        if(result[0]!=-1) {
            result[1] = searchIndex(arr, target, false);
        }
        return result;
    }
    private static int searchIndex(int[] arr,int target,boolean findStartIndex){
        int start = 0,ans = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(target < arr[mid]){
                end = mid - 1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else{
                ans = mid;
                if(findStartIndex){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
