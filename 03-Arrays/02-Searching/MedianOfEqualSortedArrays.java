/*
 * Problem: Find the median of two sorted arrays of equal size.
 * LeetCode: Not available
 * Time: O(n) | Auxiliary space: O(1)
 */

import java.util.Scanner;

public class MedianOfEqualSortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Arrays must be non-empty");
            sc.close();
            return;
        }
        int[] first = new int[n];
        int[] second = new int[n];
        for (int i = 0; i < n; i++) {
            first[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            second[i] = sc.nextInt();
        }

        // Merge only until the middle pair is reached; storing a merged array is unnecessary.
        int firstIndex = 0;
        int secondIndex = 0;
        int previous = 0;
        int current = 0;
        // For two arrays of length n, the combined middle positions are n - 1 and n.
        for (int count = 0; count <= n; count++) {
            previous = current;
            // Select the smaller next value, handling exhaustion of either array.
            if (firstIndex < n
                    && (secondIndex >= n
                    || first[firstIndex] <= second[secondIndex])) {
                current = first[firstIndex];
                firstIndex++;
            } else {
                current = second[secondIndex];
                secondIndex++;
            }
        }
        // The combined length is 2n (even), so average its two middle values.
        double median = ((long) previous + current) / 2.0;
        System.out.println(median);
        sc.close();
    }
}
