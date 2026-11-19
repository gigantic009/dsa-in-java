/*
 * Problem: Determine whether an array contains three elements
 * whose sum equals a given target.
 * LeetCode: #15 is the zero-target 3Sum variant, not an exact match.
 * Companies: Not listed
 * Time Complexity: O(n^2), after sorting.
 * Space Complexity: Depends on the sorting implementation.
 */

import java.util.Arrays;
import java.util.Scanner;

public class TripletSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        long target = sc.nextLong();
        Arrays.sort(numbers);
        boolean found = false;
        // Fix one element and search for the other two.
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
                    left++;
                } else {
                    right--;
                }
            }
        }
        System.out.println(found ? "Yes" : "No");
        sc.close();
    }
}
