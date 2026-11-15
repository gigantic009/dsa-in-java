/*
 * Problem: Find the median of two sorted arrays of possibly different lengths.
 * LeetCode: #4
 * Companies: Not listed
 * Time Complexity: O(log(min(n, m)))
 * Space Complexity: O(1)
 */

import java.util.Scanner;

public class MedianOfTwoSortedArrays {

    public static double findMedian(int[] first, int[] second) {

        // Binary search must be performed on the smaller array.
        if (first.length > second.length) {
            return findMedian(second, first);
        }

        int n = first.length;
        int m = second.length;

        int left = 0;
        int right = n;

        while (left <= right) {

            int firstPartition = left + (right - left) / 2;
            int secondPartition = (n + m + 1) / 2 - firstPartition;

            int firstLeft = firstPartition == 0
                    ? Integer.MIN_VALUE : first[firstPartition - 1];

            int firstRight = firstPartition == n
                    ? Integer.MAX_VALUE : first[firstPartition];

            int secondLeft = secondPartition == 0
                    ? Integer.MIN_VALUE : second[secondPartition - 1];

            int secondRight = secondPartition == m
                    ? Integer.MAX_VALUE : second[secondPartition];

            // Check whether the left partitions contain the smaller half.
            if (firstLeft <= secondRight && secondLeft <= firstRight) {

                if ((n + m) % 2 == 1) {
                    return Math.max(firstLeft, secondLeft);
                }

                long middleLeft = Math.max(firstLeft, secondLeft);
                long middleRight = Math.min(firstRight, secondRight);

                return (middleLeft + middleRight) / 2.0;
            }

            if (firstLeft > secondRight) {
                right = firstPartition - 1;
            } else {
                left = firstPartition + 1;
            }
        }

        throw new IllegalArgumentException("Arrays must be sorted");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] first = new int[n];

        for (int i = 0; i < n; i++) {
            first[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] second = new int[m];

        for (int i = 0; i < m; i++) {
            second[i] = sc.nextInt();
        }

        if (n + m == 0) {
            System.out.println("Both arrays are empty");
            sc.close();
            return;
        }

        System.out.println(findMedian(first, second));

        sc.close();
    }
}
