/*
 * Problem: Count the subarrays whose sum is divisible by k.
 * LeetCode: #974
 * Companies: Snapdeal, Microsoft
 * Time Complexity: O(n)
 * Space Complexity: O(min(n, |k|)) for the frequency map.
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LeetCode974SubarraySumsDivisibleByK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        if (k == 0) {
            System.out.println("k must be non-zero");
            sc.close();
            return;
        }
        Map<Integer, Long> remainderFrequency = new HashMap<>();
        // An empty prefix has remainder 0.
        remainderFrequency.put(0, 1L);
        long prefixSum = 0;
        long answer = 0;
        for (int i = 0; i < n; i++) {
            prefixSum += sc.nextLong();
            // Make the remainder non-negative, even for negative sums.
            int remainder = (int) ((prefixSum % k + Math.abs((long) k)) % Math.abs((long) k));
            long previousCount = remainderFrequency.getOrDefault(remainder, 0L);
            answer += previousCount;
            remainderFrequency.put(remainder, previousCount + 1);
        }
        System.out.println(answer);
        sc.close();
    }
}
