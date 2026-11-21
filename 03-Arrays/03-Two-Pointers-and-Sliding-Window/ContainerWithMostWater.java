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
        if (heights == null) {
            throw new IllegalArgumentException("Heights must not be null");
        }
        for (int height : heights) {
            if (height < 0) {
                throw new IllegalArgumentException("Heights must be non-negative");
            }
        }

        int left = 0;
        int right = heights.length - 1;
        long maximumArea = 0;

        while (left < right) {
            int width = right - left;
            int smallerHeight = Math.min(heights[left], heights[right]);
            long currentArea = (long) width * smallerHeight;
            maximumArea = Math.max(maximumArea, currentArea);

            // The shorter line limits the water, so move that pointer inward.
            if (heights[left] <= heights[right]) {
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

        if (n < 0) {
            System.out.println("Array size must be non-negative");
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

        System.out.println(maxArea(heights));
        sc.close();
    }
}
