/*
 * Problem: Find the maximum sum of a contiguous subarray.
 * Time: O(n) | Auxiliary space: O(1)
 */
import java.util.Scanner;

public class KadaneAlgorithm {
    public static int maxSubarraySum(int[] numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Empty array");
        }

        // current is the best sum of a subarray that must end at this position.
        int current = numbers[0];
        // best tracks the best sum seen at any ending position so far.
        int best = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            // Either extend the previous subarray or restart at this value.
            current = Math.max(numbers[i], current + numbers[i]);
            // Keep the global maximum, including all-negative input cases.
            best = Math.max(best, current);
        }
        return best;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Size must be positive.");
            sc.close();
            return;
        }
        int[] numbers = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println("Maximum subarray sum: " + maxSubarraySum(numbers));
        sc.close();
    }
}
