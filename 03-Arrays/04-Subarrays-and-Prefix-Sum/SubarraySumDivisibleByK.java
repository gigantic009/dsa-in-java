/*
 * Problem: Count the subarrays whose sum is divisible by k.
 * LeetCode: #974
 * Time: O(n) average | Auxiliary space: O(n)
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SubarraySumDivisibleByK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        if (n < 0) {
            System.out.println("Array size must be non-negative");
            sc.close();
            return;
        }
        if (k == 0) {
            System.out.println("k must be non-zero");
            sc.close();
            return;
        }

        /*
         * The absolute divisor is computed in long to safely handle Integer.MIN_VALUE.
         * If two prefix sums have the same remainder modulo k, their difference
         * (the subarray between them) is divisible by k. Store how often each
         * remainder has appeared to count all such endings in constant average time.
         */
        Map<Integer, Long> remainderFrequency = new HashMap<>();
        // The empty prefix is needed to count subarrays beginning at index zero.
        remainderFrequency.put(0, 1L);
        long prefixSum = 0;
        long answer = 0;
        for (int i = 0; i < n; i++) {
            prefixSum += sc.nextLong();
            // Normalize the remainder so negative sums map to a non-negative key.
            int remainder = (int) ((prefixSum % k + Math.abs((long) k)) % Math.abs((long) k));
            long previousCount = remainderFrequency.getOrDefault(remainder, 0L);
            // Each earlier prefix with this remainder creates a qualifying subarray.
            answer += previousCount;
            remainderFrequency.put(remainder, previousCount + 1);
        }
        System.out.println(answer);
        sc.close();
    }
}
