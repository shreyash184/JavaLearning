import java.util.*;

/**
 * This has
 * 1. Adjacency list implementation
 *
 */

public class Graph {

    public int v;
    public LinkedList<Integer>[] adj;

    public Graph(int v){
        this.v = v;
        adj =  new LinkedList[v];

        for(int i = 0;i<v;i++){
            adj[i] = new LinkedList<>();
        }
    }

    public void addEdge(int u, int v, boolean bidir){
        adj[u].add(v);
        if(bidir){
            adj[v].add(u);
        }
    }

    public void dfs(int src){
        Map<Integer, Boolean> visited = new HashMap<>();
        dfsHelper(src, visited);
    }

    private void dfsHelper(int src, Map<Integer, Boolean> visited) {
        visited.put(src, true);
        System.out.print(src + " ");
        for(int child : adj[src]){
            if(!visited.containsKey(child)){
                dfsHelper(child, visited);
            }
        }
    }

    public void printAdjList(){
        for(int i = 0;i<v;i++) {
            System.out.print(i + "->");
            for (int node : adj[i]) {
                System.out.print(node + ", ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Graph g = new Graph(10);
        g.addEdge(0, 1, true);
        g.addEdge(1, 3, true);
        g.addEdge(1, 2, true);
        g.addEdge(0, 2, true);

        g.dfs(0);

//        g.printAdjList();
    }
}
