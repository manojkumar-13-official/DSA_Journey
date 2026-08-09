package RHP_CLASS;

import java.util.Scanner;

public class Max_X_Sum {
    static Scanner sc = new Scanner(System.in);
    public static void solve(){
        int n = sc.nextInt(), k = sc.nextInt();
        int tpow = 0;
        while((1<<tpow)<n){
            tpow++;
        }
        int newN = (1<<tpow);
        int[] A = new int[2*newN];
        for(int i=newN;i<newN+n;i++){
            A[i] = sc.nextInt();
        }
        for(int i=newN-1;i>=1;i--){
            A[i] = A[2*i] + A[(2*i)+1];
        }
        n = newN;
        int[] B = new int[n];
        for(int i=0;i<n;i++){
            B[i] = sc.nextInt();
        }
    }
    public static void main(String[] args) {
        int t = sc.nextInt();
        while(t-- > 0){
            solve();
        }
    }
}
