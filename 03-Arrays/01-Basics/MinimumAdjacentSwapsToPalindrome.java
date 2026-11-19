/*
 * Problem: Find the minimum adjacent swaps needed to rearrange an array
 * into a palindrome, or report that it is impossible.
 * LeetCode: Not available
 * Time: O(n^2) | Auxiliary space: O(n)
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MinimumAdjacentSwapsToPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
        Map<Integer, Integer> frequency = new HashMap<>();

        // Count frequencies; a palindrome requires pairs, except for at most one center value.
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
            frequency.put(
                    numbers[i],
                    frequency.getOrDefault(numbers[i], 0) + 1
            );
        }
        // If more than one frequency is odd, no palindrome arrangement is possible.
        int oddFrequencyCount = 0;
        for (int count : frequency.values()) {
            if (count % 2 != 0) {
                oddFrequencyCount++;
            }
        }
        if (oddFrequencyCount > 1) {
            System.out.println(-1);
            sc.close();
            return;
        }

        /*
         * Greedy construction: pair the current left element with its matching
         * element as far right as possible. Moving that match to the right boundary
         * uses the fewest swaps to establish this outer pair.
         * If no match exists, the left element must be the middle element;
         * move it inward by one swap and search again.
         */
        int left = 0;
        int right = n - 1;
        long swaps = 0;
        while (left < right) {
            int match = right;
            // Search from the right boundary for a partner for numbers[left].
            while (match > left && numbers[match] != numbers[left]) {
                match--;
            }
            if (match == left) {
                // This unmatched value belongs in the center; shift it inward one position.
                int temp = numbers[left];
                numbers[left] = numbers[left + 1];
                numbers[left + 1] = temp;
                swaps++;
            } else {
                // Bubble the partner to the right boundary, counting adjacent swaps.
                while (match < right) {
                    int temp = numbers[match];
                    numbers[match] = numbers[match + 1];
                    numbers[match + 1] = temp;
                    match++;
                    swaps++;
                }
                // The outer pair is now fixed, so move both boundaries inward.
                left++;
                right--;
            }
        }
        System.out.println(swaps);
        sc.close();
    }
}
