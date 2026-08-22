package FacePrep_HWI;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LongestCommonSubstringWithoutRepeatingCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        int result = longestCommonSubstring(s);
        System.out.println(result);
    }
    // public static int longestCommonSubstring(String s1, String s2) {
    // Set<Character> set = new HashSet<>();
    // int[][] dp = new int[s2.length()+1][s1.length()+1];
    // for(int i=1;i<=s2.length();i++){
    // for(int j=1;j<=s1.length();j++){
    // if(s2.charAt(i-1)==s1.charAt(j-1)){
    // dp[i][j] = dp[i-1][j-1]+1;
    // set.add(s2.charAt(i-1));
    // }else{
    // dp[i][j] = 0;
    // }
    // }
    // }
    // // for(int i=0;i<=s2.length();i++){
    // // for(int j=0;j<=s1.length();j++){
    // // System.out.print(dp[i][j]+" ");
    // // }
    // // System.out.println();
    // // }
    // return set.size();
    // }
    public static int longestCommonSubstring(String s){
        int max = -1;
        int[] ch = new int[26];
        for(int i=0;i<s.length();i++){
            int count = 0;
            for(int j=i;j<s.length();j++){
                char c = s.charAt(j);
                ch[c-'a']++;
                if(ch[c-'a']==1){
                    count++;
                }else{
                    break;
                }
            }
            max = Math.max(count,max);
        }
        return max;
    }
}
