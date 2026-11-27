import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

/** Breadth-first traversal from a starting vertex. */
public class BFS {
    public static void traverse(List<List<Integer>> graph, int start) {
        validateGraphAndStart(graph, start);

        boolean[] visited = new boolean[graph.size()];
        Queue<Integer> queue = new ArrayDeque<>();

        visited[start] = true; // Mark when enqueued to avoid duplicate entries.
        queue.add(start);

        while (!queue.isEmpty()) {
            int current = queue.remove();
            System.out.print(current + " ");

            for (int neighbor : graph.get(current)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    static void validateGraph(List<List<Integer>> graph) {
        if (graph == null) {
            throw new IllegalArgumentException("Graph cannot be null");
        }

        for (List<Integer> neighbors : graph) {
            if (neighbors == null) {
                throw new IllegalArgumentException("Neighbor list cannot be null");
            }
            for (Integer vertex : neighbors) {
                if (vertex == null || vertex < 0 || vertex >= graph.size()) {
                    throw new IllegalArgumentException("Invalid neighbor vertex");
                }
            }
        }
    }

    static void validateGraphAndStart(List<List<Integer>> graph, int start) {
        if (graph == null || start < 0 || start >= graph.size()) {
            throw new IllegalArgumentException("Invalid graph or start vertex");
        }
        validateGraph(graph);
    }

    public static void main(String[] args) {
        List<List<Integer>> graph = AdjacencyList.build(5,
                new int[][]{{0, 1}, {0, 2}, {1, 3}, {2, 4}});
        traverse(graph, 0); // 0 1 2 3 4
    }
}
