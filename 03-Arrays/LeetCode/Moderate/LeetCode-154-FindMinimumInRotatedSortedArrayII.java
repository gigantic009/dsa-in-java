/*
 * Problem: Find the minimum element in a rotated sorted array.
 * LeetCode: #154ntation also handles duplicate values).
 * Companies: Adobe, Amazon, Microsoft, Morgan Stanley, Samsung,
 *            Snapdeal, Times Internet
 * Time Complexity: O(log n) normally; O(n) in the worst case with duplicates.
 * Space Complexity: O(1)
 */

import java.util.Scanner;

public class LeetCode154FindMinimumInRotatedSortedArrayII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0) {
            System.out.println("Array is empty");
            sc.close();
            return;
        }
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        int left = 0;
        int right = n - 1;
        while (left < right) {
            int middle = left + (right - left) / 2;
            if (numbers[middle] > numbers[right]) {
                left = middle + 1;
            } else if (numbers[middle] < numbers[right]) {
                right = middle;
            } else {
                // Equal values do not tell us which half has the minimum.
                right--;
            }
        }
        System.out.println(numbers[left]);
        sc.close();
    }
}
