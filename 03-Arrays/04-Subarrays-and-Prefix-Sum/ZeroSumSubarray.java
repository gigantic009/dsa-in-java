/*
 * Problem: Determine whether the array contains a non-empty subarray
 * whose sum is zero.
 * Time: O(n) average | Auxiliary space: O(n)
 */
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ZeroSumSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Array size must be non-negative");
            sc.close();
            return;
        }

        /*
         * A zero-sum subarray exists if a prefix sum repeats, or if a prefix
         * sum itself is zero. Store all prefix sums; the initial zero represents
         * the sum before reading any array element.
         */
        Set<Long> prefixSums = new HashSet<>();
        prefixSums.add(0L);
        long sum = 0;
        boolean found = false;
        for (int i = 0; i < n; i++) {
            sum += sc.nextLong();
            // add() returns false if this prefix sum was already encountered.
            if (!prefixSums.add(sum)) {
                found = true;
            }
        }
        System.out.println(found ? "Yes" : "No");
        sc.close();
    }
}
