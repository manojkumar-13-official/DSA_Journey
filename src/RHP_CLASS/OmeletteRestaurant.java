package RHP_CLASS;

import java.util.*;

public class OmeletteRestaurant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int balPtr = 1;
        for(int i=1;i<=n;i++){
            int N = sc.nextInt(), D = sc.nextInt();
            int[] eggs = new int[N];
            int[] used = new int[N];
            int[] balance = new int[N];
            Arrays.fill(balance,0);
            for(int day = 1;day<=N;day++)
                eggs[day] = sc.nextInt();
            for(int day = 1;day<=N;day++)
                eggs[day] = sc.nextInt();

            for(int day = 1;day<=N;day++){
                int need = used[day];
                while(balPtr < day - D){
                    balPtr++;
                }
                while(need > 0 && balPtr < day){
                    int balUse = Math.min(need,balance[balPtr]);
                    need-=balUse;
                    balance[balPtr] -=balUse;
                    if(balance[balPtr]==0){
                        balPtr++;
                    }
                }
                balance[day] = eggs[day] - need;
            }
            int result = 0;
            for(int j = N-D+1;j<=N;j++){
                result+=balance[j];
            }
            System.out.println(result);
        }
    }
}
