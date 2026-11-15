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

        int n = numbers.length;

        long expectedSum = (long) n * (n + 1) / 2;
        long expectedSquareSum = (long) n * (n + 1) * (2L * n + 1) / 6;

        long actualSum = 0;
        long actualSquareSum = 0;

        for (int number : numbers) {
            actualSum += number;
            actualSquareSum += (long) number * number;
        }

        // difference = repeating - missing
        long difference = actualSum - expectedSum;

        // squareDifference = repeating^2 - missing^2
        long squareDifference = actualSquareSum - expectedSquareSum;

        // (repeating + missing) = squareDifference / difference
        long sum = squareDifference / difference;

        int repeating = (int) ((difference + sum) / 2);
        int missing = (int) (sum - repeating);

        return new int[]{repeating, missing};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
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
