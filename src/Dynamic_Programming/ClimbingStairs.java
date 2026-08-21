package Dynamic_Programming;
import java.util.*;
public class ClimbingStairs {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int result = minCostToClimbStairs(n,arr);
        System.out.print(result);
    }

    private static int minCostToClimbStairs(int n, int[] cost) {
        if(n==0) return 0;
        if(n==1) return cost[0];

        int[] minCost = new int[n+1];
        for(int i=2;i<=n;i++){
            minCost[i] = Math.min(cost[i-1]+minCost[i-1],cost[i-2]+minCost[i-2]);
        }
        return minCost[n];
    }

}
