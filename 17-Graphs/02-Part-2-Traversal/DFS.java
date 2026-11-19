import java.util.ArrayList;
import java.util.List;

/** Depth-first traversal explores a branch before backtracking. */
public class DFS {
    public static List<Integer> traverse(List<List<Integer>> graph, int start) {
        BFS.validateGraphAndStart(graph, start);
        List<Integer> order = new ArrayList<>();
        boolean[] visited = new boolean[graph.size()];
        visit(graph, start, visited, order);
        return order;
    }
    private static void visit(List<List<Integer>> graph, int vertex, boolean[] visited, List<Integer> order) {
        visited[vertex] = true;
        order.add(vertex);
        for (int neighbor : graph.get(vertex)) if (!visited[neighbor]) visit(graph, neighbor, visited, order);
    }
    public static void main(String[] args) {
        List<List<Integer>> graph = AdjacencyList.build(5, new int[][]{{0,1},{0,2},{1,3},{2,4}});
        System.out.println(traverse(graph, 0));
    }
}