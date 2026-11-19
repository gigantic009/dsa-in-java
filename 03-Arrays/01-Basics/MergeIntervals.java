/*
 * Problem: Merge all overlapping intervals.
 * LeetCode: #56
 * Time: O(n log n) | Auxiliary space: O(n)
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MergeIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n < 0) {
            System.out.println("Interval count must be non-negative");
            scanner.close();
            return;
        }
        int[][] intervals = new int[n][2];
        for (int i = 0; i < n; i++) {
            intervals[i][0] = scanner.nextInt();
            intervals[i][1] = scanner.nextInt();
            if (intervals[i][0] > intervals[i][1]) {
                System.out.println("Interval start must not exceed its end");
                scanner.close();
                return;
            }
        }

        // Sorting by start time means any overlap must be with the last merged interval.
        Arrays.sort(intervals, Comparator.comparingInt(interval -> interval[0]));
        List<int[]> merged = new ArrayList<>();
        for (int[] interval : intervals) {
            // If the list is empty or this interval starts after the last one ends,
            // it cannot overlap; add a separate interval.
            if (merged.isEmpty()
                    || merged.get(merged.size() - 1)[1] < interval[0]) {
                merged.add(interval.clone());
            } else {
                // Otherwise, extend the last interval to cover the farther endpoint.
                int[] last = merged.get(merged.size() - 1);
                last[1] = Math.max(last[1], interval[1]);
            }
        }
        for (int[] interval : merged) {
            System.out.println(interval[0] + " " + interval[1]);
        }
        scanner.close();
    }
}
