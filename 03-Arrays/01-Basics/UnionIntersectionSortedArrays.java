/*
 * Problem: Find the union and intersection of two sorted arrays.
 * Repeated values are printed only once.
 * LeetCode: Not available
 * Companies: Not listed
 * Time Complexity: O(n + m)
 * Space Complexity: O(n + m) for the result lists.
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

        int i = 0;
        int j = 0;

        List<Integer> union = new ArrayList<>();
        List<Integer> intersection = new ArrayList<>();

        while (i < n || j < m) {

            int value;

            if (j == m || (i < n && first[i] < second[j])) {
                value = first[i];
                i++;

            } else if (i == n || second[j] < first[i]) {
                value = second[j];
                j++;

            } else {
                value = first[i];
                i++;
                j++;

                if (intersection.isEmpty()
                        || intersection.get(intersection.size() - 1) != value) {
                    intersection.add(value);
                }
            }

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
