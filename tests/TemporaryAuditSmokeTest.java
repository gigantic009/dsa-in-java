import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TemporaryAuditSmokeTest {
    private static void check(boolean condition, String message) {
        if (!condition) {
            throw new AssertionError(message);
        }
    }

    private static String captureOutput(Runnable action) {
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        PrintStream original = System.out;
        try (PrintStream capture = new PrintStream(buffer)) {
            System.setOut(capture);
            action.run();
        } finally {
            System.setOut(original);
        }
        return buffer.toString();
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

    private static void testGraphs() {
        List<List<Integer>> undirected = AdjacencyList.build(5,
                new int[][]{{0, 1}, {0, 2}, {1, 3}, {2, 4}});
        check(DFS.traverse(undirected, 0).equals(Arrays.asList(0, 1, 3, 2, 4)),
                "DFS order");
        check(captureOutput(() -> BFS.traverse(undirected, 0)).trim()
                .equals("0 1 2 3 4"), "BFS order");

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
    }

    private static void testLinkedListPalindrome() {
        LinkedListPalindrome.Node head = new LinkedListPalindrome.Node(1);
        head.next = new LinkedListPalindrome.Node(2);
        head.next.next = new LinkedListPalindrome.Node(2);
        head.next.next.next = new LinkedListPalindrome.Node(1);

        check(LinkedListPalindrome.isPalindrome(head), "Palindrome list");
        check(head.next.next.value == 2 && head.next.next.next.value == 1,
                "List restoration");

        LinkedListPalindrome.Node other = new LinkedListPalindrome.Node(1);
        other.next = new LinkedListPalindrome.Node(2);
        other.next.next = new LinkedListPalindrome.Node(3);
        check(!LinkedListPalindrome.isPalindrome(other), "Non-palindrome list");
    }

    private static void testMinStack() {
        MinStack stack = new MinStack();
        stack.push(3);
        stack.push(1);
        stack.push(2);

        check(stack.getMin() == 1, "MinStack minimum");
        check(stack.pop() == 2, "MinStack pop");
        check(stack.top() == 1, "MinStack top");
        check(stack.pop() == 1, "MinStack pop minimum");
        check(stack.getMin() == 3 && stack.top() == 3, "MinStack restored minimum");
        check(stack.pop() == 3, "MinStack final pop");
    }

    private static void testPostfixEvaluation() {
        check(PostfixEvaluation.evaluate("12 3 4 * +") == 24, "Postfix addition");
        check(PostfixEvaluation.evaluate("7 2 /") == 3, "Postfix division");
        check(PostfixEvaluation.evaluate("2 3 -") == -1, "Postfix subtraction");
    }

    private static void testNextSmallerElement() {
        check(Arrays.equals(NextSmallerElement.find(new int[]{4, 8, 5, 2, 25}),
                new int[]{2, 5, 2, -1, -1}), "Next smaller elements");
    }

    private static void testCircularQueue() {
        CircularQueue queue = new CircularQueue(3);
        check(queue.offer(1) && queue.offer(2) && queue.offer(3), "Queue fill");
        check(!queue.offer(4), "Queue full");
        check(queue.poll() == 1, "Queue poll");
        check(queue.offer(4), "Queue wraparound");
        check(queue.poll() == 2 && queue.poll() == 3 && queue.poll() == 4,
                "Queue order");
        check(queue.isEmpty(), "Queue empty");
    }

    private static void testFirstNegativeInWindow() {
        String output = captureOutput(() -> FirstNegativeInWindow.print(
                new int[]{12, -1, -7, 8, -15, 30, 16, 28}, 3));
        check(output.trim().equals("-1 -1 -7 -15 -15 0"), "Window negatives");
    }

    private static void testFirstNonRepeatingCharacter() {
        check(FirstNonRepeatingCharacter.process("aabc").equals("a#bb"),
                "First non-repeating character");
    }

    private static void testBinaryNumbers() {
        String output = captureOutput(() -> GenerateBinaryNumbers.generate(5));
        check(output.trim().equals("1\n10\n11\n100\n101"), "Binary sequence");
    }

    public static void main(String[] args) {
        testGraphs();
        testLinkedListPalindrome();
        testMinStack();
        testPostfixEvaluation();
        testNextSmallerElement();
        testCircularQueue();
        testFirstNegativeInWindow();
        testFirstNonRepeatingCharacter();
        testBinaryNumbers();

        System.out.println("Temporary audit smoke tests passed.");
    }
}
