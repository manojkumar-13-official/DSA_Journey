package PracticeProblems;

import java.util.Scanner;

public class CRC {
    public static void main(String[] args) {
        String msg = "1010000";
        String divisor = "1001";
        String dmsg = msg;
        int i=0;
        while(i<divisor.length()-1){
            dmsg = dmsg+"0";
            i++;
        }
        String sender = senderSideCalculation(dmsg,divisor);
        int receiverMsg = Integer.parseInt(dmsg,2) + Integer.parseInt(sender,2);
        String receiver = receiverSideCalculation(Integer.toBinaryString(receiverMsg),divisor);
        System.out.println(receiver);
    }

    private static String receiverSideCalculation(String s, String divisor) {
        int a = Integer.parseInt(s,2);
        int b = Integer.parseInt(divisor,2);

        return Integer.toBinaryString(a^b);
    }

    private static String senderSideCalculation(String dmsg, String divisor) {
        int a = Integer.parseInt(dmsg,2);
        int b = Integer.parseInt(divisor,2);

        return Integer.toBinaryString(a^b);
    }
}
