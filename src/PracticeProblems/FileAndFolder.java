package PracticeProblems;

import java.util.*;

public class FileAndFolder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Map<String,Integer> map = new LinkedHashMap<>();
        List<String> result = new ArrayList<>();
        for(int i=0;i<n;i++){
            String str = sc.nextLine();
            map.put(str,map.getOrDefault(str,0)+1);
        }
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            if(entry.getValue() > 1){
                String[] str = entry.getKey().split("\\s+");
                result.add(str[1]);
            }
        }
        System.out.println(result);
    }
}
