import java.util.Arrays;
import java.util.Comparator;

/** Selects the maximum number of non-overlapping activities. */
public class ActivitySelection {
    // Time: O(n log n); auxiliary space: O(n) for the activity copies.
    public static int select(int[] start, int[] end) {
        if (start == null || end == null || start.length != end.length) {
            throw new IllegalArgumentException("Start/end arrays must be non-null and equal length.");
        }

        int n = start.length;
        int[][] activities = new int[n][2];

        for (int i = 0; i < n; i++) {
            if (start[i] > end[i]) {
                throw new IllegalArgumentException("Start must not exceed end.");
            }
            activities[i][0] = start[i];
            activities[i][1] = end[i];
        }

        // Tie-break by start time so zero-duration activities at a shared end
        // can be selected after the activity that reaches that end.
        Arrays.sort(activities,
                Comparator.comparingInt((int[] activity) -> activity[1])
                        .thenComparingInt(activity -> activity[0]));

        int count = 0;
        int lastEnd = Integer.MIN_VALUE;

        for (int[] activity : activities) {
            if (activity[0] >= lastEnd) {
                count++;
                lastEnd = activity[1];
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(select(new int[]{1, 3, 0, 5, 8, 5},
                new int[]{2, 4, 6, 7, 9, 9})); // 4
    }
}
