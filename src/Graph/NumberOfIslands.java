package Graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class pair{
    int first,second;
    public pair(int first,int second){
        this.first = first;
        this.second = second;
    }
}
public class NumberOfIslands {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(),n = sc.nextInt();
        int[][] grid = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                grid[i][j] = sc.nextInt();
            }
        }
        int result = numOfIslands(grid);
        System.out.println("Number Of Islands : "+result);
    }

    private static int numOfIslands(int[][] grid) {
        int count = 0;
        int m = grid.length, n= grid[0].length;
        boolean[][] vis = new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!vis[i][j] && grid[i][j]==1){
                    count++;
                    bfs(grid,vis,i,j);
                }
            }
        }
        return count;
    }

    private static void bfs(int[][] grid, boolean[][] vis, int i, int j) {
        vis[i][j] = true;
        int m = grid.length,n = grid[0].length;
        Queue<pair> q = new LinkedList<>();
        q.add(new pair(i,j));
        while(!q.isEmpty()){
            int row = q.peek().first, col = q.peek().second;
            q.remove();
            for(int tempRow = -1; tempRow<=1 ;tempRow++){
                for(int tempCol = -1;tempCol<=1;tempCol++){
                    int nRow = row + tempRow, nCol = col + tempCol;
                    if(nRow>=0&&nRow<m && nCol>=0&&nCol<n && !vis[nRow][nCol] && grid[nRow][nCol]==1){
                        vis[nRow][nCol] = true;
                        q.add(new pair(nRow,nCol));
                    }
                }
            }
        }
    }
}
