/*
 * Problem: Find the maximum water a pair of vertical lines can contain.
 * LeetCode: #11
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

import java.util.Scanner;

class LeetCode11ContainerWithMostWater {
    public static long maxArea(int[] heights) {
        // Start with the widest container and gradually reduce its width.
        int left = 0;
        int right = heights.length - 1;
        long maximumArea = 0;
        while (left < right) {
            // The shorter line limits the water height for this pair.
            int width = right - left;
            int smallerHeight = Math.min(heights[left], heights[right]);
            long currentArea = (long) width * smallerHeight;
            if (currentArea > maximumArea) {
                maximumArea = currentArea;
            }
            /*
             * Move the shorter side: keeping it while reducing width cannot improve
             * the area, and moving the taller side cannot raise the limiting height.
             */
            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maximumArea;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] heights = new int[n];
        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
        }
        System.out.println(maxArea(heights));
        sc.close();
    }
}
