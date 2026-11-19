/*
 * Problem: Print every unique triplet whose sum is zero.
 * LeetCode: #15
 * Time Complexity: O(n^2)
 * Space Complexity: Depends on sorting and the result list.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] numbers) {
        List<List<Integer>> answer = new ArrayList<>();
        // Sorting makes the two-pointer search possible and groups duplicates.
        Arrays.sort(numbers);

        // Fix one value; the remaining problem is a two-sum search for its negation.
        for (int i = 0; i < numbers.length - 2; i++) {
            // Skip duplicate fixed values so the same triplet is not generated again.
            if (i > 0 && numbers[i] == numbers[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = numbers.length - 1;
            while (left < right) {
                long sum = (long) numbers[i] + numbers[left] + numbers[right];
                if (sum < 0) {
                    // Sorted order: increase the sum by advancing left.
                    left++;
                } else if (sum > 0) {
                    // Sorted order: decrease the sum by retreating right.
                    right--;
                } else {
                    // Record the triplet, then move both pointers past this pair.
                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(numbers[i]);
                    triplet.add(numbers[left]);
                    triplet.add(numbers[right]);
                    answer.add(triplet);
                    left++;
                    right--;
                    // Skip repeated left/right values to avoid duplicate triplets.
                    while (left < right && numbers[left] == numbers[left - 1]) {
                        left++;
                    }
                    while (left < right && numbers[right] == numbers[right + 1]) {
                        right--;
                    }
                }
            }
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
        List<List<Integer>> answer = threeSum(numbers);
        for (List<Integer> triplet : answer) {
            System.out.println(triplet);
        }
        sc.close();
    }
}
