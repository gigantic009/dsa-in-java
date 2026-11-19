/*
 * Problem: Search for a target in a rotated sorted array with distinct values.
 * Print its index, or -1 if it is absent.
 * LeetCode: #33
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */

import java.util.Scanner;

public class SearchRotatedSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Invalid size");
            sc.close();
            return;
        }
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        // Binary search works by identifying the sorted half at each iteration.
        int left = 0;
        int right = n - 1;
        int answer = -1;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (numbers[middle] == target) {
                answer = middle;
                break;
            }

            // With distinct values, at least one half is sorted normally.
            if (numbers[left] <= numbers[middle]) {
                // The left half is sorted; check whether target lies within its bounds.
                if (numbers[left] <= target && target < numbers[middle]) {
                    right = middle - 1;
                } else {
                    // Otherwise discard the left half and search the other half.
                    left = middle + 1;
                }
            } else {
                // The rotation pivot is in the left half, so the right half is sorted.
                if (numbers[middle] < target && target <= numbers[right]) {
                    left = middle + 1;
                } else {
                    right = middle - 1;
                }
            }
        }
        System.out.println(answer);
        sc.close();
    }
}
