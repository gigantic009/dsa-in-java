/*
 * Problem: Find the kth smallest and kth largest elements in an array.
 * LeetCode: Not available
 */

import java.util.Arrays;
import java.util.Scanner;

public class FindKthMinMax {
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

        // Sorting makes the positions of the order statistics predictable.
        Arrays.sort(numbers);
        // In ascending order, the kth smallest is k - 1 (zero-based indexing).
        System.out.println("Kth smallest: " + numbers[k - 1]);
        // The kth largest is counted from the opposite end: n - k.
        System.out.println("Kth largest: " + numbers[n - k]);
        sc.close();
    }
}
