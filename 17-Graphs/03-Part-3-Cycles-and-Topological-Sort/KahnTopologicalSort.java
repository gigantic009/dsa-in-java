import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/** Kahn's algorithm; an empty result indicates a directed cycle. */
public class KahnTopologicalSort {
    public static List<Integer> sort(List<List<Integer>> graph) {
        BFS.validateGraph(graph);

        int vertices = graph.size();
        int[] indegree = new int[vertices];

        for (List<Integer> neighbors : graph) {
            for (int neighbor : neighbors) {
                indegree[neighbor]++;
            }
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

        if (order.size() == vertices) {
            return order;
        }
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            graph.add(new ArrayList<>());
        }

        graph.get(0).add(1);
        graph.get(0).add(2);
        graph.get(1).add(3);
        graph.get(2).add(3);

        System.out.println(sort(graph));
    }
}
