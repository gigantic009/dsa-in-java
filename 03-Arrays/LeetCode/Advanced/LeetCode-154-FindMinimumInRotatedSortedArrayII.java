/*
 * Problem: Find the minimum element in a rotated sorted array.
 * LeetCode: #154
 * Time: O(log n) average | O(n) worst case with duplicates
 * Auxiliary space: O(1)
 */

import java.util.Scanner;

class LeetCode154FindMinimumInRotatedSortedArrayII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Array is empty");
            sc.close();
            return;
        }
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        // The minimum remains within the current interval.
        int left = 0;
        int right = n - 1;
        while (left < right) {
            int middle = left + (right - left) / 2;
            // Compare middle with the right endpoint to choose the search direction.
            if (numbers[middle] > numbers[right]) {
                left = middle + 1;
            } else if (numbers[middle] < numbers[right]) {
                right = middle;
            } else {
                /*
                 * Equal endpoints provide no directional information.
                 * Shrink right by one; this may degrade to linear time with duplicates,
                 * but it does not discard a possible minimum.
                 */
                right--;
            }
        }
        System.out.println(numbers[left]);
        sc.close();
    }
}
