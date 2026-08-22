package FacePrep_HWI;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumWindowSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine(), s2 = sc.nextLine();
        int[] result = minimumWindowCost(s1,s2);
        System.out.println();
    }

    private static int[] minimumWindowCost(String s1, String s2) {
        return new int[]{-1,-1};
    }
}
