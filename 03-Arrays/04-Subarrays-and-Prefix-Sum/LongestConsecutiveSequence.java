/*
 * Problem: Find the length of the longest consecutive sequence
 * in an unsorted array.
 * LeetCode: #128
 * Time: O(n) average | Auxiliary space: O(n)
 */

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Array size must be non-negative");
            sc.close();
            return;
        }
        Set<Integer> numbers = new HashSet<>();
        for (int i = 0; i < n; i++) {
            // A set removes duplicate values and supports average O(1) membership checks.
            numbers.add(sc.nextInt());
        }

        int longestLength = 0;
        for (int number : numbers) {
            /*
             * Only start counting from a sequence's smallest value.
             * If number - 1 exists, this value belongs to a sequence already
             * started at a smaller value, so counting here would repeat work.
             */
            if (number == Integer.MIN_VALUE || !numbers.contains(number - 1)) {
                int currentLength = 1;
                // Use long so incrementing Integer.MAX_VALUE does not wrap around.
                long nextNumber = (long) number + 1;
                while (nextNumber <= Integer.MAX_VALUE
                        && numbers.contains((int) nextNumber)) {
                    currentLength++;
                    nextNumber++;
                }
                longestLength = Math.max(longestLength, currentLength);
            }
        }
        System.out.println(longestLength);
        sc.close();
    }
}
