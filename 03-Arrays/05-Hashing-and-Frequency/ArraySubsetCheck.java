/*
 * Problem: Check whether the second array is a subset of the first array.
 * Repeated values must also have enough matching occurrences.
 * LeetCode: Not available
 * Time: O(n + m) average | Auxiliary space: O(n)
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ArraySubsetCheck {
    public static boolean isSubset(int[] first, int[] second) {
        if (first == null || second == null) {
            throw new IllegalArgumentException("Arrays must not be null");
        }
        if (second.length > first.length) {
            return false;
        }

        Map<Integer, Integer> frequency = new HashMap<>();
        for (int number : first) {
            frequency.merge(number, 1, Integer::sum);
        }

        for (int number : second) {
            int count = frequency.getOrDefault(number, 0);
            if (count == 0) {
                return false;
            }
            frequency.put(number, count - 1);
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Array size must be non-negative");
            sc.close();
            return;
        }

        int[] first = new int[n];
        for (int i = 0; i < n; i++) {
            first[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        if (m < 0) {
            System.out.println("Subset size must be non-negative");
            sc.close();
            return;
        }

        int[] second = new int[m];
        for (int i = 0; i < m; i++) {
            second[i] = sc.nextInt();
        }

        System.out.println(isSubset(first, second) ? "Yes" : "No");
        sc.close();
    }
}
