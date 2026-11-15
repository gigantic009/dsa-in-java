/*
 * Problem: Find the maximum product of a contiguous subarray.
 * LeetCode: #152nies: Amazon, D-E-Shaw, Microsoft, Morgan Stanley, OYO Rooms, Google
 * Time: O(n) | Auxiliary space: O(1)
 */
import java.util.Scanner;

public class LeetCode152MaximumProductSubarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n == 0) {
            System.out.println("Array is empty");
            return;
        }
        long value = scanner.nextLong();
        long maxEndingHere = value;
        long minEndingHere = value;
        long maximumProduct = value;
        for (int i = 1; i < n; i++) {
            value = scanner.nextLong();
            if (value < 0) {
                long temp = maxEndingHere;
                maxEndingHere = minEndingHere;
                minEndingHere = temp;
            }
            maxEndingHere = Math.max(value, maxEndingHere * value);
            minEndingHere = Math.min(value, minEndingHere * value);
            maximumProduct = Math.max(maximumProduct, maxEndingHere);
        }
        System.out.println(maximumProduct);
        scanner.close();
    }
}
