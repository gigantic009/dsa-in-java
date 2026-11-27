import java.util.ArrayList;
import java.util.List;

/** Builds an undirected adjacency list. */
public class AdjacencyList {
    public static List<List<Integer>> build(int vertices, int[][] edges) {
        if (vertices < 0 || edges == null) {
            throw new IllegalArgumentException("Invalid vertex count or edges");
        }

        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            if (edge == null || edge.length < 2
                    || edge[0] < 0 || edge[0] >= vertices
                    || edge[1] < 0 || edge[1] >= vertices) {
                throw new IllegalArgumentException("Invalid edge");
            }
            // Undirected edges appear in both endpoint lists.
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
        return graph;
    }

    public static void main(String[] args) {
        int[][] edges = {{0, 1}, {0, 2}, {1, 2}};
        System.out.println(build(3, edges));
    }
}