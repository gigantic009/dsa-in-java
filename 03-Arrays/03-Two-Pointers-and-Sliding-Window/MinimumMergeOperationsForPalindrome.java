/*
 * Problem: Find the minimum merge operations needed to make an array a palindrome.
 * One operation merges two adjacent elements by replacing them with their sum.
 * LeetCode: Not available
 */

import java.util.Scanner;

public class MinimumMergeOperationsForPalindrome {
    public static int minOperations(int[] numbers) {
        int left = 0;
        int right = numbers.length - 1;
        long operations = 0;
        while (left < right) {
            if (numbers[left] == numbers[right]) {
                // Both sides already match.
                left++;
                right--;
            } else if (numbers[left] < numbers[right]) {
                // Merge the left value into its neighbour.
                numbers[left + 1] = numbers[left + 1] + numbers[left];
                left++;
                operations++;
            } else {
                // Merge the right value into its neighbour.
                numbers[right - 1] = numbers[right - 1] + numbers[right];
                right--;
                operations++;
            }
        }
        return operations;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Invalid array size");
            sc.close();
            return;
        }
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
            if (numbers[i] < 0) {
                System.out.println("Values must be non-negative for this algorithm");
                sc.close();
                return;
            }
        }
        System.out.println(minOperations(numbers));
        sc.close();
    }
}
