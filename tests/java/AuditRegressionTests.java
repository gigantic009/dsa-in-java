import java.util.*;

public class AuditRegressionTests {
    private static void check(boolean condition, String message) {
        if (!condition) throw new AssertionError(message);
    }
    public static void main(String[] args) {
        // Dijkstra: paths, unreachable vertices, and long-distance arithmetic.
        List<List<Dijkstra.Edge>> graph = new ArrayList<>();
        for (int i = 0; i < 4; i++) graph.add(new ArrayList<>());
        graph.get(0).add(new Dijkstra.Edge(1, 1_500_000_000));
        graph.get(1).add(new Dijkstra.Edge(2, 1_500_000_000));
        long[] d = Dijkstra.distances(graph, 0);
        check(d[0] == 0 && d[1] == 1_500_000_000L && d[2] == 3_000_000_000L && d[3] == Long.MAX_VALUE, "Dijkstra");
        boolean negativeRejected = false;
        try { new Dijkstra.Edge(1, -1); } catch (IllegalArgumentException e) { negativeRejected = true; }
        check(negativeRejected, "Dijkstra rejects negative weights");

        // Kruskal MST.
        int[][] edges = {{0,1,5},{1,2,3},{0,2,10}};
        check(KruskalMST.total(3, edges) == 8, "Kruskal MST");
        boolean disconnected = false;
        try { KruskalMST.total(3, new int[][]{{0,1,2}}); } catch (IllegalArgumentException e) { disconnected = true; }
        check(disconnected, "Kruskal disconnected");

        // Segment tree sum queries and updates, including invalid bounds.
        SegmentTree sum = new SegmentTree(new int[]{2,4,6,8,10});
        check(sum.sum(1,3) == 18, "SegmentTree query");
        sum.update(2, 7);
        check(sum.sum(0,4) == 31, "SegmentTree update");
        boolean invalidSum = false;
        try { sum.sum(-1, 2); } catch (IllegalArgumentException e) { invalidSum = true; }
        check(invalidSum, "SegmentTree bounds");

        RangeMinimumSegmentTree min = new RangeMinimumSegmentTree(new int[]{8,3,7,1,9});
        check(min.query(1,4) == 1, "RMQ");
        boolean invalidMin = false;
        try { min.query(0,5); } catch (IllegalArgumentException e) { invalidMin = true; }
        check(invalidMin, "RMQ bounds");

        // Histogram includes empty, equal bars, and large area.
        check(LargestRectangleHistogram.largest(new int[]{2,1,5,6,2,3}) == 10, "Histogram classic");
        check(LargestRectangleHistogram.largest(new int[]{4,4,4}) == 12, "Histogram equal");
        check(LargestRectangleHistogram.largest(new int[]{}) == 0, "Histogram empty");
        check(LargestRectangleHistogram.largest(new int[]{100_000,100_000}) == 200_000L, "Histogram long arithmetic");

        System.out.println("Audit regression tests passed.");
    }
}