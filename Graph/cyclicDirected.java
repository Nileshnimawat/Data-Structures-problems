import java.util.*;
public class cyclicDirected{
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
        
        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 2));
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 0));
       
    }
    public static boolean isCyclic(ArrayList<Edge> graph[], int curr , boolean recStack[] , boolean isVisited[] ){
        isVisited[curr] = true;
        recStack[curr] = true;

        for(int i=0; i < graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(recStack[e.dest] == true){
                return true;
            }
            else {
                if(!isVisited[e.dest] && isCyclic(graph, e.dest, recStack, isVisited) == true){
                    return true;
                }
            }
            recStack[curr] = false;
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Edge> graph[] = new ArrayList[4];
        creation(graph);
        boolean recStack[] = new boolean[4];
        boolean isVisited[] = new boolean[4];
        
        System.out.println(isCyclic(graph, 0, recStack, isVisited));
    }
}