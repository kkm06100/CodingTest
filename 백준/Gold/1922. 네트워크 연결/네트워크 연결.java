import java.util.*;
import java.lang.*;
import java.io.*;


class Main {
    static class Edge implements Comparable<Edge> {

        int from;
        int to;
        int weight;

        public Edge(int from, int to, int weight) {
            this.from = from;
            this.to = to;
            this.weight = weight;
        }

        @Override
        public int compareTo(Edge o) {
            return this.weight - o.weight;
        }
}
    static int V;
    static int E;
    static int[] parent;
    static int[] rank;
    static PriorityQueue<Edge> edges;


    
    public static int find(int x){
        if(parent[x] == x){
            return x;
        }else{
            return parent[x] = find(parent[x]);
        }
    }
    static void union(int x, int y) {
        x = find(x);
        y = find(y);

        if (x == y) {
            return;
        }

        if (rank[x] < rank[y]) {
            parent[x] = y;
        } else {
            parent[y] = x;

            if (rank[x] == rank[y]) {
                rank[x]++;
            }
        }
    }
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        V = Integer.parseInt(br.readLine()); // 정점 개수
        E = Integer.parseInt(br.readLine()); // 간선 개수
        
        parent = new int[V + 1];
        rank = new int[V + 1];
        edges = new PriorityQueue<>();
        int sum = 0;
        for(int i = 0; i <= V; i++){
            parent[i] = i;
        }
        for(int i = 0; i < E; i++){
            String[] input = br.readLine().split(" ");
            int from = Integer.parseInt(input[0]);
            int to = Integer.parseInt(input[1]);
            int weight = Integer.parseInt(input[2]);
            edges.add(new Edge(from, to, weight));
        }
        while(!edges.isEmpty()){
            Edge edge = edges.poll();
            if (find(edge.from) == find(edge.to)) {
                continue;
            }
            union(edge.from, edge.to);
            sum+=edge.weight;
        }
        System.out.println(sum);
    }
}