import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/** Returns a topological order for a directed acyclic graph. */
public class TopologicalSort {
    public static List<Integer> sort(int vertices, int[][] edges) {
        if (vertices < 0 || edges == null) {
            throw new IllegalArgumentException("Invalid vertex count or edges");
        }

        List<List<Integer>> graph = new ArrayList<>();
        int[] indegree = new int[vertices];

        for (int vertex = 0; vertex < vertices; vertex++) {
            graph.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            if (edge == null || edge.length < 2
                    || edge[0] < 0 || edge[0] >= vertices
                    || edge[1] < 0 || edge[1] >= vertices) {
                throw new IllegalArgumentException("Invalid edge");
            }
            graph.get(edge[0]).add(edge[1]);
            indegree[edge[1]]++;
        }

        Queue<Integer> queue = new ArrayDeque<>();
        for (int vertex = 0; vertex < vertices; vertex++) {
            if (indegree[vertex] == 0) {
                queue.add(vertex);
            }
        }

        List<Integer> order = new ArrayList<>();
        while (!queue.isEmpty()) {
            int vertex = queue.remove();
            order.add(vertex);

            for (int neighbor : graph.get(vertex)) {
                indegree[neighbor]--;
                if (indegree[neighbor] == 0) {
                    queue.add(neighbor);
                }
            }
        }

        if (order.size() != vertices) {
            throw new IllegalArgumentException("Graph contains a cycle");
        }
        return order;
    }

    public static void main(String[] args) {
        int[][] edges = {{0, 1}, {0, 2}, {1, 3}, {2, 3}};
        System.out.println(sort(4, edges));
    }
}
