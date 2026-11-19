/*
 * Problem: Arrange non-negative integers to form the largest possible number.
 * LeetCode: #179
 * Time: O(n log n * k), where k is the maximum token length
 */

import java.util.Arrays;
import java.util.Scanner;

public class ArrangeNumbersForLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Invalid size");
            sc.close();
            return;
        }
        if (n == 0) {
            System.out.println("");
            sc.close();
            return;
        }
        String[] numbers = new String[n];
        // Strings make it possible to compare concatenations without numeric overflow.
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.next();
        }

        /*
         * For a pair a and b, compare ab with ba.
         * Whichever concatenation is larger determines which token comes first.
         * Applying this comparator across the tokens creates the largest final number.
         */
        Arrays.sort(numbers, (first, second) -> {
            String firstOrder = first + second;
            String secondOrder = second + first;
            return secondOrder.compareTo(firstOrder);
        });
        // If the sorted first token is zero, all tokens are zero.
        if (numbers[0].equals("0")) {
            System.out.println("0");
            sc.close();
            return;
        }
        // Join tokens in comparator order to build the result.
        StringBuilder result = new StringBuilder();
        for (String number : numbers) {
            result.append(number);
        }
        System.out.println(result);
        sc.close();
    }
}
