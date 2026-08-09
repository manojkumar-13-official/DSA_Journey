package StringRelatedProgram;

import java.util.*;
public class PermutationOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Set<String> result = new HashSet<>();
//        permutation(s.toCharArray(),0,result);
        System.out.println(result);
        int permutationCount = performCount(s);
        System.out.println(permutationCount);
    }

    private static int performCount(String s) {
         Map<Character,Integer> map = new HashMap<>();
         for(int i=0;i<s.length();i++){
             map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
         }
         int mainFact = fact(s.length());
         for(Map.Entry<Character,Integer> entry: map.entrySet()){
             if(entry.getValue() > 1){
                 mainFact = mainFact/fact(entry.getValue());
             }
         }

        return mainFact;
    }

    private static int fact(int length) {

        if(length==0 || length==1){
            return 1;
        }
        return length*fact(length-1);
    }


}
