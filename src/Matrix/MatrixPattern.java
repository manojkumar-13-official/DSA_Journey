package Matrix;
import java.util.*;
public class MatrixPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        char[][] matrix = {
                {'+','+','+','+','+'},
                {'+','+','+','*','+'},
                {'+','+','+','*','+'},
                {'+','+','+','*','+'},
                {'*','*','*','*','*'}};
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int[] position = findLengthOfSymbol(matrix);
        int len1 = position[0],len2 = position[1];
        System.out.println(len1+"---"+len2);
//        if(len1 == s1.length()){
//            for(int i=0;i< matrix.length;i++){
//                for (int j = 0; j < matrix[0].length; j++) {
//
//                }
//            }
//        }else{
//
//        }
    }

    private static int[] findLengthOfSymbol(char[][] matrix) {
        int leftToRight = 0,topToBottom = 0;
        for(int i=0;i< matrix.length;i++){
            int iMax = 0;
            int jMax = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == '*'){
                    iMax+=1;
                }
                if(matrix[j][i] == '*'){
                    jMax+=1;
                }
                if(iMax > topToBottom)topToBottom = iMax;
                if(jMax > leftToRight) leftToRight = jMax;
            }
        }
        return new int[]{leftToRight,topToBottom};
    }
}
