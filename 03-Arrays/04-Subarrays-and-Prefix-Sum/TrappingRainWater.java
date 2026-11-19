/*
 * Problem: Calculate how much rainwater can be trapped between bars.
 * LeetCode: #42
 * Time Complexity: O(n)
 * Space Complexity: O(1), excluding the input array.
 */

import java.util.Scanner;

public class TrappingRainWater {
    public static long trap(int[] heights) {
        // Water at any position is bounded by the shorter of the two side maxima.
        int left = 0;
        int right = heights.length - 1;
        int leftMaximum = 0;
        int rightMaximum = 0;
        long totalWater = 0;
        while (left < right) {
            /*
             * The shorter boundary is the side whose water level can be safely
             * determined now; the opposite side is at least as tall as it.
             */
            if (heights[left] <= heights[right]) {
                // Update the best left boundary and add the water above this bar.
                leftMaximum = Math.max(leftMaximum, heights[left]);
                totalWater += leftMaximum - heights[left];
                left++;
            } else {
                // Symmetric reasoning: determine the right-side water and move inward.
                rightMaximum = Math.max(rightMaximum, heights[right]);
                totalWater += rightMaximum - heights[right];
                right--;
            }
        }
        return totalWater;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Invalid size");
            sc.close();
            return;
        }
        int[] heights = new int[n];
        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
            if (heights[i] < 0) {
                System.out.println("Heights must be non-negative");
                sc.close();
                return;
            }
        }
        System.out.println(trap(heights));
        sc.close();
    }
}
