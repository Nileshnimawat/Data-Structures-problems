import java.util.ArrayList;
import java.util.LinkedList;
import java.util.*;

public class graphTraversals {
    public static class Edge {
        int src;
        int dest;

        Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static void graph_Creation(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

        graph[6].add(new Edge(6, 5));

    }

    public static void bfs(ArrayList<Edge> graph[]) {
        Queue<Integer> q = new LinkedList<>();
        boolean isVisited[] = new boolean[graph.length];

        q.add(0);
        while (q.size() != 0) {
            int curr = q.poll();
            if (isVisited[curr] == false) {
                System.out.print(curr + " ");
                isVisited[curr] = true;
                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
        System.out.println();
    }

    public static void dfs(ArrayList<Edge> graph[]){
        boolean isVisited[] = new boolean[graph.length];
        for(int i=0; i < graph.length; i++){
            if(isVisited[i] == false){
                helperDfs(graph, isVisited, i);
            }
        }
    }

    public static void helperDfs(ArrayList<Edge> graph[], boolean[] isVisited, int curr) {
        if (isVisited[curr] == false) {
            System.out.print(curr + " ");
            isVisited[curr] = true;
            for (int i = 0; i < graph[curr].size(); i++) {
                Edge e = graph[curr].get(i);
                helperDfs(graph, isVisited, e.dest);
            }
        }
    }

    public static void main(String[] args) {
        int V = 7;
        ArrayList<Edge> graph[] = new ArrayList[V];
        graph_Creation(graph);
        bfs(graph);
        boolean isVisited[] = new boolean[V];
        dfs(graph);
    }
}
