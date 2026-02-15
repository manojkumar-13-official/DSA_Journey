package Graph;

import java.util.ArrayList;
import java.util.Scanner;

public class GraphArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vertex = sc.nextInt();
        int edges = sc.nextInt();
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i=0;i<vertex+1;i++){
            graph.add(new ArrayList<Integer>());
        }
        for(int i=0;i<edges;i++){
            int u = sc.nextInt();
            int v = sc.nextInt();

            //Undirected Graph Input Assigning
//            graph.get(u).add(v);
//            graph.get(v).add(u);

            //Directed Graph Input Assigning
            graph.get(u).add(v);
        }
        for(int i=0;i<vertex+1;i++){
            System.out.println(i+"-->"+graph.get(i));
        }
    }
}
