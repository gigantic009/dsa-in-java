/*
 * Problem: An array contains n + 1 values from 1 to n.
 * Exactly one value is repeated. Find that value without changing the array.
 * LeetCode: #287
 * Time: O(n) | Auxiliary space: O(1)
 */

import java.util.Scanner;

class LeetCode287FindTheDuplicateNumber {
    public static int findDuplicate(int[] numbers) {
        /*
         * Interpret each value as the next index in a linked traversal.
         * With n + 1 entries limited to 1..n, a cycle must exist.
         * The duplicate value is the entry point of that cycle.
         */
        // Phase 1: slow advances one link, fast advances two; they meet inside the cycle.
        int slow = numbers[0];
        int fast = numbers[0];
        do {
            slow = numbers[slow];
            fast = numbers[numbers[fast]];
        } while (slow != fast);

        // Phase 2: reset slow to the start; move both one step until cycle entry is found.
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
