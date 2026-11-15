/**
 * Question:
 * An array of size n contains numbers from 1 to n. Exactly one number
 * occurs twice and one number is missing. Find and print the repeating
 * number followed by the missing number. Read n and the array from input.
 *
 * LeetCode: Not available — no exact problem number verified.
 *
 * Companies: Amazon
 */
import java.util.Scanner;

public class RepeatAndMissingNumber {
    public static int[] findNumbers(int[] values) {
        int n = values.length;
        long expectedSum = (long) n * (n + 1) / 2;
        long expectedSquareSum = (long) n * (n + 1) * (2L * n + 1) / 6;
        long actualSum = 0;
        long actualSquareSum = 0;

        for (int value : values) {
            actualSum += value;
            actualSquareSum += (long) value * value;
        }

        long difference = actualSum - expectedSum;
        long squareDifference = actualSquareSum - expectedSquareSum;
        long sum = squareDifference / difference;

        int repeating = (int) ((difference + sum) / 2);
        int missing = (int) (sum - repeating);

        return new int[]{repeating, missing};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] values = new int[n];

        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
        }

        int[] result = findNumbers(values);
        System.out.println("Repeating: " + result[0]);
        System.out.println("Missing: " + result[1]);
        scanner.close();
    }
}
