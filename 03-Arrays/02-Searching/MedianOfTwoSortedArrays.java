/*
 * Problem: Find the median of two sorted arrays of possibly different lengths.
 * LeetCode: #4
 * Time: O(log(min(n, m))) | Auxiliary space: O(1)
 */

import java.util.Scanner;

public class MedianOfTwoSortedArrays {
    public static double findMedian(int[] first, int[] second) {
        if (first.length == 0 && second.length == 0) {
            throw new IllegalArgumentException("At least one array must be non-empty");
        }
        // Search the smaller array to keep the binary search logarithmic in its length.
        if (first.length > second.length) {
            return findMedian(second, first);
        }
        int n = first.length;
        int m = second.length;
        long totalLength = (long) n + m;
        int left = 0;
        int right = n;
        while (left <= right) {
            // Choose how many elements belong to the left partition of the first array.
            int firstPartition = left + (right - left) / 2;
            // Balance the total left partition so it contains half (or one extra) values.
            int secondPartition = (int) ((totalLength + 1) / 2) - firstPartition;
            // Values immediately around each partition; sentinels handle empty sides.
            int firstLeft = firstPartition == 0
                    ? Integer.MIN_VALUE : first[firstPartition - 1];
            int firstRight = firstPartition == n
                    ? Integer.MAX_VALUE : first[firstPartition];
            int secondLeft = secondPartition == 0
                    ? Integer.MIN_VALUE : second[secondPartition - 1];
            int secondRight = secondPartition == m
                    ? Integer.MAX_VALUE : second[secondPartition];

            /*
             * A valid partition places every left-side value <= every right-side value.
             * Once valid, the median is the largest left value (odd total) or the
             * average of the largest left and smallest right values (even total).
             */
            if (firstLeft <= secondRight && secondLeft <= firstRight) {
                if (totalLength % 2 == 1) {
                    return Math.max(firstLeft, secondLeft);
                }
                long middleLeft = Math.max(firstLeft, secondLeft);
                long middleRight = Math.min(firstRight, secondRight);
                return (middleLeft + middleRight) / 2.0;
            }
            // Too many first-array values on the left: move its partition left.
            if (firstLeft > secondRight) {
                right = firstPartition - 1;
            } else {
                // The first partition is too far left; move it right.
                left = firstPartition + 1;
            }
        }
        throw new IllegalArgumentException("Arrays must be sorted");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Array sizes must be non-negative");
            sc.close();
            return;
        }
        int[] first = new int[n];
        for (int i = 0; i < n; i++) {
            first[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        if (m < 0) {
            System.out.println("Array sizes must be non-negative");
            sc.close();
            return;
        }
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
