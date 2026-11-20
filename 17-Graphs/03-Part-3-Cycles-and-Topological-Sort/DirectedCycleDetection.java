import java.util.ArrayList;
import java.util.List;

/** Detects directed cycles using DFS states: unvisited, active, and finished. */
public class DirectedCycleDetection {
    public static boolean hasCycle(List<List<Integer>> graph) {
        BFS.validateGraph(graph);

        int[] state = new int[graph.size()];
        for (int vertex = 0; vertex < graph.size(); vertex++) {
            if (state[vertex] == 0 && dfs(vertex, graph, state)) {
                return true;
            }
        }
        return false;
    }

    private static boolean dfs(int vertex, List<List<Integer>> graph, int[] state) {
        state[vertex] = 1;

        for (int neighbor : graph.get(vertex)) {
            if (state[neighbor] == 1) {
                return true;
            }
            if (state[neighbor] == 0 && dfs(neighbor, graph, state)) {
                return true;
            }
        }

        state[vertex] = 2;
        return false;
    }

    public static void main(String[] args) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            graph.add(new ArrayList<>());
        }

        graph.get(0).add(1);
        graph.get(1).add(2);
        graph.get(2).add(0);

        System.out.println(hasCycle(graph));
    }
}
