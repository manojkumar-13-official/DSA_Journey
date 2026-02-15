package Graph;

import java.util.ArrayList;
import java.util.Scanner;

public class NoOfProvincess  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int m = sc.nextInt(),n = sc.nextInt();
//        int[][] matrix = new int[m][n];
        int m=4,n=4;
        int[][] matrix = {
                {0, 1, 0, 1},
                {1, 0, 1, 0},
                {0, 1, 0, 1},
                {1, 0, 1, 0}
        };
//        for(int i=0;i<m;i++){
//            for(int j=0;j<n;j++){
//                matrix[i][j] = sc.nextInt();
//            }
//        }
        ArrayList<ArrayList<Integer>> graph = convertMatrixToAdjacencyList(matrix);

        int result = numberOfProvincess(graph,graph.size());
        System.out.println(result);
    }

    private static int numberOfProvincess(ArrayList<ArrayList<Integer>> graph,int v) {
        int count = 0;
        boolean[] vis = new boolean[v];
        for(int i=0;i<v;i++){
            if(!vis[i]){
                count++;
                dfs(graph,vis,i);
            }
        }

        return count;
    }

    private static void dfs(ArrayList<ArrayList<Integer>> graph, boolean[] vis, int i) {
        vis[i] = true;
        for(Integer j:graph.get(i)){
            if(!vis[j]){
                dfs(graph,vis,j);
            }
        }
    }

    private static ArrayList<ArrayList<Integer>> convertMatrixToAdjacencyList(int[][] matrix) {
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<ArrayList<Integer>>();

        for(int i=0;i<matrix.length;i++){
            adjList.add(new ArrayList<Integer>());
            for(int j=0;j<matrix.length;j++){
                if(matrix[i][j]==1&&i!=j){
                    adjList.get(i).add(j);
//                    adjList.get(j).add(i);
                }
            }
        }
        return adjList;
    }
}


// Time Complexity : O(n) + O(V+2E)
// Space Complexity : O(n) + O(n)
// LeetCode QuestionNumber : 547
