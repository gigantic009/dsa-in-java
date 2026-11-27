import java.util.Arrays;
import java.util.Comparator;

/** Kruskal's algorithm for a minimum spanning tree of an undirected graph. */
public class KruskalMST {
    /** Returns the MST weight without sorting or modifying the caller's edge array. */
    public static long total(int vertices, int[][] edges) {
        if (vertices < 0 || edges == null) {
            throw new IllegalArgumentException("Invalid vertex count or edges");
        }

        for (int[] edge : edges) {
            if (edge == null || edge.length < 3
                    || edge[0] < 0 || edge[0] >= vertices
                    || edge[1] < 0 || edge[1] >= vertices) {
                throw new IllegalArgumentException("Invalid edge");
            }
        }
        if (vertices == 0) {
            return 0;
        }

        int[][] sortedEdges = edges.clone();
        Arrays.sort(sortedEdges, Comparator.comparingInt(edge -> edge[2]));

        UnionFind unionFind = new UnionFind(vertices);
        long totalWeight = 0;
        int selectedEdges = 0;

        for (int[] edge : sortedEdges) {
            if (unionFind.union(edge[0], edge[1])) {
                totalWeight += edge[2];
                selectedEdges++;

                if (selectedEdges == vertices - 1) {
                    break;
                }
            }
        }

        if (selectedEdges != vertices - 1) {
            throw new IllegalArgumentException("Graph disconnected; MST does not exist");
        }
        return totalWeight;
    }
}
