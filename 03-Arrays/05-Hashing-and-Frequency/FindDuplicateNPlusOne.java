/*
 * Problem: An array contains n + 1 values from 1 to n.
 * Exactly one value is repeated. Find that value without changing the array.
 * LeetCode: #287
 * Time: O(n) | Auxiliary space: O(1)
 */

import java.util.Scanner;

public class FindDuplicateNPlusOne {
    public static int findDuplicate(int[] numbers) {
        if (numbers == null || numbers.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two values");
        }

        int n = numbers.length - 1;
        for (int number : numbers) {
            if (number < 1 || number > n) {
                throw new IllegalArgumentException("Values must be between 1 and n");
            }
        }

        /*
         * The input contract guarantees exactly one repeated value.
         * Treat each value as a link to the next index and use Floyd's algorithm.
         */
        int slow = numbers[0];
        int fast = numbers[0];
        do {
            slow = numbers[slow];
            fast = numbers[numbers[fast]];
        } while (slow != fast);

        // Phase 2: find the cycle entry, which is the repeated value.
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
        if (n < 1 || n == Integer.MAX_VALUE) {
            System.out.println("n must be at least 1 and within the array-size limit");
            sc.close();
            return;
        }

        int[] numbers = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println(findDuplicate(numbers));
        sc.close();
    }
}
