/*
 * Problem: Find the next lexicographically greater permutation.
 * If no greater permutation exists, rearrange the array into ascending order.
 * LeetCode: #31
 * Companies: Uber, Goldman Sachs, Adobe
 * Time Complexity: O(n)
 * Space Complexity: O(1), excluding the input array.
 */

import java.util.Arrays;
import java.util.Scanner;

public class NextPermutation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        // Step 1: Find the first number from the right that is smaller
        // than the number immediately after it.
        int pivot = n - 2;

        while (pivot >= 0 && numbers[pivot] >= numbers[pivot + 1]) {
            pivot--;
        }

        // Step 2: If a pivot exists, find the next larger number from the right.
        if (pivot >= 0) {

            int nextLarger = n - 1;

            while (numbers[nextLarger] <= numbers[pivot]) {
                nextLarger--;
            }

            // Step 3: Swap the pivot and the next larger number.
            int temp = numbers[pivot];
            numbers[pivot] = numbers[nextLarger];
            numbers[nextLarger] = temp;
        }

        // Step 4: Reverse the part after the pivot.
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
