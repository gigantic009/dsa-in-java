import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GraphSmokeTest {
    private static void check(boolean condition, String message) {
        if (!condition) {
            throw new AssertionError(message);
        }
    }

    private static List<List<Integer>> directedGraph(int vertices, int[][] edges) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
        }
        return graph;
    }

    private static boolean isTopologicalOrder(List<Integer> order, int vertices,
                                             int[][] edges) {
        if (order.size() != vertices) {
            return false;
        }

        int[] position = new int[vertices];
        for (int i = 0; i < order.size(); i++) {
            position[order.get(i)] = i;
        }
        for (int[] edge : edges) {
            if (position[edge[0]] >= position[edge[1]]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        List<List<Integer>> undirected = AdjacencyList.build(5,
                new int[][]{{0, 1}, {0, 2}, {1, 3}, {2, 4}});
        check(DFS.traverse(undirected, 0).equals(Arrays.asList(0, 1, 3, 2, 4)),
                "DFS order");

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOutput = System.out;
        try {
            System.setOut(new PrintStream(output));
            BFS.traverse(undirected, 0);
        } finally {
            System.setOut(originalOutput);
        }
        check(output.toString().trim().equals("0 1 2 3 4"), "BFS order");

        check(CycleDetectionUndirected.hasCycle(
                AdjacencyList.build(3, new int[][]{{0, 1}, {1, 2}, {2, 0}})),
                "Undirected cycle detection");
        check(!CycleDetectionUndirected.hasCycle(
                AdjacencyList.build(3, new int[][]{{0, 1}, {1, 2}})),
                "Undirected acyclic graph");

        int[][] dagEdges = {{0, 1}, {0, 2}, {1, 3}, {2, 3}};
        List<List<Integer>> dag = directedGraph(4, dagEdges);
        check(!DirectedCycleDetection.hasCycle(dag), "Directed acyclic graph");
        check(DirectedCycleDetection.hasCycle(
                directedGraph(3, new int[][]{{0, 1}, {1, 2}, {2, 0}})),
                "Directed cycle detection");
        check(isTopologicalOrder(KahnTopologicalSort.sort(dag), 4, dagEdges),
                "Kahn topological order");
        check(isTopologicalOrder(TopologicalSort.sort(4, dagEdges), 4, dagEdges),
                "TopologicalSort order");

        int[][] weightedEdges = {{0, 1, 4}, {0, 2, 5}, {1, 2, -2},
                {2, 3, 3}, {3, 4, 2}};
        check(Arrays.equals(BellmanFord.run(5, weightedEdges, 0),
                new long[]{0, 4, 2, 5, 7}), "Bellman-Ford distances");
        boolean negativeCycleDetected = false;
        try {
            BellmanFord.run(3, new int[][]{{0, 1, 1}, {1, 2, -1}, {2, 1, -1}}, 0);
        } catch (IllegalArgumentException exception) {
            negativeCycleDetected = true;
        }
        check(negativeCycleDetected, "Bellman-Ford negative cycle");

        List<List<Dijkstra.Edge>> weightedGraph = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            weightedGraph.add(new ArrayList<>());
        }
        weightedGraph.get(0).add(new Dijkstra.Edge(1, 4));
        weightedGraph.get(0).add(new Dijkstra.Edge(2, 1));
        weightedGraph.get(2).add(new Dijkstra.Edge(1, 2));
        weightedGraph.get(1).add(new Dijkstra.Edge(3, 1));
        weightedGraph.get(2).add(new Dijkstra.Edge(3, 5));
        check(Arrays.equals(Dijkstra.distances(weightedGraph, 0),
                new long[]{0, 3, 1, 4}), "Dijkstra distances");

        check(Arrays.equals(UnweightedShortestPath.distances(
                AdjacencyList.build(5, new int[][]{{0, 1}, {1, 2}, {3, 4}}), 0),
                new int[]{0, 1, 2, -1, -1}), "Unweighted distances");

        check(KruskalMST.total(4, new int[][]{{0, 1, 10}, {0, 2, 6},
                {0, 3, 5}, {1, 3, 15}, {2, 3, 4}}) == 19,
                "Kruskal MST weight");

        UnionFind unionFind = new UnionFind(4);
        check(unionFind.union(0, 1), "First union");
        check(unionFind.union(1, 2), "Second union");
        check(unionFind.find(0) == unionFind.find(2), "Connected vertices");
        check(!unionFind.union(0, 2), "Repeated union");

        System.out.println("Graph smoke tests passed.");
    }
}
