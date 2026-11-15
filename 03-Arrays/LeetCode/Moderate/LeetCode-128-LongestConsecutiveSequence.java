/*
 * Problem: Find the length of the longest consecutive sequence
 * in an unsorted array.
 * LeetCode: #128nies: Not listed
 * Time Complexity: O(n) average
 * Space Complexity: O(n)
 */

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LeetCode128LongestConsecutiveSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<Integer> numbers = new HashSet<>();
        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }
        int longestLength = 0;
        for (int number : numbers) {
            // Start counting only when this is the first number in a sequence.
            if (number == Integer.MIN_VALUE || !numbers.contains(number - 1)) {
                int currentLength = 1;
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
