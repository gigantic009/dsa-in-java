/**
 * Question:
 * Given an array height where each element represents the height of a
 * vertical line, choose two lines that together with the x-axis form a
 * container that holds the most water. Return the maximum amount of water.
 *
 * LeetCode: #11
 *
 * Companies:
 * Flipkart, Dunzo
 */
public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int bestArea = 0;

        while (left < right) {
            int width = right - left;
            int currentHeight = Math.min(height[left], height[right]);
            bestArea = Math.max(bestArea, width * currentHeight);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return bestArea;
    }

    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(height)); // 49
    }
}
