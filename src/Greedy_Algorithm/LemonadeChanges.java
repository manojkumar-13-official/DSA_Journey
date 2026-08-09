package Greedy_Algorithm;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LemonadeChanges {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] bills = {5,5,10,10,20};
        boolean result = lemonadeChange(bills);
        System.out.println(result);
    }
    private static boolean lemonadeChange(int[] bills) {
        if (bills[0] > 5) return false;

        int five = 0, ten = 0;
        for (int bill : bills) {
            if(bill==5){
                five+=1;
            }else if(bill==10){
                ten+=1;
                if(five==0) return false;
                else{
                    five-=1;
                }
            }else if(bill==20){
                if(five==0) return false;
                else if(ten!=0 && five!=0){
                    ten-=1;
                    five-=1;
                }else if(ten==0 && five>=3){
                    five-=3;
                }else return false;
            }
        }
        return true;
    }
}
