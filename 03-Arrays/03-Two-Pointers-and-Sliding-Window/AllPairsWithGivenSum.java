/*
 * Problem: Print all distinct value pairs whose sum equals the target.
 * Time: O(n log n) | Auxiliary space: O(1) excluding sorting implementation
 */

import java.util.Arrays;
import java.util.Scanner;

public class AllPairsWithGivenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Array size must be non-negative");
            sc.close();
            return;
        }
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        // Sorting allows two pointers to move toward the target sum.
        Arrays.sort(numbers);
        int left = 0;
        int right = n - 1;
        while (left < right) {
            // Use long so adding two int values cannot overflow.
            long sum = (long) numbers[left] + numbers[right];
            if (sum == target) {
                System.out.println(numbers[left] + " " + numbers[right]);
                // Skip repeated copies to print each value pair only once.
                int leftValue = numbers[left];
                int rightValue = numbers[right];
                while (left < right && numbers[left] == leftValue) {
                    left++;
                }
                while (left < right && numbers[right] == rightValue) {
                    right--;
                }
            } else if (sum < target) {
                // Increase the sum by moving the left pointer to a larger value.
                left++;
            } else {
                // Decrease the sum by moving the right pointer to a smaller value.
                right--;
            }
        }
        sc.close();
    }
}
