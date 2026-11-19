/*
 * Problem: Determine whether any value appears at least twice.
 * LeetCode: #217
 */

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class LeetCode217ContainsDuplicate {
    public static boolean containsDuplicate(int[] numbers) {
        Set<Integer> seenNumbers = new HashSet<>();
        for (int number : numbers) {
            // add() returns false when the value is already in the set.
            if (!seenNumbers.add(number)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println(containsDuplicate(numbers));
        sc.close();
    }
}
