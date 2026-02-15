package Recursion;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Fibonacci series upto N : ");
        for(int i = 0;i<=n;i++){
            System.out.println(fibonacci(i));
        }
    }

    private static int fibonacci(int n) {
        if(n<2){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
