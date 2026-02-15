package Graph;
import java.util.*;
public class DFS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vertex = sc.nextInt();
        int edges = sc.nextInt();
//        int vertex = 8,edges = 8;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i=0;i<vertex+1;i++) {
            graph.add(new ArrayList<Integer>());
        }
        for(int i=0;i<edges;i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        int startNode = sc.nextInt();

        List<Integer> result = dfsTraversal(vertex,graph,startNode);
        result.forEach(a->System.out.print(a+" "));
    }

    private static List<Integer> dfsTraversal(int vertex, ArrayList<ArrayList<Integer>> graph, int startNode) {
        List<Integer> list = new ArrayList<>();
        boolean[] vis = new boolean[vertex+1];
        Stack<Integer> stack = new Stack<>();

        stack.push(startNode);
        while(!stack.isEmpty()){
            int node = stack.pop();
            if(!vis[node]){
                list.add(node);
                vis[node] = true;
                for(int val:graph.get(node)){
                    if(!vis[val]){
                        stack.add(val);
//                        vis[val] = true;
                    }
                }
            }
        }

        //{Recursion way}
//        vis[startNode] = true;
//        list.add(startNode);
//        for(int n: graph.get(startNode)){
//            if(!vis[n]){
//                dfsTraversal(vertex,graph,n);
//            }
//        }
        return  list;
    }
}
