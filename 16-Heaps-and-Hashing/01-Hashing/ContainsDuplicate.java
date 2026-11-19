/*
 * Problem: Contains Duplicate
 * Difficulty: Easy
 * LeetCode: 217 - Contains Duplicate
 *
 * Time: O(n) expected; Space: O(n).
 */

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("Array must not be null.");
        }

        Set<Integer> seen = new HashSet<>();

        for (int number : numbers) {
            // add() returns false when the value was already present.
            if (!seen.add(number)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 1};
        System.out.println(containsDuplicate(numbers)); // true
    }
}
