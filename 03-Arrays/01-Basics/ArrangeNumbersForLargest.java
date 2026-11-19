/*
 * Problem: Arrange non-negative integers to form the largest possible number.
 * LeetCode: #179
 * Companies: Barclays
 * Time Complexity: O(n log n * k), where k is the average number length.
 * Space Complexity: O(n * k) for storing the numbers and result.
 */

import java.util.Arrays;
import java.util.Scanner;

public class ArrangeNumbersForLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0) {
            System.out.println("");
            sc.close();
            return;
        }
        String[] numbers = new String[n];
        // Read numbers as strings so we can join them in different orders.
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.next();
        }
        /*
         * Compare two possible orders:
         * first + second
         * second + first
         *
         * Put first before second when that creates the larger number.
         */
        Arrays.sort(numbers, (first, second) -> {
            String firstOrder = first + second;
            String secondOrder = second + first;
            return secondOrder.compareTo(firstOrder);
        });
        // If the first value is 0, every value must be 0.
        if (numbers[0].equals("0")) {
            System.out.println("0");
            sc.close();
            return;
        }
        StringBuilder result = new StringBuilder();
        for (String number : numbers) {
            result.append(number);
        }
        System.out.println(result);
        sc.close();
    }
}
