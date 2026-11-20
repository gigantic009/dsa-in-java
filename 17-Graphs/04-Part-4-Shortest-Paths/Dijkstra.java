import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

/** Dijkstra shortest paths for graphs with nonnegative edge weights. */
public class Dijkstra {
    public static class Edge {
        public final int to;
        public final int weight;

        public Edge(int to, int weight) {
            if (to < 0 || weight < 0) {
                throw new IllegalArgumentException("Destination and weight must be nonnegative");
            }
            this.to = to;
            this.weight = weight;
        }
    }

    public static long[] distances(List<List<Edge>> graph, int source) {
        if (graph == null || source < 0 || source >= graph.size()) {
            throw new IllegalArgumentException("Invalid graph or source");
        }

        int vertices = graph.size();
        for (List<Edge> neighbors : graph) {
            if (neighbors == null) {
                throw new IllegalArgumentException("Neighbor list cannot be null");
            }
            for (Edge edge : neighbors) {
                if (edge == null || edge.to >= vertices) {
                    throw new IllegalArgumentException("Invalid edge");
                }
            }
        }

        long[] distance = new long[vertices];
        Arrays.fill(distance, Long.MAX_VALUE);
        distance[source] = 0;

        PriorityQueue<long[]> queue = new PriorityQueue<>(
                (first, second) -> Long.compare(first[1], second[1]));
        queue.add(new long[]{source, 0});

        while (!queue.isEmpty()) {
            long[] current = queue.remove();
            int vertex = (int) current[0];
            long currentDistance = current[1];

            // Ignore entries that no longer match the best known distance.
            if (currentDistance != distance[vertex]) {
                continue;
            }

            for (Edge edge : graph.get(vertex)) {
                long candidate = currentDistance + edge.weight;
                if (candidate < distance[edge.to]) {
                    distance[edge.to] = candidate;
                    queue.add(new long[]{edge.to, candidate});
                }
            }
        }

        return distance;
    }
}
