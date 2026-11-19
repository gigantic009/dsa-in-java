/*
 * Problem: Print the common elements present in three sorted arrays.
 * LeetCode: Not available
 * Time: O(n + m + k) | Auxiliary space: O(c), where c is the number of common values
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CommonElementsThreeSortedArrays {
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
        int k = sc.nextInt();
        int[] third = new int[k];
        for (int i = 0; i < k; i++) {
            third[i] = sc.nextInt();
        }

        // Each pointer advances only forward through its sorted array.
        int i = 0;
        int j = 0;
        int p = 0;
        List<Integer> common = new ArrayList<>();
        while (i < n && j < m && p < k) {
            // A value is common when all three current positions agree.
            if (first[i] == second[j] && second[j] == third[p]) {
                int value = first[i];
                // Keep the result unique even when input arrays contain duplicates.
                if (common.isEmpty()
                        || common.get(common.size() - 1) != value) {
                    common.add(value);
                }
                i++;
                j++;
                p++;
            } else {
                /*
                 * If the current values differ, the smallest current value cannot
                 * match a larger value in another array. Skip its occurrences to
                 * advance that array toward the other two pointers.
                 */
                int smallest = Math.min(
                        first[i],
                        Math.min(second[j], third[p])
                );
                while (i < n && first[i] == smallest) {
                    i++;
                }
                while (j < m && second[j] == smallest) {
                    j++;
                }
                while (p < k && third[p] == smallest) {
                    p++;
                }
            }
        }
        System.out.println(common);
        sc.close();
    }
}
