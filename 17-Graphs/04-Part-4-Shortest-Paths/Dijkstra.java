// Dijkstra shortest paths for nonnegative edge weights. Distances use long to avoid int overflow.
import java.util.*;
public class Dijkstra {
    static class Edge {
        int to, weight;
        Edge(int to, int weight) {
            if (weight < 0) throw new IllegalArgumentException("Dijkstra requires nonnegative weights");
            this.to = to; this.weight = weight;
        }
    }
    public static long[] distances(List<List<Edge>> graph, int source) {
        int n = graph.size();
        if (source < 0 || source >= n) throw new IllegalArgumentException("Invalid source");
        long[] distance = new long[n];
        Arrays.fill(distance, Long.MAX_VALUE);
        distance[source] = 0;
        PriorityQueue<long[]> pq = new PriorityQueue<>(Comparator.comparingLong(a -> a[1]));
        pq.add(new long[]{source, 0});
        while (!pq.isEmpty()) {
            long[] current = pq.remove();
            int u = (int) current[0]; long dist = current[1];
            if (dist != distance[u]) continue;
            for (Edge edge : graph.get(u)) {
                long candidate = dist + edge.weight;
                if (candidate < distance[edge.to]) {
                    distance[edge.to] = candidate;
                    pq.add(new long[]{edge.to, candidate});
                }
            }
        }
        return distance;
    }
}