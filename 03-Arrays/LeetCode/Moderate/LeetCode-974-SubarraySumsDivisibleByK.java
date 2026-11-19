/*
 * Problem: Count the subarrays whose sum is divisible by k.
 * LeetCode: #974
 * Time: O(n) average | Auxiliary space: O(n)
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class LeetCode974SubarraySumsDivisibleByK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        if (k == 0) {
            System.out.println("k must be non-zero");
            sc.close();
            return;
        }

        /*
         * Equal prefix-sum remainders imply their difference (the subarray sum)
         * is divisible by k. Frequency counts allow all subarrays ending here
         * to be added in one step.
         */
        Map<Integer, Long> remainderFrequency = new HashMap<>();
        // Count the empty prefix so subarrays starting at index zero are included.
        remainderFrequency.put(0, 1L);
        long prefixSum = 0;
        long answer = 0;
        for (int i = 0; i < n; i++) {
            prefixSum += sc.nextLong();
            // Normalize negative remainders to the same non-negative key range.
            int remainder = (int) ((prefixSum % k + Math.abs((long) k)) % Math.abs((long) k));
            long previousCount = remainderFrequency.getOrDefault(remainder, 0L);
            // Each previously seen matching remainder creates one divisible subarray.
            answer += previousCount;
            remainderFrequency.put(remainder, previousCount + 1);
        }
        System.out.println(answer);
        sc.close();
    }
}
