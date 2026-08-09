package RHP_CLASS;

import java.util.Scanner;

// Leetcode 200 Number of Islands
public class NumberOfIsland {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        char[][] arr = new char[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.next().charAt(0);
            }
        }
    }
}
