import java.util.ArrayList;
import java.util.PriorityQueue;

public class prims_algo {
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

    public static void graphCreation(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));

        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 3, 40));

        graph[2].add(new Edge(2, 0, 15));
        graph[2].add(new Edge(2, 3, 50));

        graph[3].add(new Edge(3, 1, 40));
        graph[3].add(new Edge(3, 2, 50));
    }
    
    public static class Pair implements Comparable<Pair> {
        int nodeD;
        int dist;
        Pair(int nodeD, int dist) {
            this.nodeD = nodeD;
            this.dist = dist;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.dist - p2.dist;
        }
    }

    public static int Prims(ArrayList<Edge> graph[]) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        boolean isVisited[] = new boolean[graph.length];

        pq.add(new Pair(0, 0));
        int mst = 0;

        System.out.println("Nodes in the MST with their weights:");
        while (!pq.isEmpty()) {
            Pair curr = pq.remove();
            if (!isVisited[curr.nodeD]) {
                mst += curr.dist;
                isVisited[curr.nodeD] = true;

                // **Print the node and its weight in the MST**
                System.out.println("Node: " + curr.nodeD + ", Weight: " + curr.dist);

                for (int i = 0; i < graph[curr.nodeD].size(); i++) {
                    Edge e = graph[curr.nodeD].get(i);
                    if (!isVisited[e.dest]) {
                        pq.add(new Pair(e.dest, e.wt));
                    }
                }
            }
        }
        return mst;
    }

    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge> graph[] = new ArrayList[V];
        graphCreation(graph);
        int min = Prims(graph);
        System.out.println("Minimum cost of MST: " + min);
    }
}
