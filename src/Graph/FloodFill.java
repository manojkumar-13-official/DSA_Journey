package Graph;

import java.util.Scanner;

public class FloodFill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(),n = sc.nextInt();
        int[][] image = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                image[i][j] = sc.nextInt();
            }
        }
        int startRow = sc.nextInt(),startCol = sc.nextInt();
        int newColor = sc.nextInt();
        int[][] result = floodFillAlgorithm(startRow,startCol,image,newColor);
        for (int[] ins : result) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(ins[j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] floodFillAlgorithm(int startRow, int startCol, int[][] image, int newColor) {
        int initialColor = image[startRow][startCol];
        int[] delRow = {-1,0,1,0};
        int[] delCol = {0,1,0,-1};
        dfs(startRow,startCol,image, image,delRow,delCol,initialColor,newColor);
        return image;
    }

    private static void dfs(int startRow, int startCol, int[][] image, int[][] ans, int[] delRow, int[] delCol, int initialColor, int newColor) {
        ans[startRow][startCol] = newColor;
        int m = image.length,n = image[0].length;
        for(int i=0;i<4;i++){
            int nRow = startRow + delRow[i];
            int nCol = startCol + delCol[i];
            if(nRow>=0&&nRow<m && nCol>=0&&nCol<n && image[nRow][nCol]==initialColor && ans[nRow][nCol]!=newColor){
                dfs(nRow,nCol,image,ans,delRow,delCol,initialColor,newColor);
            }
        }
    }

    // Time Complexity : O(M x N)
    // Space Complexity : O(M x N)
    // LeetCode Number : 733
}
