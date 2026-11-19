/*
 * Problem: Check whether the second array is a subset of the first array.
 * Repeated values must also have enough matching occurrences.
 * LeetCode: Not available
 * Companies: Not listed
 * Time Complexity: O(n + m) average
 * Space Complexity: O(n)
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ArraySubsetCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> frequency = new HashMap<>();
        // Count the frequency of every value in the first array.
        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();
            int oldCount = frequency.getOrDefault(number, 0);
            frequency.put(number, oldCount + 1);
        }
        int m = sc.nextInt();
        boolean isSubset = true;
        // Check whether the second array can be formed from the first.
        for (int i = 0; i < m; i++) {
            int number = sc.nextInt();
            int count = frequency.getOrDefault(number, 0);
            if (count == 0) {
                isSubset = false;
            } else {
                frequency.put(number, count - 1);
            }
        }
        System.out.println(isSubset ? "Yes" : "No");
        sc.close();
    }
}
