package Graph;

import java.util.Scanner;

public class GraphMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vertex = sc.nextInt();
        int edges = sc.nextInt();
        int[][] graph = new int[vertex+1][vertex+1];
        for(int i=0;i<edges;i++){
            int u = sc.nextInt();
            int v = sc.nextInt();

            //Undirected Graph
            graph[u][v] = 1;
            graph[v][u] = 1;

//            directed Graph
//            graph[u][v] = 1;
        }
        for(int i=0;i< graph.length;i++){
            for(int j=0;j<graph[0].length;j++){
                System.out.print(graph[i][j]+" ");
            }
            System.out.println();
        }
    }
}
