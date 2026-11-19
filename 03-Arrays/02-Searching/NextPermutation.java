/*
 * Problem: Find the next lexicographically greater permutation.
 * If no greater permutation exists, rearrange the array into ascending order.
 * LeetCode: #31
 * Time: O(n) | Auxiliary space: O(1)
 */

import java.util.Arrays;
import java.util.Scanner;

public class NextPermutation {
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

        /*
         * Step 1: Find the pivot in the descending suffix.
         * This is the rightmost index whose value is smaller than its successor.
         * Everything after it is already in non-increasing order.
         */
        int pivot = n - 2;
        while (pivot >= 0 && numbers[pivot] >= numbers[pivot + 1]) {
            pivot--;
        }

        /*
         * Step 2: If the pivot exists, swap it with the smallest value in the suffix
         * that is still greater than it (found by scanning from the right).
         * This makes the increase as small as possible.
         */
        if (pivot >= 0) {
            int nextLarger = n - 1;
            while (numbers[nextLarger] <= numbers[pivot]) {
                nextLarger--;
            }
            int temp = numbers[pivot];
            numbers[pivot] = numbers[nextLarger];
            numbers[nextLarger] = temp;
        }

        /*
         * Step 3: Reverse the suffix after the pivot. It was descending, and reversal
         * makes it ascending, yielding the smallest suffix for the next permutation.
         * If no pivot exists, pivot is -1 and this reverses the whole array to ascending.
         */
        int left = pivot + 1;
        int right = n - 1;
        while (left < right) {
            int temp = numbers[left];
            numbers[left] = numbers[right];
            numbers[right] = temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(numbers));
        sc.close();
    }
}
