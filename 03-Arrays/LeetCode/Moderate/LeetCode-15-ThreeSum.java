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

class LeetCode15ThreeSum {
    public static List<List<Integer>> threeSum(int[] numbers) {
        List<List<Integer>> answer = new ArrayList<>();
        // Sorting lets us use two pointers and skip duplicate values.
        Arrays.sort(numbers);
        // Fix one value; search the remaining suffix for a pair summing to its negative.
        for (int i = 0; i < numbers.length - 2; i++) {
            // Skip repeated fixed values to prevent duplicate triplets.
            if (i > 0 && numbers[i] == numbers[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = numbers.length - 1;
            while (left < right) {
                long sum = (long) numbers[i] + numbers[left] + numbers[right];
                if (sum < 0) {
                    // Increase the sum by advancing the left pointer.
                    left++;
                } else if (sum > 0) {
                    // Decrease the sum by retreating the right pointer.
                    right--;
                } else {
                    // Found a triplet; record it and move both pointers.
                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(numbers[i]);
                    triplet.add(numbers[left]);
                    triplet.add(numbers[right]);
                    answer.add(triplet);
                    left++;
                    right--;
                    // Skip duplicate values so this pair is not reported again.
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
