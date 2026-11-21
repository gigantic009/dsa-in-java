/*
 * Problem: Determine whether two elements add up to the target value.
 * LeetCode: Not available
 * Companies: Infosys, Amazon, Flipkart
 * Time Complexity: O(n) average
 * Space Complexity: O(n)
 */

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class GivenSumPair {
    public static boolean hasPair(int[] numbers, long target) {
        if (numbers == null) {
            throw new IllegalArgumentException("Array must not be null");
        }

        // Two int values cannot sum outside this range.
        if (target < 2L * Integer.MIN_VALUE || target > 2L * Integer.MAX_VALUE) {
            return false;
        }

        Set<Integer> seenNumbers = new HashSet<>();
        for (int number : numbers) {
            long requiredNumber = target - number;

            // Check the complement only when it can be represented as an int.
            if (requiredNumber >= Integer.MIN_VALUE
                    && requiredNumber <= Integer.MAX_VALUE
                    && seenNumbers.contains((int) requiredNumber)) {
                return true;
            }
            seenNumbers.add(number);
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Array size must be non-negative");
            sc.close();
            return;
        }

        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        long target = sc.nextLong();

        System.out.println(hasPair(numbers, target) ? "YES" : "NO");
        sc.close();
    }
}
