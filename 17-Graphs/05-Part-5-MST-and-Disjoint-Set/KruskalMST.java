// Kruskal minimum spanning tree. Uses long to safely accumulate edge weights.
import java.util.*;
public class KruskalMST {
    public static long total(int n, int[][] edges) {
        if (n < 0) throw new IllegalArgumentException("Vertex count cannot be negative");
        if (n == 0) return 0;
        for (int[] edge : edges) {
            if (edge == null || edge.length < 3 || edge[0] < 0 || edge[0] >= n
                    || edge[1] < 0 || edge[1] >= n) {
                throw new IllegalArgumentException("Invalid edge");
            }
        }
        Arrays.sort(edges, Comparator.comparingInt(e -> e[2]));
        UnionFind uf = new UnionFind(n);
        long sum = 0; int count = 0;
        for (int[] edge : edges) {
            if (uf.union(edge[0], edge[1])) {
                sum += edge[2];
                if (++count == n - 1) break;
            }
        }
        if (count != n - 1) throw new IllegalArgumentException("Graph disconnected");
        return sum;
    }
}