/**
 * Question:
 * Given an array of non-negative heights, find the maximum water a pair
 * of vertical lines can contain. Read n followed by n heights.
 *
 * LeetCode: #11
 *
 * Companies: Flipkart, Dunzo
 */
import java.util.Scanner;

public class ContainerWithMostWater {
    public static long maxArea(int[] heights) {
        int left = 0, right = heights.length - 1;
        long best = 0;

        while (left < right) {
            long area = (long) (right - left) * Math.min(heights[left], heights[right]);
            best = Math.max(best, area);
            if (heights[left] < heights[right]) left++;
            else right--;
        }
        return best;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] heights = new int[n];
        for (int i = 0; i < n; i++) heights[i] = scanner.nextInt();

        System.out.println(maxArea(heights));
        scanner.close();
    }
}
