import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class graphRevesion {
    public static class Edge{
        int src;
        int dest;
        Edge(int src , int dest){
            this.src = src;
            this.dest = dest;
        }
    }

    public static void creation( ArrayList<Edge> graph[]){
        for(int i=0; i < graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }
        
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));
        

        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));
      
        
        graph[4].add(new Edge(4, 3));

    }

    public static void Bfs( ArrayList<Edge> graph[] , int n){
        boolean isVisited[] = new boolean[n];
        Queue<Integer> q = new LinkedList<>();

        q.add(0);
        while(q.size()!=0){
            int curr = q.remove();
            if(isVisited[curr] == false){
                System.out.print(curr+" ");
                isVisited[curr] = true;

                for(int i=0; i < graph[curr].size(); i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    public static void Dfs( ArrayList<Edge> graph[] , int curr, boolean isVisited[]){
        if(isVisited[curr] == false){
        System.out.print(curr+" ");
        isVisited[curr] = true;
        for(int i=0; i < graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            Dfs(graph, e.dest, isVisited);
        }
        }
        
    }

    public static void hasPath(ArrayList<Edge> graph[], int tar, int curr, String str, boolean isVisited[]) {
        if (curr == tar) {
            System.out.println(str);
            return;
        }
    
        isVisited[curr] = true; // Mark the current node as visited
    
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!isVisited[e.dest]) { // Explore the node if it hasn't been visited
                hasPath(graph, tar, e.dest, str + e.dest, isVisited);
            }
        }
    
        isVisited[curr] = false; // Backtrack: unmark the current node
    }
    

    public static void main(String[] args) {
        ArrayList<Edge> graph[] = new ArrayList[7];
        creation(graph);
        boolean isVisited[] = new boolean[7];
      //  Dfs(graph, 0, isVisited);
      hasPath(graph, 5, 0, "0", isVisited);
    }
}
