import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Dikshtra_Algo {
    public static class Edge{
        int src;
        int dest;
        int wt;
        Edge(int src, int dest, int wt){
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    public static void graphCreation(ArrayList<Edge> graph []){
        for(int i=0; i < graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 1,2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 7));

        graph[2].add(new Edge(2, 4, 3));

        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));
    }
    
    public static class Pair implements Comparable<Pair>{
        int nodeD;
        int dist;
        Pair(int nodeD, int dist){
            this.nodeD = nodeD;
            this.dist = dist;
        }
        @Override
        public int compareTo(Pair p2){
            return this.dist - p2.dist;
        }
    }

    public static void Dikshtra(ArrayList<Edge> graph[]){
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        int dist[] = new int[graph.length];
        boolean isVisited[] = new boolean[graph.length];

        pq.add(new Pair(0, 0));
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[0] = 0;

        while(pq.size() != 0){
            Pair curr = pq.remove();
            if(isVisited[curr.nodeD] == false){
                isVisited[curr.nodeD] = true;
                for(int i=0; i < graph[curr.nodeD].size(); i++){
                    Edge e = graph[curr.nodeD].get(i);
                    int u = e.src;
                    int v = e.dest;
                    int wt = e.wt;
                    if(dist[u] + wt < dist[v]){
                        dist[v] = dist[u] + wt;
                        pq.add(new Pair(v, dist[v]));
                    }
                }
            }
        }

        for(int i=0; i < dist.length; i++){
            System.out.print(dist[i]+" ");
        }
    }


    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        graphCreation(graph);
        Dikshtra(graph);
    }
}
