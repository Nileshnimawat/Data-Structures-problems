import java.util.ArrayList;
import java.util.Arrays;

public class bellmanFord {
    public static class Edge {
        int src;
        int dest;
        int wt;

        Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }

    }

    public static void Creation(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 2, -4));

        graph[2].add(new Edge(2, 3, 2));

        graph[3].add(new Edge(3, 4, 4));

        graph[4].add(new Edge(4, 1, -1));

    }

    public static void bellmanFord(ArrayList<Edge> graph[] , int src){
        int dist[] = new int[graph.length];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        for(int i=0; i < graph.length-1; i++){
            for(int j=0; j < graph.length; j++){
                for(int k=0; k < graph[j].size(); k++){
                    Edge e = graph[j].get(k);
                    int u = e.src;
                    int wt = e.wt;
                    int v = e.dest;
                 if( dist[u] != Integer.MAX_VALUE && dist[u]+wt < dist[v]){
                    dist[v] = dist[u] + wt;
                }
            }
        }

    }
    for(int i=0; i<dist.length; i++){
        System.out.print(dist[i]+" ");
      }
    }
    public static void main(String[] args) {
        ArrayList<Edge> graph[] = new ArrayList[6]; // Consistent graph size (6 nodes)
        Creation(graph);
        bellmanFord(graph, 0);
    }

}
