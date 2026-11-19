/*
 * Problem: Find the next lexicographically greater permutation.
 * If no greater permutation exists, rearrange the array into ascending order.
 * LeetCode: #31
 * Time: O(n) | Auxiliary space: O(1)
 */

import java.util.Arrays;
import java.util.Scanner;

class LeetCode31NextPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        // Find the rightmost pivot where ascending order can still be increased.
        int pivot = n - 2;
        while (pivot >= 0 && numbers[pivot] >= numbers[pivot + 1]) {
            pivot--;
        }
        /*
         * The suffix after the pivot is descending. If a pivot exists, replace
         * it with the smallest larger value from that suffix to make the next
         * permutation as close as possible to the current one.
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
         * Reverse the suffix to ascending order for the smallest possible tail.
         * If no pivot exists, this reverses the entire array into its first permutation.
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
