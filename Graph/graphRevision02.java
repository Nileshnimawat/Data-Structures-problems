import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class graphRevision02 {
    public static class Edge{
        int src;
        int dest;
        Edge(int src, int dest){
            this.src = src;
            this.dest = dest;
        }
    }

    public static void Creation(ArrayList<Edge> graph[]){
        for(int i=0; i < graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 2));
        graph[2].add(new Edge(2, 3));
        //graph[3].add(new Edge(3, 0));
    }

    public static void bfs(ArrayList<Edge> graph[] , int n){
        Queue<Integer> q = new LinkedList<>();
        boolean isVisited[] = new boolean[n];
        q.add(0);
        while(q.size() != 0){
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

    public static void dfs(ArrayList<Edge> graph[], int curr, boolean isVisited[]){
        if(isVisited[curr] == false){
            System.out.println(curr);
            isVisited[curr] = true;
            for(int i=0; i < graph[curr].size(); i++){
                Edge e = graph[curr].get(i);
               dfs(graph, e.dest, isVisited);
            }
        }
    }

    public static boolean isCyclic(ArrayList<Edge> graph[], int curr, int parent, boolean isVisited[]) {
        isVisited[curr] = true;
    
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (isVisited[e.dest] && e.dest != parent) {
                return true;
            }
            else if (!isVisited[e.dest]) {
                if (isCyclic(graph, e.dest, curr, isVisited)) {
                    return true;  
                }
            }
        }
        return false;  // No cycle found
    }

    public static boolean isCyclicDirected(ArrayList<Edge> graph[], boolean isVisited[], boolean recStack[], int curr){
        isVisited[curr] = true;
        recStack[curr] = true;
        
        if(isVisited[curr] == false){
            for(int i=0; i < graph[curr].size(); i++){
                Edge e = graph[curr].get(i);
                if(recStack[e.dest] == true){
                    return true;
                }
                if(isVisited[e.dest] == false){
                    if(isCyclicDirected(graph, isVisited, recStack, e.dest)){
                        return true;
                    }
                }
            }
        }
        recStack[curr] = false;
        return false;
        
    }
    

    public static void main(String[] args) {
        ArrayList<Edge> graph[] = new ArrayList[6];  // Consistent graph size (6 nodes)
        Creation(graph);
    
        boolean isVisited[] = new boolean[6];  // Ensure the array matches the graph size
        boolean recStack[] = new boolean[6];
        // Check for cycles
        if (isCyclicDirected(graph,isVisited,recStack,0)) {
            System.out.println("Graph contains a cycle");
        } else {
            System.out.println("Graph does not contain a cycle");
        }
    }
    
}
