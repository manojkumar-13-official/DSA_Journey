package Two_Pointer_And_Sliding_Window;

import java.util.ArrayList;
import java.util.List;

public class Main {

    // 1. constant Window
    public static void main(String[] args) {
        int[] arr = {-1,2,3,3,4,5,-1};
        List<Integer> al = new ArrayList<>();
        int window = 4;
        int start = 0,end = window;
        for(int i=0;i<= arr.length - end;i++){
            al.add(constantWindow(arr,i,window+i));
        }
        System.out.println(al);
        System.out.println(optimalconstantWindow(arr,window));
    }

    private static Integer constantWindow(int[] arr, int start, int end) {
        int sum = 0;
        for(int i=start;i<end;i++){
            sum+=arr[i];
        }
        return sum;
    }

    //optimal approach
    public static int optimalconstantWindow(int[] arr,int n){
        int sum = 0, l =0,r=n-1;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        while(r < arr.length){
            int tempSum = sum - arr[l];
            l++;
            tempSum+=arr[r];
            r++;
            sum = Math.max(sum,tempSum);
        }
        return sum;
    }

}
