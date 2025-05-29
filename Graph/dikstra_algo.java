import java.util.*;
public class dikstra_algo {

    public static class Edge {
        int src;
        int dest;
        int wt;
        Edge(int src , int dest, int wt){
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    public static class Pair implements Comparable<Pair>{
        int n;
        int path;
        Pair(int n, int path){
            this.n = n;
            this.path = path;
        }

        @Override
        public int compareTo(Pair p2){
            return this.path - p2.path;
        }

    }

    public static void Creation( ArrayList<Edge> graph[]){
        for(int i=0; i < graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }
        
        graph[0].add(new Edge(0, 1,2));
        graph[0].add(new Edge(0, 2,4));

        graph[1].add(new Edge(1,3, 7));
        graph[1].add(new Edge(1, 2, 1));

        graph[2].add(new Edge(2, 4, 3));

        graph[3].add(new Edge(3,5, 1));

        graph[4].add(new Edge(4,3, 2));
        graph[4].add(new Edge(4, 5, 5)); 
       
    }

    public static void dikstra(ArrayList<Edge> graph[] , int src){
      int dist[] = new int[graph.length];
      Arrays.fill(dist, Integer.MAX_VALUE);
      dist[src] = 0;

      boolean isVisited[] = new boolean[graph.length];
      PriorityQueue<Pair> pq = new PriorityQueue<>();
      pq.add(new Pair(src, 0));

      while(pq.size() != 0){
         Pair curr = pq.remove();
         if(isVisited[curr.n] == false){
            for(int i=0; i < graph[curr.n].size(); i++){
                Edge e = graph[curr.n].get(i);
                int u = e.src;
                int wt = e.wt;
                int v = e.dest;
                if(dist[u]+wt < dist[v]){
                    dist[v] = dist[u] + wt;
                    pq.add(new Pair(v, dist[v]));
                }
            }
         }

      }
      for(int i=0; i<dist.length; i++){
        System.out.print(dist[i]+" ");
      }

    }
    public static void main(String[] args) {
        ArrayList<Edge> graph[] = new ArrayList[6];  // Consistent graph size (6 nodes)
        Creation(graph);
        dikstra(graph, 0);
    }
}
