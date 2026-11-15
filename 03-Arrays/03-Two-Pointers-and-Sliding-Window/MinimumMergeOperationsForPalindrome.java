/**
 * Question:
 * Given an array of non-negative integers, find the minimum number of
 * merge operations needed to make it a palindrome. One operation merges
 * two adjacent elements by replacing them with their sum. Read n and the
 * array values from standard input.
 *
 * LeetCode: Not available — no exact problem number verified.
 *
 * Companies: Amazon
 */
import java.util.Scanner;

public class MinimumMergeOperationsForPalindrome {
    public static int minOperations(int[] values) {
        int left = 0, right = values.length - 1;
        int operations = 0;

        while (left < right) {
            if (values[left] == values[right]) {
                left++;
                right--;
            } else if (values[left] < values[right]) {
                values[left + 1] += values[left];
                left++;
                operations++;
            } else {
                values[right - 1] += values[right];
                right--;
                operations++;
            }
        }
        return operations;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] values = new int[n];
        for (int i = 0; i < n; i++) values[i] = scanner.nextInt();

        System.out.println(minOperations(values));
        scanner.close();
    }
}
