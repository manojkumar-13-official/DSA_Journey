package PracticeProblems;
import java.util.*;
public class ValidAnagram {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            String s1 = sc.nextLine();
            String s2 = sc.nextLine();

            System.out.println(isAnagram(s1, s2));
        }
    // Brute force approach
//    public static boolean isAnagram(String s1, String s2) {
//        // Different lengths cannot be anagrams
//        if (s1.length() != s2.length()) {
//            return false;
//        }
//
//        char[] a = s1.toCharArray();
//        char[] b = s2.toCharArray();
//
//        // Sort both strings
//        Arrays.sort(a);
//        Arrays.sort(b);
//
//        // Compare sorted arrays
//        return Arrays.equals(a, b);
//    }

        // Optimal Way with character frequency maintenance
        public static boolean isAnagram(String s1, String s2) {
            if (s1.length() != s2.length()) {
                return false;
            }

            int[] freq = new int[26];
            for (int i = 0; i < s1.length(); i++) {
                freq[s1.charAt(i) - 'a']++;
            }

            // Remove characters using s2
            for (int i = 0; i < s2.length(); i++) {
                freq[s2.charAt(i) - 'a']--;
            }
            for (int count : freq) {
                if (count != 0) {
                    return false;
                }
            }

            return true;
        }
}
