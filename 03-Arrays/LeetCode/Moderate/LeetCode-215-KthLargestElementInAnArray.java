/*
 * Problem: Find the kth largest element in an unsorted array.
 * LeetCode: #215
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
        // Sort in ascending order.
        Arrays.sort(numbers);
        // The kth largest element is at index n - k.
        System.out.println(numbers[n - k]);
        sc.close();
    }
}
