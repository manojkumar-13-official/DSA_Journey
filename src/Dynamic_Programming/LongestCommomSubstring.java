package Dynamic_Programming;

import java.util.Scanner;

public class LongestCommomSubstring {
    public static int longCommSubstr(String s1, String s2) {
        int[][] dp = new int[s2.length()+1][s1.length()+1];
        for(int i=1;i<=s2.length();i++){
            for(int j=1;j<=s1.length();j++){
                if(s2.charAt(i-1)==s1.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1;
                }else{
                    dp[i][j] = 0;
                }
            }
        }//ta vd
        int max = Integer.MIN_VALUE;
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                max = Math.max(max,dp[i][j]);
            }
        }
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next(), s2 = sc.next();
        int result = longCommSubstr(s1,s2);
        System.out.println(result);

    }
}
