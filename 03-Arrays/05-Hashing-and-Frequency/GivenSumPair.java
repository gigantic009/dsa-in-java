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

        Set<Long> seenNumbers = new HashSet<>();

        for (int number : numbers) {

            long requiredNumber = target - number;

            if (seenNumbers.contains(requiredNumber)) {
                return true;
            }

            seenNumbers.add((long) number);
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

        long target = sc.nextLong();

        System.out.println(hasPair(numbers, target) ? "YES" : "NO");

        sc.close();
    }
}
