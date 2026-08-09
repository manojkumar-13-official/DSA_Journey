package RHP_CLASS;

import java.util.*;
public class ReindeerAndSleigh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            solve(sc);
        }
    }
    public static void solve(Scanner sc) {
        int t = sc.nextInt();
        ArrayList<ArrayList<Long>> al = new ArrayList<>();
        long remwt = 0, pullpow = 0;

        // Input + store tuple (w+s, s, w)
        for (int j = 0; j < t; j++) {
            long w = sc.nextLong();
            long s = sc.nextLong();

            ArrayList<Long> temp = new ArrayList<>();
            temp.add(w + s); // index 0
            temp.add(s);     // index 1
            temp.add(w);     // index 2

            al.add(temp);
            remwt += w;
        }

        // Sort descending based on (w + s)
        al.sort((a, b) -> Long.compare(b.get(0),a.get(0)));

        int result = t;

        // Same logic as C++ loop
        for (int i = 0; i < t && pullpow < remwt; i++) {
            result--;
            remwt -= al.get(i).get(2); // w
            pullpow += al.get(i).get(1); // s
        }

        System.out.println(result);
    }
}
