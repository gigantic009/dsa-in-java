import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/** Merges overlapping intervals. The input is not modified. */
public class MergeIntervals {
    // Time: O(n log n); auxiliary space: O(n) for the copied intervals and output.
    public static int[][] merge(int[][] intervals) {
        if (intervals == null) {
            throw new IllegalArgumentException("Intervals cannot be null.");
        }
        if (intervals.length == 0) {
            return new int[0][2];
        }

        int[][] copy = new int[intervals.length][];
        for (int i = 0; i < intervals.length; i++) {
            if (intervals[i] == null || intervals[i].length != 2
                    || intervals[i][0] > intervals[i][1]) {
                throw new IllegalArgumentException("Invalid interval.");
            }
            copy[i] = intervals[i].clone();
        }

        Arrays.sort(copy, Comparator.comparingInt(interval -> interval[0]));
        List<int[]> merged = new ArrayList<>();
        int[] current = copy[0];

        for (int i = 1; i < copy.length; i++) {
            if (copy[i][0] <= current[1]) {
                current[1] = Math.max(current[1], copy[i][1]);
            } else {
                merged.add(current);
                current = copy[i];
            }
        }

        merged.add(current);
        return merged.toArray(new int[merged.size()][]);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(merge(
                new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}})));
    }
}
