/*
 * Problem: Given tower heights and a positive integer k, add or subtract
 * k from each height to minimize the difference between maximum and minimum.
 * LeetCode: Not available
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
        // Sorting helps us check possible minimum and maximum heights.
        Arrays.sort(heights);
        long answer = (long) heights[n - 1] - heights[0];
        for (int i = 1; i < n; i++) {
            // Do not allow a tower height to become negative.
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
            answer = Math.min(answer, difference);
        }
        System.out.println(answer);
        sc.close();
    }
}
