/*
 * Problem: Find the union and intersection of two sorted arrays.
 * Repeated values are printed only once.
 * LeetCode: Not available
 * Time: O(n + m) | Auxiliary space: O(n + m) for result lists
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UnionIntersectionSortedArrays {
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

        // Merge-style pointers traverse both sorted arrays without re-sorting.
        int i = 0;
        int j = 0;
        List<Integer> union = new ArrayList<>();
        List<Integer> intersection = new ArrayList<>();
        while (i < n || j < m) {
            int value;
            if (j == m || (i < n && first[i] < second[j])) {
                // The smaller value occurs only in the first array at this step.
                value = first[i];
                i++;
            } else if (i == n || second[j] < first[i]) {
                // The smaller value occurs only in the second array at this step.
                value = second[j];
                j++;
            } else {
                // Equal values belong to the intersection; advance both pointers.
                value = first[i];
                i++;
                j++;
                // Keep intersection unique even when either input has duplicates.
                if (intersection.isEmpty()
                        || intersection.get(intersection.size() - 1) != value) {
                    intersection.add(value);
                }
            }
            // Add to union only if this distinct value has not already been appended.
            if (union.isEmpty()
                    || union.get(union.size() - 1) != value) {
                union.add(value);
            }
        }
        System.out.println("Union: " + union);
        System.out.println("Intersection: " + intersection);
        sc.close();
    }
}
