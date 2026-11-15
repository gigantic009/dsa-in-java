/*
 * Problem: Find the median of two sorted arrays of equal size.
 * LeetCode: #4 (generalized version)
 * Companies: Not listed
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

import java.util.Scanner;

public class MedianOfEqualSortedArrays {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] first = new int[n];
        int[] second = new int[n];

        for (int i = 0; i < n; i++) {
            first[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            second[i] = sc.nextInt();
        }

        if (n == 0) {
            System.out.println("Arrays must be non-empty");
            sc.close();
            return;
        }

        int firstIndex = 0;
        int secondIndex = 0;

        int previous = 0;
        int current = 0;

        // We need the two middle values from the combined sorted arrays.
        for (int count = 0; count <= n; count++) {

            previous = current;

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

        double median = ((long) previous + current) / 2.0;

        System.out.println(median);

        sc.close();
    }
}
