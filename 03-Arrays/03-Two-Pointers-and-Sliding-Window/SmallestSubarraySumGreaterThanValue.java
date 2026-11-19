/*
 * Problem: Find the minimum length of a contiguous subarray
 * whose sum is greater than the target.
 * LeetCode: Not available
 */

import java.util.Scanner;

public class SmallestSubarraySumGreaterThanValue {
    public static int minLength(int[] numbers, long target) {
        for (int number : numbers) {
            if (number < 0) {
                throw new IllegalArgumentException(
                        "Sliding window solution requires non-negative elements"
                );
            }
        }
        int left = 0;
        int minimumLength = numbers.length + 1;
        long currentSum = 0;
        // Expand the window by moving the right pointer.
        for (int right = 0; right < numbers.length; right++) {
            currentSum += numbers[right];
            // Shrink the window while its sum is still greater than target.
            while (currentSum > target) {
                int currentLength = right - left + 1;
                minimumLength = Math.min(minimumLength, currentLength);
                currentSum -= numbers[left];
                left++;
            }
        }
        if (minimumLength == numbers.length + 1) {
            return 0;
        }
        return minimumLength;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        long target = sc.nextLong();
        System.out.println(minLength(numbers, target));
        sc.close();
    }
}
