package PracticeProblems;
import java.util.*;
public class MaxElement {

    //Brute Force
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        int[] lis = new int[n];
//        for(int i=0;i<n;i++){
//            arr[i] = sc.nextInt();
//        }
//        Arrays.fill(lis,1);
//        for(int i=1;i<n;i++){
//            for(int j=1;j<n;j++){
//                lis[i] = Math.max(lis[i],lis[j]+1);
//            }
//        }
//        int ans = 1;
//        for(int i=0;i<n;i++){
//            ans = Math.max(ans,lis[i]);
//        }
//        System.out.println(ans);
//    }

    //Optimal
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> al =  new ArrayList<Integer>();

    }
}
