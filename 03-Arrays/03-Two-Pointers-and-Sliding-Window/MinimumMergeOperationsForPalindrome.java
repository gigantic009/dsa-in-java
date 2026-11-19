/*
 * Problem: Find the minimum merge operations needed to make an array a palindrome.
 * One operation merges two adjacent elements by replacing them with their sum.
 * LeetCode: Not available
 * Time: O(n) | Auxiliary space: O(1)
 */

import java.util.Scanner;

public class MinimumMergeOperationsForPalindrome {
    public static long minOperations(long[] numbers) {
        // Work from the outside inward, comparing the two current segment sums.
        int left = 0;
        int right = numbers.length - 1;
        long operations = 0;
        while (left < right) {
            if (numbers[left] == numbers[right]) {
                // Matching sums already form a mirrored pair; move inward.
                left++;
                right--;
            } else if (numbers[left] < numbers[right]) {
                /*
                 * The left segment is smaller, so it must absorb its next neighbor
                 * to increase its sum. Moving left inward preserves the merged segment.
                 */
                numbers[left + 1] = numbers[left + 1] + numbers[left];
                left++;
                operations++;
            } else {
                // Symmetrically, merge the smaller right segment into its left neighbor.
                numbers[right - 1] = numbers[right - 1] + numbers[right];
                right--;
                operations++;
            }
        }
        return operations;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Invalid array size");
            sc.close();
            return;
        }
        long[] numbers = new long[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextLong();
            if (numbers[i] < 0) {
                System.out.println("Values must be non-negative for this algorithm");
                sc.close();
                return;
            }
        }
        System.out.println(minOperations(numbers));
        sc.close();
    }
}
