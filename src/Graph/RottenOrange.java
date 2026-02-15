package Graph;

//Given a matrix mat[][] of dimension n * m where each cell in the matrix can have values 0, 1 or 2 which has the following meaning:
//        0 : Empty cell
//        1 : Cell have fresh oranges
//        2 : Cell have rotten oranges
//
//        We have to determine what is the earliest time after which all the oranges are rotten. A rotten orange at index (i, j) can rot other fresh orange at indexes (i-1, j), (i+1, j), (i, j-1), (i, j+1) (up, down, left and right) in a unit time.
//
//        Note: Your task is to return the minimum time to rot all the fresh oranges. If not possible returns -1.


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class GroupPair{
    int row,col,time;

    public GroupPair(int col, int row, int time) {
        this.col = col;
        this.row = row;
        this.time = time;
    }
}

public class RottenOrange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), n = sc.nextInt();
        int[][] mat = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.print("Minimum time to rot all the fresh oranges : "+rotFreshOranges(mat));
    }

    private static int rotFreshOranges(int[][] mat) {
        int m = mat.length , n = mat[0].length,fresh = 0, count = 0;
        int[][] vis = new int[m][n];
        Queue<GroupPair> q = new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==2){
                    q.add(new GroupPair(i,j,0));
                    vis[i][j] = 2;
                }else{
                    vis[i][j] = 0;
                }
                if(mat[i][j] == 1){
                    fresh++;
                }
            }
        }
        int tm = 0;
        int[] drow = {-1,0,1,0};
        int[] dcol = {0,1,0,-1};
        while (!q.isEmpty()){
            int r = q.peek().row, c = q.peek().col, time = q.peek().time;
            tm = Math.max(tm,time);
            q.remove();
            for(int i=0;i<4;i++){
                int nrow = r + drow[i];
                int ncol = c + dcol[i];
                if((nrow >=0 && nrow < m) && (ncol >=0 && ncol<n) && vis[nrow][ncol]!=2 && mat[nrow][ncol]==1){
                    q.add(new GroupPair(nrow,ncol,time+1));
                    count++;
                }
            }
        }
        if(count!=fresh) return -1;
        return tm;
    }
}
