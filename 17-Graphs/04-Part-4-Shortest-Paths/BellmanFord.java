import java.util.Arrays;

/** Bellman-Ford supports negative edges and detects reachable negative cycles. */
public class BellmanFord {
    public static long[] run(int vertices, int[][] edges, int source) {
        if (vertices <= 0 || source < 0 || source >= vertices || edges == null) {
            throw new IllegalArgumentException("Invalid vertices, edges, or source");
        }

        for (int[] edge : edges) {
            if (edge == null || edge.length < 3
                    || edge[0] < 0 || edge[0] >= vertices
                    || edge[1] < 0 || edge[1] >= vertices) {
                throw new IllegalArgumentException("Invalid edge");
            }
        }

        long[] distance = new long[vertices];
        Arrays.fill(distance, Long.MAX_VALUE);
        distance[source] = 0;

        // Relax every edge up to V - 1 times.
        for (int pass = 1; pass < vertices; pass++) {
            boolean changed = false;

            for (int[] edge : edges) {
                int from = edge[0];
                int to = edge[1];
                int weight = edge[2];

                if (distance[from] != Long.MAX_VALUE
                        && distance[from] + weight < distance[to]) {
                    distance[to] = distance[from] + weight;
                    changed = true;
                }
            }

            if (!changed) {
                break;
            }
        }

        // A further improvement means a reachable negative cycle exists.
        for (int[] edge : edges) {
            int from = edge[0];
            int to = edge[1];
            int weight = edge[2];

            if (distance[from] != Long.MAX_VALUE
                    && distance[from] + weight < distance[to]) {
                throw new IllegalArgumentException("Reachable negative cycle");
            }
        }

        return distance;
    }
}
