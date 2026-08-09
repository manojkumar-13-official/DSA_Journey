package Greedy_Algorithm;

import java.util.Scanner;

public class JumpGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,1,1,0,2,5};
        System.out.println(canJump(arr));
    }

    private static boolean canJump(int[] nums) {
        int val = 0, n = nums.length,result = 0;
        for(int i=0;i<=n-2;i++){
            if(val>=i){
                val = Math.max(val,i+nums[i]);
                result+=1;
            }
        }
        return val>=n-1;
    }
}
