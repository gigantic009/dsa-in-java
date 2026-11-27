import java.util.Arrays;
import java.util.Random;
import java.util.List;

public class GreedyAlgorithmsTest {
    private static int checks = 0;

    public static void main(String[] args) {
        testActivitySelection();
        testAssignCookies();
        testFractionalKnapsack();
        testJumpGame();
        testLemonadeChange();
        testMergeIntervals();
        testMinimumCoins();

        System.out.println("Passed " + checks + " greedy algorithm checks.");
    }

    private static void testActivitySelection() {
        assertIntEquals(4, ActivitySelection.select(
                new int[]{1, 3, 0, 5, 8, 5}, new int[]{2, 4, 6, 7, 9, 9}),
                "activity sample");
        assertIntEquals(0, ActivitySelection.select(new int[0], new int[0]), "empty activities");
        assertIntEquals(3, ActivitySelection.select(
                new int[]{1, 5, 5}, new int[]{5, 5, 5}), "zero-duration tie");
        assertThrows(() -> ActivitySelection.select(null, new int[0]), "null starts");
        assertThrows(() -> ActivitySelection.select(new int[]{2}, new int[]{1}), "invalid interval");

        Random random = new Random(12345);
        for (int trial = 0; trial < 250; trial++) {
            int n = random.nextInt(8);
            int[] start = new int[n];
            int[] end = new int[n];
            for (int i = 0; i < n; i++) {
                start[i] = random.nextInt(11);
                end[i] = start[i] + random.nextInt(5);
            }
            assertIntEquals(bruteActivitySelection(start, end),
                    ActivitySelection.select(start, end), "random activity trial " + trial);
        }
    }

    private static int bruteActivitySelection(int[] start, int[] end) {
        int best = 0;
        for (int mask = 0; mask < (1 << start.length); mask++) {
            int[][] selected = new int[Integer.bitCount(mask)][2];
            int index = 0;
            for (int i = 0; i < start.length; i++) {
                if ((mask & (1 << i)) != 0) {
                    selected[index++] = new int[]{start[i], end[i]};
                }
            }
            Arrays.sort(selected, java.util.Comparator
                    .comparingInt((int[] activity) -> activity[1])
                    .thenComparingInt(activity -> activity[0]));

            int lastEnd = Integer.MIN_VALUE;
            boolean valid = true;
            for (int[] activity : selected) {
                if (activity[0] < lastEnd) {
                    valid = false;
                    break;
                }
                lastEnd = activity[1];
            }
            if (valid) {
                best = Math.max(best, selected.length);
            }
        }
        return best;
    }

    private static void testAssignCookies() {
        assertIntEquals(1, AssignCookies.count(new int[]{1, 2, 3}, new int[]{1, 1}), "cookie sample");
        assertIntEquals(3, AssignCookies.count(new int[]{1, 2, 3}, new int[]{3, 2, 1}), "all satisfied");
        assertIntEquals(0, AssignCookies.count(new int[0], new int[]{1}), "no children");
        assertThrows(() -> AssignCookies.count(null, new int[0]), "null greed");
        assertThrows(() -> AssignCookies.count(new int[]{-1}, new int[]{1}), "negative greed");

        Random random = new Random(23456);
        for (int trial = 0; trial < 200; trial++) {
            int n = random.nextInt(7);
            int m = random.nextInt(7);
            int[] greed = new int[n];
            int[] cookies = new int[m];
            for (int i = 0; i < n; i++) greed[i] = random.nextInt(9);
            for (int i = 0; i < m; i++) cookies[i] = random.nextInt(9);
            assertIntEquals(bruteCookies(greed, cookies, 0, new boolean[m]),
                    AssignCookies.count(greed, cookies), "random cookie trial " + trial);
        }
    }

    private static int bruteCookies(int[] greed, int[] cookies, int child, boolean[] used) {
        if (child == greed.length) return 0;
        int best = bruteCookies(greed, cookies, child + 1, used);
        for (int i = 0; i < cookies.length; i++) {
            if (!used[i] && cookies[i] >= greed[child]) {
                used[i] = true;
                best = Math.max(best, 1 + bruteCookies(greed, cookies, child + 1, used));
                used[i] = false;
            }
        }
        return best;
    }

    private static void testFractionalKnapsack() {
        FractionalKnapsack.Item[] sample = {
            new FractionalKnapsack.Item(60, 10),
            new FractionalKnapsack.Item(100, 20),
            new FractionalKnapsack.Item(120, 30)
        };
        assertDoubleEquals(240.0, FractionalKnapsack.maxValue(sample, 50), "fractional sample");
        assertDoubleEquals(0.0, FractionalKnapsack.maxValue(sample, 0), "zero capacity");
        assertDoubleEquals(0.0, FractionalKnapsack.maxValue(new FractionalKnapsack.Item[0], 10),
                "empty items");
        assertThrows(() -> FractionalKnapsack.maxValue(null, 10), "null items");
        assertThrows(() -> FractionalKnapsack.maxValue(sample, Double.NaN), "NaN capacity");
        assertThrows(() -> new FractionalKnapsack.Item(Double.POSITIVE_INFINITY, 1), "infinite value");
        assertThrows(() -> new FractionalKnapsack.Item(1, Double.NaN), "NaN weight");
        assertThrows(() -> FractionalKnapsack.maxValue(new FractionalKnapsack.Item[]{null}, 10),
                "null item");
    }

    private static void testJumpGame() {
        assertBooleanEquals(true, JumpGame.canReach(new int[]{2, 3, 1, 1, 4}), "reachable sample");
        assertBooleanEquals(false, JumpGame.canReach(new int[]{3, 2, 1, 0, 4}), "unreachable sample");
        assertBooleanEquals(false, JumpGame.canReach(new int[0]), "empty jump array");
        assertBooleanEquals(true, JumpGame.canReach(new int[]{0}), "single index");
        assertBooleanEquals(true, JumpGame.canReach(new int[]{Integer.MAX_VALUE, 0}),
                "large jump value");
        assertThrows(() -> JumpGame.canReach(null), "null jumps");
        assertThrows(() -> JumpGame.canReach(new int[]{-1}), "negative jump");

        Random random = new Random(34567);
        for (int trial = 0; trial < 300; trial++) {
            int n = random.nextInt(9);
            int[] jumps = new int[n];
            for (int i = 0; i < n; i++) jumps[i] = random.nextInt(8);
            assertBooleanEquals(bruteJumpGame(jumps), JumpGame.canReach(jumps),
                    "random jump trial " + trial);
        }
    }

    private static boolean bruteJumpGame(int[] jumps) {
        if (jumps.length == 0) return false;
        boolean[] reached = new boolean[jumps.length];
        reached[0] = true;
        for (int i = 0; i < jumps.length; i++) {
            if (!reached[i]) continue;
            for (int step = 1; step <= jumps[i] && i + step < jumps.length; step++) {
                reached[i + step] = true;
            }
        }
        return reached[jumps.length - 1];
    }

    private static void testLemonadeChange() {
        assertBooleanEquals(true, LemonadeChange.canChange(new int[]{5, 5, 5, 10, 20}),
                "lemonade sample");
        assertBooleanEquals(false, LemonadeChange.canChange(new int[]{10}), "no initial change");
        assertBooleanEquals(false, LemonadeChange.canChange(new int[]{5, 5, 10, 10, 20}),
                "cannot make change");
        assertBooleanEquals(true, LemonadeChange.canChange(new int[0]), "empty bills");
        assertBooleanEquals(false, LemonadeChange.canChange(new int[]{7}), "invalid bill");
        assertThrows(() -> LemonadeChange.canChange(null), "null bills");
    }

    private static void testMergeIntervals() {
        int[][] input = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] original = deepCopy(input);
        assertMatrixEquals(new int[][]{{1, 6}, {8, 10}, {15, 18}},
                MergeIntervals.merge(input), "merge sample");
        assertMatrixEquals(original, input, "input not modified");
        assertMatrixEquals(new int[][]{{1, 3}}, MergeIntervals.merge(new int[][]{{1, 2}, {2, 3}}),
                "touching intervals");
        assertMatrixEquals(new int[0][2], MergeIntervals.merge(new int[0][2]), "empty intervals");
        assertMatrixEquals(new int[][]{{2, 4}}, MergeIntervals.merge(new int[][]{{2, 4}}),
                "single interval");
        assertThrows(() -> MergeIntervals.merge(null), "null intervals");
        assertThrows(() -> MergeIntervals.merge(new int[][]{{3, 2}}), "invalid interval");
        assertThrows(() -> MergeIntervals.merge(new int[][]{{1}}), "wrong interval length");
    }

    private static void testMinimumCoins() {
        assertListEquals(List.of(25, 1, 1), MinimumCoins.choose(27, new int[]{1, 5, 10, 25}),
                "coin sample");
        assertListEquals(List.of(4, 1, 1), MinimumCoins.choose(6, new int[]{1, 3, 4}),
                "greedy is not optimal");
        assertListEquals(List.of(), MinimumCoins.choose(0, new int[]{1, 3}), "zero amount");
        assertThrows(() -> MinimumCoins.choose(6, new int[]{4, 3}), "greedy cannot represent amount");
        assertThrows(() -> MinimumCoins.choose(5, new int[]{0, 1}), "invalid denomination");
        assertThrows(() -> MinimumCoins.choose(5, null), "null denominations");
    }

    private static int[][] deepCopy(int[][] matrix) {
        int[][] copy = new int[matrix.length][];
        for (int i = 0; i < matrix.length; i++) copy[i] = matrix[i].clone();
        return copy;
    }

    private static void assertMatrixEquals(int[][] expected, int[][] actual, String description) {
        if (!Arrays.deepEquals(expected, actual)) {
            throw new AssertionError(description + ": expected " + Arrays.deepToString(expected)
                    + ", got " + Arrays.deepToString(actual));
        }
        checks++;
    }

    private static void assertListEquals(List<Integer> expected, List<Integer> actual, String description) {
        if (!expected.equals(actual)) {
            throw new AssertionError(description + ": expected " + expected + ", got " + actual);
        }
        checks++;
    }

    private static void assertBooleanEquals(boolean expected, boolean actual, String description) {
        if (expected != actual) {
            throw new AssertionError(description + ": expected " + expected + ", got " + actual);
        }
        checks++;
    }

    private static void assertIntEquals(int expected, int actual, String description) {
        if (expected != actual) {
            throw new AssertionError(description + ": expected " + expected + ", got " + actual);
        }
        checks++;
    }

    private static void assertDoubleEquals(double expected, double actual, String description) {
        if (Math.abs(expected - actual) > 1e-9) {
            throw new AssertionError(description + ": expected " + expected + ", got " + actual);
        }
        checks++;
    }

    private static void assertThrows(Runnable action, String description) {
        try {
            action.run();
        } catch (IllegalArgumentException expected) {
            checks++;
            return;
        }
        throw new AssertionError(description + ": expected IllegalArgumentException");
    }
}
