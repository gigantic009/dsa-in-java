/*
 * Problem: Merge two sorted arrays so that their combined sorted values
 * occupy the two arrays, without using an extra array.
 * LeetCode: #88 (related merge problem)
 * Companies: Not listed
 * Time Complexity: O((n + m) * log(n + m))
 * Space Complexity: O(1), excluding the input arrays.
 */

import java.util.Arrays;
import java.util.Scanner;

public class MergeSortedArraysInPlace {

    // Get an element from the correct array using its combined index.
    public static int getElement(int[] first, int[] second, int index) {

        if (index < first.length) {
            return first[index];
        }

        return second[index - first.length];
    }

    // Swap two elements using their combined-array indices.
    public static void swapElements(
            int[] first, int[] second, int firstIndex, int secondIndex) {

        int firstValue = getElement(first, second, firstIndex);
        int secondValue = getElement(first, second, secondIndex);

        if (firstIndex < first.length) {
            first[firstIndex] = secondValue;
        } else {
            second[firstIndex - first.length] = secondValue;
        }

        if (secondIndex < first.length) {
            first[secondIndex] = firstValue;
        } else {
            second[secondIndex - first.length] = firstValue;
        }
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

        // Start with a gap of approximately half the combined length.
        int gap = (n + m + 1) / 2;

        while (gap > 0) {

            int left = 0;
            int right = gap;

            // Compare elements that are 'gap' positions apart.
            while (right < n + m) {

                int leftValue = getElement(first, second, left);
                int rightValue = getElement(first, second, right);

                if (leftValue > rightValue) {
                    swapElements(first, second, left, right);
                }

                left++;
                right++;
            }

            // Reduce the gap for the next pass.
            if (gap == 1) {
                break;
            }

            gap = (gap + 1) / 2;
        }

        System.out.println(Arrays.toString(first));
        System.out.println(Arrays.toString(second));

        sc.close();
    }
}
