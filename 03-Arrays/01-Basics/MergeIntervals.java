/*
 * Problem: Merge all overlapping intervals.
 * LeetCode: #56
 * Companies: Not listed
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
        int[][] intervals = new int[n][2];
        for (int i = 0; i < n; i++) {
            intervals[i][0] = scanner.nextInt();
            intervals[i][1] = scanner.nextInt();
        }
        Arrays.sort(intervals, Comparator.comparingInt(interval -> interval[0]));
        List<int[]> merged = new ArrayList<>();
        for (int[] interval : intervals) {
            if (merged.isEmpty()
                    || merged.get(merged.size() - 1)[1] < interval[0]) {
                merged.add(interval.clone());
            } else {
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
