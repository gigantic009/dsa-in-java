/*
 * Problem: Determine whether an array contains three elements
 * whose sum equals a given target.
 * LeetCode: #15 is the zero-target 3Sum variant, not an exact match.
 * Time: O(n^2) | Auxiliary space: O(1) excluding sorting implementation
 */

import java.util.Arrays;
import java.util.Scanner;

public class TripletSum {
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
        }
        long target = sc.nextLong();

        // Sorting allows the two inner pointers to adjust the sum in one direction.
        Arrays.sort(numbers);
        boolean found = false;
        // Fix one element; use two pointers to search for the remaining pair.
        for (int i = 0; i < n - 2 && !found; i++) {
            int left = i + 1;
            int right = n - 1;
            while (left < right) {
                long sum = (long) numbers[i] + numbers[left] + numbers[right];
                if (sum == target) {
                    found = true;
                    break;
                }
                if (sum < target) {
                    // Increase the sum by moving left toward larger values.
                    left++;
                } else {
                    // Decrease the sum by moving right toward smaller values.
                    right--;
                }
            }
        }
        System.out.println(found ? "Yes" : "No");
        sc.close();
    }
}
