/*
 * Problem: Find the minimum length of a contiguous subarray
 * whose sum is greater than the target.
 * Requires non-negative elements for this sliding-window strategy.
 * Time: O(n) | Auxiliary space: O(1)
 */
import java.util.Scanner;

public class SmallestSubarraySumGreaterThanValue {
    public static int minLength(int[] numbers, long target) {
        // Negative values invalidate the monotonic sliding-window reasoning.
        for (int number : numbers) {
            if (number < 0) {
                throw new IllegalArgumentException(
                        "Sliding window solution requires non-negative elements"
                );
            }
        }

        /*
         * Expand the window by moving right and adding values.
         * Whenever its sum exceeds target, shrink from the left while recording
         * each valid length; shrinking may produce a shorter qualifying window.
         */
        int left = 0;
        int minimumLength = numbers.length + 1;
        long currentSum = 0;
        for (int right = 0; right < numbers.length; right++) {
            currentSum += numbers[right];
            while (currentSum > target && left <= right) {
                minimumLength = Math.min(minimumLength, right - left + 1);
                currentSum -= numbers[left++];
            }
        }
        // Zero indicates that no contiguous subarray exceeded the target.
        return minimumLength == numbers.length + 1 ? 0 : minimumLength;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Array size must be non-negative");
            sc.close();
            return;
        }
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        long target = sc.nextLong();
        System.out.println(minLength(numbers, target));
        sc.close();
    }
}
