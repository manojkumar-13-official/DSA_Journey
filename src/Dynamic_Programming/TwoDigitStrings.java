package Dynamic_Programming;

import java.util.*;
public class TwoDigitStrings {
    public static int[] formArray(String s,int size){
        int[] arr = new int[s.length()];
        int sum = 0,idx = 0;
        while(idx<s.length()){
            sum+=(s.charAt(idx)-'0');
            arr[idx++] = sum%size;
        }
        return arr;
    }
    public static void solve(){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next(), s2 = sc.next();
        int[] num1 = formArray(s1,10);
        int[] num2 = formArray(s2,10);
        int[][] dp = new int[num1.length+1][num2.length+1];
        for(int i=1;i<=num1.length;i++){
            for(int j=1;j<=num2.length;j++){
                if(num1[i-1]==num2[j-1]){
                    dp[i][j] = dp[i-1][j-1]+1;
                }else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        System.out.println((dp[num1.length][num2.length]!=0)?dp[num1.length][num2.length]:-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            solve();
        }
    }
}
