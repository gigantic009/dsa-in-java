/*
 * Problem: Find the kth largest element in an unsorted array.
 * LeetCode: #215
 * Time: O(n log n) | Auxiliary space: depends on sorting implementation
 */

import java.util.Arrays;
import java.util.Scanner;

class LeetCode215KthLargestElementInAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        if (k < 1 || k > n) {
            System.out.println("Invalid k");
            sc.close();
            return;
        }

        // Sorting in ascending order puts the largest values at the array's end.
        Arrays.sort(numbers);
        // Count k positions from the right, converting to a zero-based index.
        System.out.println(numbers[n - k]);
        sc.close();
    }
}
