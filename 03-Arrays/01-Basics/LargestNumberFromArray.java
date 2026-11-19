/*
 * Problem: Arrange non-negative integers to form the largest possible number.
 * LeetCode: #179
 * Time: O(n log n * k) | Space: O(n * k), where k is max token length
 */
import java.util.Arrays;
import java.util.Scanner;

public class LargestNumberFromArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] numbers = new String[n];
        for (int i = 0; i < n; i++) {
            long value = scanner.nextLong();
            if (value < 0) {
                System.out.println("Inputs must be non-negative");
                scanner.close();
                return;
            }
            // Strings allow us to compare concatenated orders without numeric overflow.
            numbers[i] = String.valueOf(value);
        }

        /*
         * For two strings a and b, compare ab with ba.
         * If ba is larger, b should come before a; this pairwise rule
         * produces the arrangement that maximizes the final concatenation.
         */
        Arrays.sort(numbers, (first, second) ->
                (second + first).compareTo(first + second));

        if (n == 0) {
            System.out.println("");
            scanner.close();
            return;
        }
        // If the largest sorted token is zero, every input was zero.
        if (numbers[0].equals("0")) {
            System.out.println("0");
            scanner.close();
            return;
        }
        // Join the tokens in their sorted order to form the result.
        StringBuilder result = new StringBuilder();
        for (String number : numbers) {
            result.append(number);
        }
        System.out.println(result);
        scanner.close();
    }
}
