/*
 * Problem: Determine whether the array contains a non-empty subarray
 * whose sum is zero.
 * LeetCode: Not available
 * Companies: Not listed
 * Time Complexity: O(n) average
 * Space Complexity: O(n)
 */

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ZeroSumSubarray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Set<Long> prefixSums = new HashSet<>();

        // A prefix sum of zero exists before reading any elements.
        prefixSums.add(0L);

        long sum = 0;
        boolean found = false;

        for (int i = 0; i < n; i++) {

            sum += sc.nextLong();

            // A repeated prefix sum means the elements between them sum to zero.
            if (!prefixSums.add(sum)) {
                found = true;
            }
        }

        System.out.println(found ? "Yes" : "No");

        sc.close();
    }
}
