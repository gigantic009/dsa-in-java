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

        // Median of two sorted arrays, including one-empty and both-empty cases.
        check(MedianOfTwoSortedArrays.findMedian(new int[]{1,3}, new int[]{2}) == 2.0, "Median odd");
        check(MedianOfTwoSortedArrays.findMedian(new int[]{1,2}, new int[]{3,4}) == 2.5, "Median even");
        check(MedianOfTwoSortedArrays.findMedian(new int[]{}, new int[]{7}) == 7.0, "Median one empty");
        boolean bothEmptyRejected = false;
        try { MedianOfTwoSortedArrays.findMedian(new int[]{}, new int[]{}); } catch (IllegalArgumentException e) { bothEmptyRejected = true; }
        check(bothEmptyRejected, "Median rejects both empty");

        // Histogram includes empty, equal bars, and large area.
        check(LargestRectangleHistogram.largest(new int[]{2,1,5,6,2,3}) == 10, "Histogram classic");
        check(LargestRectangleHistogram.largest(new int[]{4,4,4}) == 12, "Histogram equal");
        check(LargestRectangleHistogram.largest(new int[]{}) == 0, "Histogram empty");
        check(LargestRectangleHistogram.largest(new int[]{100_000,100_000}) == 200_000L, "Histogram long arithmetic");

        
        // Deterministic randomized differential checks for segment-tree range sums.
        Random rng = new Random(20261119L);
        for (int trial = 0; trial < 150; trial++) {
            int size = 1 + rng.nextInt(32);
            int[] values = new int[size];
            for (int i = 0; i < size; i++) values[i] = rng.nextInt(201) - 100;
            SegmentTree tree = new SegmentTree(values.clone());
            for (int q = 0; q < 30; q++) {
                if (rng.nextBoolean()) {
                    int index = rng.nextInt(size), replacement = rng.nextInt(201) - 100;
                    values[index] = replacement;
                    tree.update(index, replacement);
                } else {
                    int left = rng.nextInt(size), right = rng.nextInt(size);
                    if (left > right) { int tmp = left; left = right; right = tmp; }
                    long expected = 0;
                    for (int i = left; i <= right; i++) expected += values[i];
                    check(tree.sum(left, right) == expected, "Random segment-tree sum trial=" + trial);
                }
            }
        }

        // Differential checks for migrated LeetCode-style array solutions.
        check(LeetCode121BestTimeToBuyAndSellStock.maxProfit(new int[]{7,1,5,3,6,4}) == 5, "Stock #121");
        check(LeetCode121BestTimeToBuyAndSellStock.maxProfit(new int[]{7,6,4,3,1}) == 0, "Stock no profit");
        check(LeetCode53MaximumSubarray.maxSubarraySum(new int[]{-2,1,-3,4,-1,2,1,-5,4}) == 6, "Kadane #53");
        check(LeetCode53MaximumSubarray.maxSubarraySum(new int[]{-5,-2,-8}) == -2, "Kadane all negative");
        check(LeetCode217ContainsDuplicate.containsDuplicate(new int[]{1,2,3,1}), "Duplicate positive");
        check(!LeetCode217ContainsDuplicate.containsDuplicate(new int[]{1,2,3,4}), "No duplicate");
        check(Arrays.equals(LeetCode238ProductOfArrayExceptSelf.productExceptSelf(new int[]{1,2,3,4}), new long[]{24,12,8,6}), "Product except self");
        check(Arrays.equals(LeetCode238ProductOfArrayExceptSelf.productExceptSelf(new int[]{0,2,0}), new long[]{0,0,0}), "Product except self zeros");
        check(LeetCode42TrappingRainWater.trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}) == 6, "Trapping rainwater");
        check(LeetCode287FindTheDuplicateNumber.findDuplicate(new int[]{1,3,4,2,2}) == 2, "Duplicate cycle method");

        Random arrayRng = new Random(8122026L);
        for (int trial = 0; trial < 500; trial++) {
            int n = 1 + arrayRng.nextInt(12);
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = arrayRng.nextInt(21) - 10;
            // Brute-force maximum subarray.
            long bruteMax = Long.MIN_VALUE;
            for (int l = 0; l < n; l++) for (int r = l; r < n; r++) {
                long s = 0; for (int k = l; k <= r; k++) s += a[k];
                bruteMax = Math.max(bruteMax, s);
            }
            check(LeetCode53MaximumSubarray.maxSubarraySum(a) == bruteMax, "Random maximum subarray");
            // Brute-force single-transaction stock profit.
            long bruteProfit = 0;
            for (int buy = 0; buy < n; buy++) for (int sell = buy + 1; sell < n; sell++)
                bruteProfit = Math.max(bruteProfit, (long)a[sell] - a[buy]);
            check(LeetCode121BestTimeToBuyAndSellStock.maxProfit(a) == bruteProfit, "Random stock profit");
            // Product-except-self oracle, bounded inputs keep oracle arithmetic safe.
            long[] oracle = new long[n];
            for (int i = 0; i < n; i++) { long product = 1; for (int j = 0; j < n; j++) if (i != j) product *= a[j]; oracle[i] = product; }
            check(Arrays.equals(LeetCode238ProductOfArrayExceptSelf.productExceptSelf(a), oracle), "Random product except self");
        }
        System.out.println("Audit regression tests passed.");
    }
}