/*
 * Problem: Given tower heights and a positive integer k, add or subtract
 * k from each height to minimize the difference between maximum and minimum.
 * LeetCode: Not available
 * Time: O(n log n) | Auxiliary space: O(1) apart from sorting implementation
 */

import java.util.Arrays;
import java.util.Scanner;

public class MinimizeMaximumHeightDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        if (n <= 0) {
            System.out.println("Array size must be positive");
            sc.close();
            return;
        }
        if (n < 0 || k < 0) {
            System.out.println("Array size and k must be non-negative");
            sc.close();
            return;
        }
        int[] heights = new int[n];
        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
        }
        if (n <= 1) {
            System.out.println(0);
            sc.close();
            return;
        }

        // Sorting gives the original minimum and maximum and makes split points usable.
        Arrays.sort(heights);
        // Doing nothing is always a valid baseline answer.
        long answer = (long) heights[n - 1] - heights[0];

        /*
         * At each split i, raise the smaller-side values by k and lower the
         * larger-side values by k. The resulting extremes can only be:
         * max(original maximum - k, previous value + k) and
         * min(original minimum + k, current value - k).
         */
        for (int i = 1; i < n; i++) {
            // Reject a lowering operation that would create a negative height.
            if ((long) heights[i] - k < 0) {
                continue;
            }
            long possibleMaximum = Math.max(
                    (long) heights[n - 1] - k,
                    (long) heights[i - 1] + k
            );
            long possibleMinimum = Math.min(
                    (long) heights[0] + k,
                    (long) heights[i] - k
            );
            long difference = possibleMaximum - possibleMinimum;
            // Keep the smallest range found among all split choices.
            answer = Math.min(answer, difference);
        }
        System.out.println(answer);
        sc.close();
    }
}
