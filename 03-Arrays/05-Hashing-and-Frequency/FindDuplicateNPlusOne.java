/*
 * Problem: An array contains n + 1 values from 1 to n.
 * Exactly one value is repeated. Find that value without changing the array.
 * LeetCode: #287
 * Time: O(n) | Auxiliary space: O(1)
 */

import java.util.Scanner;

public class FindDuplicateNPlusOne {
    public static int findDuplicate(int[] numbers) {
        /*
         * Treat each value as the next index, creating a linked traversal.
         * Because there are n + 1 values restricted to indices 1..n,
         * a cycle must exist. Floyd's algorithm finds its entry.
         */
        // Phase 1: advance slow by one link and fast by two until they meet in the cycle.
        int slow = numbers[0];
        int fast = numbers[0];
        do {
            slow = numbers[slow];
            fast = numbers[numbers[fast]];
        } while (slow != fast);

        /*
         * Phase 2: reset one pointer to the start. Advancing both by one
         * makes them meet at the cycle entry, which corresponds to the duplicate.
         */
        slow = numbers[0];
        while (slow != fast) {
            slow = numbers[slow];
            fast = numbers[fast];
        }
        return slow;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println(findDuplicate(numbers));
        sc.close();
    }
}
