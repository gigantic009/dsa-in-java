/*
 * Problem: Search for a target in a rotated sorted array with distinct values.
 * Print its index, or -1 if it is absent.
 * LeetCode: #33
 * Time: O(log n) | Auxiliary space: O(1)
 */

import java.util.Scanner;

class LeetCode33SearchInRotatedSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        // At every iteration, one half of the interval is sorted normally.
        int left = 0;
        int right = n - 1;
        int answer = -1;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (numbers[middle] == target) {
                answer = middle;
                break;
            }
            // Identify the sorted half using its endpoint values.
            if (numbers[left] <= numbers[middle]) {
                // If target is within the sorted half's range, discard the right half.
                if (numbers[left] <= target && target < numbers[middle]) {
                    right = middle - 1;
                } else {
                    // Otherwise, target must be sought in the other half.
                    left = middle + 1;
                }
            } else {
                // The right half is sorted; test its inclusive/exclusive bounds.
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
