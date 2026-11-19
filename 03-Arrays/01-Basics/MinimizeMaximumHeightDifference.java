/*
 * Problem: Given tower heights and a positive integer k, add or subtract
 * k from each height to minimize the difference between maximum and minimum.
 * LeetCode: Not available
 * Companies: Not listed
 * Time Complexity: O(n log n), due to sorting.
 * Space Complexity: Depends on the sorting implementation.
 */

import java.util.Arrays;
import java.util.Scanner;

public class MinimizeMaximumHeightDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] heights = new int[n];
        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
        }
        if (n <= 1) {
            System.out.println(0);
            sc.close();
            return;
        }
        // Sorting helps us check possible minimum and maximum heights.
        Arrays.sort(heights);
        long answer = (long) heights[n - 1] - heights[0];
        for (int i = 1; i < n; i++) {
            // Do not allow a tower height to become negative.
            if (heights[i] - k < 0) {
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
            answer = Math.min(answer, difference);
        }
        System.out.println(answer);
        sc.close();
    }
}
