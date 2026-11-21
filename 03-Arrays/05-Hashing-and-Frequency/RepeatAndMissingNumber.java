/*
 * Problem: An array of size n contains values from 1 to n.
 * One value occurs twice and one value is missing.
 * LeetCode: Not available
 * Companies: Amazon
 * Time Complexity: O(n)
 * Space Complexity: O(1), excluding the input array.
 */

import java.util.Scanner;

public class RepeatAndMissingNumber {
    public static int[] findNumbers(int[] numbers) {
        if (numbers == null || numbers.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two values");
        }

        int n = numbers.length;
        int combinedXor = 0;

        // XOR the expected values and the input; the result is repeat ^ missing.
        for (long value = 1; value <= n; value++) {
            combinedXor ^= (int) value;
        }
        for (int number : numbers) {
            if (number < 1 || number > n) {
                throw new IllegalArgumentException("Values must be between 1 and n");
            }
            combinedXor ^= number;
        }

        if (combinedXor == 0) {
            throw new IllegalArgumentException("Input must have one repeated and one missing value");
        }

        // A set bit separates the two values into different XOR groups.
        int separatingBit = combinedXor & -combinedXor;
        int firstCandidate = 0;
        int secondCandidate = 0;

        for (long value = 1; value <= n; value++) {
            if (((int) value & separatingBit) != 0) {
                firstCandidate ^= (int) value;
            } else {
                secondCandidate ^= (int) value;
            }
        }
        for (int number : numbers) {
            if ((number & separatingBit) != 0) {
                firstCandidate ^= number;
            } else {
                secondCandidate ^= number;
            }
        }

        // Identify which candidate appears twice and which is absent.
        int firstCount = 0;
        int secondCount = 0;
        for (int number : numbers) {
            if (number == firstCandidate) {
                firstCount++;
            }
            if (number == secondCandidate) {
                secondCount++;
            }
        }

        int repeating;
        int missing;
        if (firstCount == 2 && secondCount == 0) {
            repeating = firstCandidate;
            missing = secondCandidate;
        } else if (firstCount == 0 && secondCount == 2) {
            repeating = secondCandidate;
            missing = firstCandidate;
        } else {
            throw new IllegalArgumentException(
                    "Input must have one repeated and one missing value");
        }

        return new int[]{repeating, missing};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("Array size must be at least 2");
            sc.close();
            return;
        }

        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        int[] answer = findNumbers(numbers);
        System.out.println("Repeating: " + answer[0]);
        System.out.println("Missing: " + answer[1]);
        sc.close();
    }
}
