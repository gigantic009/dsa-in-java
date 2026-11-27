import java.util.List;

/** Detects cycles in an undirected graph using DFS and parent-edge tracking. */
public class CycleDetectionUndirected {
    public static boolean hasCycle(List<List<Integer>> graph) {
        BFS.validateGraph(graph);

        boolean[] visited = new boolean[graph.size()];
        for (int vertex = 0; vertex < graph.size(); vertex++) {
            if (!visited[vertex] && dfs(graph, vertex, -1, visited)) {
                return true;
            }
        }
        return false;
    }

    private static boolean dfs(List<List<Integer>> graph, int vertex,
                               int parent, boolean[] visited) {
        visited[vertex] = true;
        boolean skippedParentEdge = false;

        for (int neighbor : graph.get(vertex)) {
            // Skip only the tree edge to the parent; another parallel edge is a cycle.
            if (neighbor == parent && !skippedParentEdge) {
                skippedParentEdge = true;
                continue;
            }
            if (visited[neighbor]) {
                return true;
            }
            if (dfs(graph, neighbor, vertex, visited)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        List<List<Integer>> graph = AdjacencyList.build(3,
                new int[][]{{0, 1}, {1, 2}, {2, 0}});
        System.out.println(hasCycle(graph));
    }
}
