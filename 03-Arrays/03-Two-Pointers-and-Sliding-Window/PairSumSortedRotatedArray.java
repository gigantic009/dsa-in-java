/*
 * Problem: Check whether a sorted and rotated array contains a pair
 * whose sum equals the target.
 * LeetCode: Not available
 * Time: O(n) | Auxiliary space: O(1)
 */

import java.util.Scanner;

public class PairSumSortedRotatedArray {
    public static boolean hasPair(int[] numbers, long target) {
        int n = numbers.length;
        if (n < 2) {
            return false;
        }

        // Find the rotation break; the element after it is the smallest value.
        int pivot = 0;
        for (int i = 0; i < n - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                pivot = i;
                break;
            }
        }

        /*
         * Circular two-pointer search: left begins at the smallest element,
         * right at the largest. Their indices move around the array in sorted order.
         */
        int left = (pivot + 1) % n;
        int right = pivot;
        while (left != right) {
            // Widen to long so the sum of two int values cannot overflow.
            long sum = (long) numbers[left] + numbers[right];
            if (sum == target) {
                return true;
            }
            if (sum < target) {
                // The sum is too small; move to the next larger circular value.
                left = (left + 1) % n;
            } else {
                // The sum is too large; move to the next smaller circular value.
                right = (n + right - 1) % n;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        long target = sc.nextLong();
        System.out.println(hasPair(numbers, target) ? "YES" : "NO");
        sc.close();
    }
}
