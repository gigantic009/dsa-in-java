import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

/** BFS distances; -1 denotes an unreachable vertex. */
public class UnweightedShortestPath {
    public static int[] distances(List<List<Integer>> graph, int source) {
        BFS.validateGraphAndStart(graph, source);

        int[] distance = new int[graph.size()];
        Arrays.fill(distance, -1);
        distance[source] = 0;

        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(source);

        while (!queue.isEmpty()) {
            int vertex = queue.remove();

            for (int neighbor : graph.get(vertex)) {
                if (distance[neighbor] == -1) {
                    distance[neighbor] = distance[vertex] + 1;
                    queue.add(neighbor);
                }
            }
        }

        return distance;
    }

    public static void main(String[] args) {
        List<List<Integer>> graph = AdjacencyList.build(5,
                new int[][]{{0, 1}, {1, 2}, {3, 4}});
        System.out.println(Arrays.toString(distances(graph, 0)));
    }
}
