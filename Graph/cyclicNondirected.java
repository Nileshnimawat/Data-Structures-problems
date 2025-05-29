import java.util.*;
public class cyclicNondirected {
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
        graph[0].add(new Edge(0, 4));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 4));

        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 3));
        
        graph[3].add(new Edge(3, 2));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));
        graph[4].add(new Edge(4, 2));

       
        graph[5].add(new Edge(5, 4));  
    }
    public static boolean isCyclic(ArrayList<Edge> graph[], int curr , int parent , boolean isVisited[] ){
        isVisited[curr] = true;

        for(int i=0; i < graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(e.dest == parent && curr != parent){
                return true;
            }
            if(!isVisited[curr]){
                isCyclic(graph, e.dest, curr, isVisited);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Edge> graph[] = new ArrayList[5];
        creation(graph);
        
        boolean isVisited[] = new boolean[5];
        
        System.out.println(isCyclic(graph, 0, 0, isVisited));
    }
}
