/*
 * Problem: Find the maximum sum of a non-empty contiguous subarray.
 * LeetCode: #53nies: Not listed
 * Time Complexity: O(n)
 * Space Complexity: O(1), excluding the input array.
 */

import java.util.Scanner;

public class LeetCode53MaximumSubarray {
    public static long maxSubarraySum(int[] numbers) {
        // Start with the first element so all-negative arrays work correctly.
        long currentSum = numbers[0];
        long maximumSum = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            // Either extend the current subarray or start a new one.
            currentSum = Math.max(numbers[i], currentSum + numbers[i]);
            if (currentSum > maximumSum) {
                maximumSum = currentSum;
            }
        }
        return maximumSum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Array must contain at least one element.");
            sc.close();
            return;
        }
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println(maxSubarraySum(numbers));
        sc.close();
    }
}
