/*
 * Problem: Merge two sorted arrays in place so their combined values
 * remain sorted across the two arrays.
 * LeetCode: Not available (the usual LeetCode #88 problem uses a different interface).
 * Time: O((n + m) log(n + m)) | Auxiliary space: O(1)
 */

import java.util.Arrays;
import java.util.Scanner;

public class MergeSortedArraysInPlace {
    // Treat both arrays as one virtual array, without physically joining them.
    public static int getValue(int[] first, int[] second, int index) {
        if (index < first.length) {
            return first[index];
        }
        return second[index - first.length];
    }

    // Write to the corresponding physical array using the virtual index.
    public static void setValue(
            int[] first, int[] second, int index, int value) {
        if (index < first.length) {
            first[index] = value;
        } else {
            second[index - first.length] = value;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Invalid first array size");
            sc.close();
            return;
        }
        int[] first = new int[n];
        for (int i = 0; i < n; i++) {
            first[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        if (m < 0) {
            System.out.println("Invalid second array size");
            sc.close();
            return;
        }
        int[] second = new int[m];
        for (int i = 0; i < m; i++) {
            second[i] = sc.nextInt();
        }

        /*
         * Shell-sort-style gap merging: compare virtual positions separated by a gap.
         * A large initial gap moves out-of-order values across arrays efficiently;
         * progressively smaller gaps refine the order until gap 1 sorts adjacent pairs.
         */
        int totalLength = n + m;
        int gap = (totalLength + 1) / 2;
        while (gap > 0) {
            int left = 0;
            int right = gap;
            // Compare and swap each pair of virtual positions gap apart.
            while (right < totalLength) {
                int leftValue = getValue(first, second, left);
                int rightValue = getValue(first, second, right);
                if (leftValue > rightValue) {
                    setValue(first, second, left, rightValue);
                    setValue(first, second, right, leftValue);
                }
                left++;
                right++;
            }
            if (gap == 1) {
                break;
            }
            // Halve the gap (rounding up) to keep shrinking toward adjacent comparisons.
            gap = (gap + 1) / 2;
        }
        System.out.println(Arrays.toString(first));
        System.out.println(Arrays.toString(second));
        sc.close();
    }
}
