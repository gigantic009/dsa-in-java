/*
 * Problem: Find the median of two sorted arrays of possibly different lengths.
 * LeetCode: #4
 * Time: O(log(min(n, m))) | Auxiliary space: O(1)
 */

import java.util.Scanner;

class LeetCode4MedianOfTwoSortedArrays {
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
            // Choose a partition position in the smaller array.
            int firstPartition = left + (right - left) / 2;
            // Balance the total left partition so it holds half (or one extra) elements.
            int secondPartition = (n + m + 1) / 2 - firstPartition;

            // Values adjacent to each partition; sentinels cover empty partition sides.
            int firstLeft = firstPartition == 0
                    ? Integer.MIN_VALUE : first[firstPartition - 1];
            int firstRight = firstPartition == n
                    ? Integer.MAX_VALUE : first[firstPartition];
            int secondLeft = secondPartition == 0
                    ? Integer.MIN_VALUE : second[secondPartition - 1];
            int secondRight = secondPartition == m
                    ? Integer.MAX_VALUE : second[secondPartition];

            /*
             * A valid partition has every left-side value <= every right-side value.
             * The median is then the largest left value for odd total length, or the
             * average of the largest left and smallest right values for even length.
             */
            if (firstLeft <= secondRight && secondLeft <= firstRight) {
                if ((n + m) % 2 == 1) {
                    return Math.max(firstLeft, secondLeft);
                }
                long middleLeft = Math.max(firstLeft, secondLeft);
                long middleRight = Math.min(firstRight, secondRight);
                return (middleLeft + middleRight) / 2.0;
            }
            // Too many first-array values in the left partition; move it left.
            if (firstLeft > secondRight) {
                right = firstPartition - 1;
            } else {
                // The first partition is too small; move it right.
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
