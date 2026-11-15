/*
 * Problem: Print the common elements present in three sorted arrays.
 * LeetCode: Not available
 * Companies: Not listed
 * Time Complexity: O(n + m + k)
 * Space Complexity: O(c), where c is the number of common elements.
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
        int i = 0;
        int j = 0;
        int p = 0;
        List<Integer> common = new ArrayList<>();
        while (i < n && j < m && p < k) {
            if (first[i] == second[j] && second[j] == third[p]) {
                int value = first[i];
                if (common.isEmpty()
                        || common.get(common.size() - 1) != value) {
                    common.add(value);
                }
                i++;
                j++;
                p++;
            } else {
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
