/*
 * Problem: Find the kth largest element in an unsorted array.
 * LeetCode: #215
 */

import java.util.Arrays;
import java.util.Scanner;

public class KthLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Array size must be positive");
            sc.close();
            return;
        }
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

        // Sorting in ascending order puts the largest value at the last index.
        Arrays.sort(numbers);
        // Count k positions from the right; convert to a zero-based index.
        System.out.println(numbers[n - k]);
        sc.close();
    }
}
