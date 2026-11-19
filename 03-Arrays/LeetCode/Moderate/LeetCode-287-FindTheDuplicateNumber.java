/*
 * Problem: An array contains n + 1 values from 1 to n.
 * Exactly one value is repeated. Find that value without changing the array.
 * LeetCode: #287
 */

import java.util.Scanner;

class LeetCode287FindTheDuplicateNumber {
    public static int findDuplicate(int[] numbers) {
        // Step 1: Find a meeting point using slow and fast pointers.
        int slow = numbers[0];
        int fast = numbers[0];
        do {
            slow = numbers[slow];
            fast = numbers[numbers[fast]];
        } while (slow != fast);
        // Step 2: Move one pointer to the beginning.
        slow = numbers[0];
        // Step 3: Move both pointers one step at a time.
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
