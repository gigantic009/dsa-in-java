/*
 * Problem: Calculate how much rainwater can be trapped between bars.
 * LeetCode: #42
 * Time: O(n) | Auxiliary space: O(1)
 */

import java.util.Scanner;

class LeetCode42TrappingRainWater {
    public static long trap(int[] heights) {
        // Water at a position is bounded by the shorter side's maximum height.
        int left = 0;
        int right = heights.length - 1;
        int leftMaximum = 0;
        int rightMaximum = 0;
        long totalWater = 0;
        while (left < right) {
            /*
             * Process the shorter current boundary because its water level is
             * determined regardless of how tall the opposite side may be.
             */
            if (heights[left] <= heights[right]) {
                // Update the left maximum and add the water above the current bar.
                leftMaximum = Math.max(leftMaximum, heights[left]);
                totalWater += leftMaximum - heights[left];
                left++;
            } else {
                // Symmetric right-side calculation.
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
        int[] heights = new int[n];
        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
        }
        System.out.println(trap(heights));
        sc.close();
    }
}
