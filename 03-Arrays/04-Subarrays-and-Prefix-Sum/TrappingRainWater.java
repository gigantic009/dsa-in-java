/*
 * Problem: Calculate how much rainwater can be trapped between bars.
 * LeetCode: #42
 * Companies: Samsung
 * Time Complexity: O(n)
 * Space Complexity: O(1), excluding the input array.
 */

import java.util.Scanner;

public class TrappingRainWater {
    public static long trap(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int leftMaximum = 0;
        int rightMaximum = 0;
        long totalWater = 0;
        while (left < right) {
            if (heights[left] <= heights[right]) {
                // The left side determines the water level at this position.
                leftMaximum = Math.max(leftMaximum, heights[left]);
                totalWater += leftMaximum - heights[left];
                left++;
            } else {
                // The right side determines the water level at this position.
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
