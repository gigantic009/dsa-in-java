/*
 * Problem: Two Sum
 * Difficulty: Easy
 * LeetCode: 1 - Two Sum
 *
 * Returns indices, not values. If no pair exists, returns {-1, -1}.
 * Time: O(n) expected; Space: O(n).
 */

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] find(int[] numbers, int target) {
        if (numbers == null) {
            throw new IllegalArgumentException("Array must not be null.");
        }

        Map<Integer, Integer> seen = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            // Use long so subtraction cannot wrap into a false int complement.
            long needed = (long) target - numbers[i];

            if (needed >= Integer.MIN_VALUE && needed <= Integer.MAX_VALUE
                    && seen.containsKey((int) needed)) {
                return new int[] {seen.get((int) needed), i};
            }

            // Save this value's index for future complement checks.
            seen.put(numbers[i], i);
        }

        return new int[] {-1, -1};
    }

    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int[] result = find(numbers, 9);
        System.out.println(result[0] + ", " + result[1]); // 0, 1
    }
}
