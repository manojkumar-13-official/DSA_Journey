 package RHP_CLASS;

import java.util.Arrays;
import java.util.Scanner;

public class SegmentTreeRepresentation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), q = sc.nextInt();
        int tpow = 0;
        while((1<<tpow)<n){
            tpow++;
        }
        int newN = (1<<tpow);
        int[] carr = new int[2*newN];
        for(int i=newN;i<newN+n;i++){
            carr[i] = sc.nextInt();
        }
        // System.out.println(Arrays.toString(carr)); 
        for(int i=newN-1;i>=1;i--){
            carr[i] = carr[2*i] + carr[(2*i)+1];
        }
        // System.out.println(Arrays.toString(carr)); 
        n = newN;
        while(q > 0){
            int query = sc.nextInt();
            if(query==1){
                int idx = sc.nextInt(), val = sc.nextInt();
                update(carr,n-1+idx,val);
            }else{
                int left = sc.nextInt();
                int right = sc.nextInt();
                int result = find(carr,1,1,n,left,right);
                System.out.println(result);
            }
            q--;
        }
    }

    private static void update(int[] carr, int i, int val) {
        while(i>=1){
            carr[i] = val;
            int pos = i/2;
            carr[pos] = Math.min(carr[2*pos],carr[2*pos+1]);
            i = pos;
        }
    }

    private static int find(int[] carr, int node, int left, int right, int fleft, int fright) {
        if(right < fleft || left > fright){
            return 0;
        }
        if(left>=fleft && right<=fright){
            return carr[node];
        }
        int mid = (left+right)/2;
        // System.out.println(left+" -- "+right);
        int leftVal =  find(carr, 2*node, left, mid, fleft, fright);
        int rightVal = find(carr, (2*node)+1, mid+1, right, fleft, fright);
        return (leftVal+rightVal);
    }
}

// n = 11
// arr = {1 2 3 4 5 6 7 8 9 10 11}
// [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 0, 0, 0, 0, 0]
// [0, 66, 36, 30, 10, 26, 30, 0, 3, 7, 11, 15, 19, 11, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 0, 0, 0, 0, 0]
