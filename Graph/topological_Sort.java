import java.util.ArrayList;
import java.util.Stack;

public class topological_Sort {
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
    public static void topSort(ArrayList<Edge> graph[]){
        Stack<Integer> st = new Stack<>();
        boolean isVisited[] = new boolean[6];

        for(int i=0; i < graph.length; i++){
            if(isVisited[i] == false){
                topSortUtil(graph, i, isVisited,st);
            }
        }

        while(st.size() != 0){
            int s = st.pop();
            System.out.print(s+" ");
        }

    }
    public static void topSortUtil( ArrayList<Edge> graph[] , int curr, boolean isVisited[], Stack<Integer> st){
        isVisited[curr] = true;
        for(int i=0; i < graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(isVisited[e.dest] == false){
                topSortUtil(graph, e.dest, isVisited,st);
            }
        }
        st.add(curr);
    }
    public static void main(String[] args) {
        ArrayList<Edge> graph[] = new ArrayList[6];  // Consistent graph size (6 nodes)
        Creation(graph);
        topSort(graph);
       

    }
}
