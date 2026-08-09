package Greedy_Algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class AssignCookies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] children = {1,2,3};
        int[] cookies = {1,1};
        int result = findContentChildren(children,cookies);
        System.out.println(result);
    }

    private static int findContentChildren(int[] children, int[] cookies) {
        int left = 0,right = 0;
        Arrays.sort(children);
        Arrays.sort(cookies);
        while((left < cookies.length) && (right < children.length)){
            if(children[right]<=cookies[left]){
                right++;
            }
            left++;
        }
        return right;
    }
}
