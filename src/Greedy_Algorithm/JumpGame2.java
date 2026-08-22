package Greedy_Algorithm;

import java.util.Scanner;


public class JumpGame2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2,3,1,4,1,1,1,2};
        int result = jump(arr);
        System.out.println(result);
    }

    private static int jump(int[] arr) {
        int left = 0, right = 0, n = arr.length, jumps = 0;
        while (right < n - 1) {
            int farthest = 0;
            for (int i = left; i <= right; i++) {
                farthest = Math.max(farthest, i + arr[i]);
            }
            left = right + 1;
            right = farthest;
            jumps += 1;
        }
        return jumps;
    }
}