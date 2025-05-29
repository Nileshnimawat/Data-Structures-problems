import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class topSortBfs {
       public static class Edge{
        int src;
        int dest;
        Edge(int src , int dest){
            this.src = src;
            this.dest = dest;
        }
    }

    public static void Creation( ArrayList<Edge> graph[]){
        for(int i=0; i < graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }
        
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));
        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
      
       
    }

    public static void counter(ArrayList<Edge> graph[], int inDegree[]){
        for(int i=0; i < graph.length; i++){
            int curr = i;
            for(int j=0; j < graph[curr].size(); j++){
                Edge e = graph[curr].get(j);
                inDegree[e.dest]++;
            }
        }
    }
    public static void topSort(ArrayList<Edge> graph[]){
        Queue<Integer> q = new LinkedList<>();
        int inDegree[] = new int[graph.length];
        counter(graph, inDegree);

        for(int i=0; i < inDegree.length; i++){
            if(inDegree[i] == 0){
                q.add(i);
            }
        }
        while(q.size() != 0){
            int curr = q.remove();
            System.out.print(curr+" ");
            for(int i=0; i < graph[curr].size(); i++){
                Edge e = graph[curr].get(i);
                inDegree[e.dest]--;
                if(inDegree[e.dest]==0){
                    q.add(e.dest);
                }
            }
        }

    }
   
    public static void main(String[] args) {
        ArrayList<Edge> graph[] = new ArrayList[6];  // Consistent graph size (6 nodes)
        Creation(graph);
        topSort(graph);
       

    }
}
