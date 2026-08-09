package RHP_CLASS;
import java.util.*;

// Question : Given a string which contains lowercase alphabets rearrange it and form a palindrome
public class XOROperationInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int flag = 0;
        for(char ch:s.toCharArray()){
            flag = flag ^ (1<<(ch-'a'));
        }
        if(flag==0 || ((flag&(flag-1))==0)){
            System.out.print("YES");
        }else{
            System.out.print("NO");
        }
    }
}
