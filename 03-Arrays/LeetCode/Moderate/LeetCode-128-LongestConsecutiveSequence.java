/*
 * Problem: Find the length of the longest consecutive sequence
 * in an unsorted array.
 * LeetCode: #128
 * Time: O(n) average | Auxiliary space: O(n)
 */

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class LeetCode128LongestConsecutiveSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<Integer> numbers = new HashSet<>();
        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }

        // Iterate over distinct values and start only at sequence boundaries.
        int longestLength = 0;
        for (int number : numbers) {
            // If number - 1 exists, this sequence was already counted from earlier.
            if (number == Integer.MIN_VALUE || !numbers.contains(number - 1)) {
                int currentLength = 1;
                // Use long to safely test the next value beyond int boundaries.
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
