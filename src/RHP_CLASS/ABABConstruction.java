package RHP_CLASS;

import java.util.*;
public class ABABConstruction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int size = sc.nextInt();
            String s = sc.next();
            performConstruction(size,s);
        }
    }

    private static void performConstruction(int size, String s) {
       if((size & 1) == 0){
           if(s.charAt(0) == 'b'){
               System.out.println("NO");
               return;
           }
           for(int i=1;i<size-1;i+=2){
               if(s.charAt(i) != s.charAt(i+1) || s.charAt(i) != '?'||s.charAt(i+1) != '?'){
                   continue;
               }else{
                   System.out.println("NO");
                   return;
               }
           }
       }else{
           for(int i=0;i<size-1;i+=2){
               if(s.charAt(i) != s.charAt(i+1) || s.charAt(i) != '?'||s.charAt(i+1) != '?'){
                   continue;
               }else{
                   System.out.println("NO");
                   return;
               }
           }
       }
        System.out.println("YES");
    }
}
