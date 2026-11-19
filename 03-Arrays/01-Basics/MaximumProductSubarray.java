/*
 * Problem: Find the maximum product of a contiguous subarray.
 * LeetCode: #152
 * Time: O(n) | Auxiliary space: O(1)
 */
import java.util.Scanner;

public class MaximumProductSubarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n < 0) {
            System.out.println("Array size must be non-negative");
            scanner.close();
            return;
        }
        if (n == 0) {
            System.out.println("Array is empty");
            scanner.close();
            return;
        }
        long value = scanner.nextLong();
        // Keep both extremes: multiplying by a negative can turn either into the maximum.
        long maxEndingHere = value;
        long minEndingHere = value;
        long maximumProduct = value;
        for (int i = 1; i < n; i++) {
            value = scanner.nextLong();
            // A negative value swaps the roles of the previous maximum and minimum.
            if (value < 0) {
                long temp = maxEndingHere;
                maxEndingHere = minEndingHere;
                minEndingHere = temp;
            }
            // Either start a new subarray here or extend the previous one.
            maxEndingHere = Math.max(value, maxEndingHere * value);
            minEndingHere = Math.min(value, minEndingHere * value);
            // Track the best product across all subarray endings.
            maximumProduct = Math.max(maximumProduct, maxEndingHere);
        }
        System.out.println(maximumProduct);
        scanner.close();
    }
}
