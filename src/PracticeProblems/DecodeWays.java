package PracticeProblems;
import java.util.*;
public class DecodeWays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int result = countDecodeWays(str);
        System.out.println(result);
    }

    private static int countDecodeWays(String str) {
        int count = 0;
        if(str==null||str.isEmpty()){
            return 0;
        }
        int len = str.length();
        List<String> al = new ArrayList<>();
        for(int i=0;i<len;i++){
            for(int j=i+1;j<=len;j++){
                int num = Integer.parseInt(str.substring(i,j));
                if(num>=1&&num<=26){
                    al.add(String.valueOf(num));
                }
            }
        }

        for(int i=0;i<al.size()-1;i++){
            String temp = al.get(i);
            for(int j=i+1;j<al.size();j++){
                String prevTemp =temp;
                temp+=al.get(j);
                System.out.println(prevTemp+"----"+temp);
                int tempLen = temp.length();
                if(len==tempLen){
                    if(str.equals(temp)) {
                        count += 1;
                        System.out.println(al.get(i)+","+al.get(j));
                    }
                }else {
                    if (tempLen > len) {
//                        temp = prevTemp;
                        temp = al.get(i);
                    }else{
                        continue;
                    }
                }
            }
        }
        System.out.println(al);
        return count;
    }
}
