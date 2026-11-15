import java.util.Scanner;

public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int left = 0, right = height.length - 1, bestArea = 0;

        while (left < right) {
            int area = (right - left) * Math.min(height[left], height[right]);
            bestArea = Math.max(bestArea, area);

            if (height[left] < height[right]) left++;
            else right--;
        }
        return bestArea;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] height = new int[n];

        for (int i = 0; i < n; i++) height[i] = scanner.nextInt();

        System.out.println(maxArea(height));
        scanner.close();
    }
}