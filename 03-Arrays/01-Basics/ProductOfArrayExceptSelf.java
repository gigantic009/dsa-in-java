/*
 * Problem: For each index, find the product of all array elements
 * except the element at that index. Do not use division.
 * LeetCode: #238
 * Time Complexity: O(n)
 * Space Complexity: O(1) extra space, excluding the output array.
 */

import java.util.Scanner;

public class ProductOfArrayExceptSelf {
    public static long[] productExceptSelf(int[] numbers) {
        int n = numbers.length;
        long[] answer = new long[n];
        long prefixProduct = 1;
        /*
         * At each index, save the product of values strictly to its left.
         * The prefix is updated only after storing it, so numbers[i] is excluded.
         */
        for (int i = 0; i < n; i++) {
            answer[i] = prefixProduct;
            prefixProduct = prefixProduct * numbers[i];
        }

        /*
         * Walk backward with a suffix product (values strictly to the right).
         * Multiply it into the saved prefix to get the product excluding index i.
         * No division is needed, and zero values are handled naturally.
         */
        long suffixProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] = answer[i] * suffixProduct;
            suffixProduct = suffixProduct * numbers[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        long[] answer = productExceptSelf(numbers);
        for (long value : answer) {
            System.out.print(value + " ");
        }
        System.out.println();
        sc.close();
    }
}
