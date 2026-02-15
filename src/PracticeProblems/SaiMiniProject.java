package PracticeProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class SaiMiniProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> credit = new ArrayList<Integer>();
        int initialBalance = Integer.parseInt(sc.nextLine());
        int n = Integer.parseInt(sc.nextLine());
        int result = initialBalance;
        for(int i=0;i<n;i++){
            String s = sc.nextLine();
            if(!(s.equals("read")||s.equals("commit"))){
                String[] arr = s.split("(\\s+)");
                String op = arr[0];
                int num = Integer.parseInt(arr[1]);
                if(Objects.equals(op, "credit")){
                    result+=num;
                    credit.add(num);
                }else if(Objects.equals(op, "debit")){
                    result-=num;
                }else if(Objects.equals(op, "abort")){
                    result-=credit.get(num-1);
                }
            }
        }
        System.out.print(initialBalance+"\n"+result);
    }
}
