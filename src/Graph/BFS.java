package Graph;

import java.util.*;

public class BFS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vertex = sc.nextInt();
        int edges = sc.nextInt();
        ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<vertex+1;i++){
            graph.add(new ArrayList<Integer>());
        }
        for(int i=0;i<edges;i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        int startNode = sc.nextInt();

        List<Integer> result = bfsTraversal(vertex,graph,startNode);
        result.forEach(a->System.out.print(a+" "));
    }
    public static List<Integer> bfsTraversal(int vertex,ArrayList<ArrayList<Integer>> graph, int startNode){
        List<Integer> list = new ArrayList<>();
        Queue<Integer> que = new LinkedList<>();
        boolean[] vis = new boolean[vertex+1];

        que.add(startNode);
        vis[startNode] = true;
        while(!que.isEmpty()){
            int node = que.poll();
            list.add(node);
            for(int n:graph.get(node)){
                if(!vis[n]){
                    vis[n] = true;
                    que.add(n);
                }
            }
        }
        return list;
    }
}
