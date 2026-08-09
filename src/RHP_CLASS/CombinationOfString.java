package RHP_CLASS;

import java.util.*;
/*{Find the combination or subset of string using BitManipulation}*/
public class CombinationOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        for(int i=1;i<(1<<n);i++){
            for(int shift=0;shift<n;shift++){
                if((i & (1<<shift)) != 0){
                    System.out.print(s.charAt(shift));
                }
            }
            System.out.println();
        }
    }
}
