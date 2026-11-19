/*
 * Problem: Find the maximum product of a contiguous subarray.
 * LeetCode: #152
 * Time: O(n) | Auxiliary space: O(1)
 */
import java.util.Scanner;

class LeetCode152MaximumProductSubarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Array must contain at least one element");
            scanner.close();
            return;
        }
        long value = scanner.nextLong();
        // Track both extremes because multiplying by a negative swaps their roles.
        long maxEndingHere = value;
        long minEndingHere = value;
        long maximumProduct = value;
        for (int i = 1; i < n; i++) {
            value = scanner.nextLong();
            // A negative multiplier can turn the previous minimum into the maximum.
            if (value < 0) {
                long temp = maxEndingHere;
                maxEndingHere = minEndingHere;
                minEndingHere = temp;
            }
            // Choose between starting a subarray here or extending the previous one.
            maxEndingHere = Math.max(value, maxEndingHere * value);
            minEndingHere = Math.min(value, minEndingHere * value);
            // Update the best product seen across all positions.
            maximumProduct = Math.max(maximumProduct, maxEndingHere);
        }
        System.out.println(maximumProduct);
        scanner.close();
    }
}
