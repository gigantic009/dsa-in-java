/*
 * Problem: Find the maximum water a pair of vertical lines can contain.
 * LeetCode: #11
 * Companies: Flipkart, Dunzo
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

import java.util.Scanner;

public class ContainerWithMostWater {

    public static long maxArea(int[] heights) {

        int left = 0;
        int right = heights.length - 1;

        long maximumArea = 0;

        while (left < right) {

            int width = right - left;
            int smallerHeight = Math.min(heights[left], heights[right]);

            long currentArea = (long) width * smallerHeight;

            if (currentArea > maximumArea) {
                maximumArea = currentArea;
            }

            // Move the pointer at the shorter line.
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
