package PracticeProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FindIndexOfElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1,2,3,4,4,4,5,6,6,7));
        int target = 4;
        System.out.println(al.indexOf(target)+" <---> "+al.lastIndexOf(target));
    }
}
