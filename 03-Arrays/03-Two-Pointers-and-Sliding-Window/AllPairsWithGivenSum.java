/*
 * Problem: Print all distinct value pairs whose sum equals the target.
 * LeetCode: Not available
 */

import java.util.Arrays;
import java.util.Scanner;

public class AllPairsWithGivenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        Arrays.sort(numbers);
        int left = 0;
        int right = n - 1;
        // Print each distinct value pair only once.
        while (left < right) {
            long sum = (long) numbers[left] + numbers[right];
            if (sum == target) {
                System.out.println(numbers[left] + " " + numbers[right]);
                int leftValue = numbers[left];
                int rightValue = numbers[right];
                // Skip duplicate values so the same pair is not printed again.
                while (left < right && numbers[left] == leftValue) {
                    left++;
                }
                while (left < right && numbers[right] == rightValue) {
                    right--;
                }
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        sc.close();
    }
}
