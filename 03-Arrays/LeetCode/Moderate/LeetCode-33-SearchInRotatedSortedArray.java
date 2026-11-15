/*
 * Problem: Search for a target in a rotated sorted array with distinct values.
 * Print its index, or -1 if it is absent.
 * LeetCode: #33nies: Microsoft, Google, Adobe, Amazon, D-E-Shaw, Flipkart,
 *            Hike, Intuit, MakeMyTrip, Pay
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */

import java.util.Scanner;

public class LeetCode33SearchInRotatedSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int left = 0;
        int right = n - 1;
        int answer = -1;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (numbers[middle] == target) {
                answer = middle;
                break;
            }
            // Check whether the left half is sorted.
            if (numbers[left] <= numbers[middle]) {
                // Check whether the target belongs to the left half.
                if (numbers[left] <= target && target < numbers[middle]) {
                    right = middle - 1;
                } else {
                    left = middle + 1;
                }
            } else {
                // The right half must be sorted.
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
