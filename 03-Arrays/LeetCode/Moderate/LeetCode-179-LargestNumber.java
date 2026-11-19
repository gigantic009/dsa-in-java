/*
 * Problem: Arrange non-negative integers to form the largest possible number.
 * LeetCode: #179
 * Companies: Barclays
 * Time: O(n log n * k) | Space: O(n * k), where k is max token length
 */
import java.util.Arrays;
import java.util.Scanner;

class LeetCode179LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] numbers = new String[n];
        for (int i = 0; i < n; i++) {
            long value = scanner.nextLong();
            if (value < 0) {
                System.out.println("Inputs must be non-negative");
                return;
            }
            numbers[i] = String.valueOf(value);
        }
        Arrays.sort(numbers, (first, second) ->
                (second + first).compareTo(first + second));
        if (n == 0) {
            System.out.println("");
            return;
        }
        if (numbers[0].equals("0")) {
            System.out.println("0");
            return;
        }
        StringBuilder result = new StringBuilder();
        for (String number : numbers) {
            result.append(number);
        }
        System.out.println(result);
        scanner.close();
    }
}
