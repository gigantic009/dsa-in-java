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
        Arrays.sort(numbers);
        // Fix one number and find two numbers that complete the sum.
        for (int i = 0; i < numbers.length - 2; i++) {
            // Skip the same first number to avoid duplicate triplets.
            if (i > 0 && numbers[i] == numbers[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = numbers.length - 1;
            while (left < right) {
                long sum = (long) numbers[i] + numbers[left] + numbers[right];
                if (sum < 0) {
                    left++;
                } else if (sum > 0) {
                    right--;
                } else {
                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(numbers[i]);
                    triplet.add(numbers[left]);
                    triplet.add(numbers[right]);
                    answer.add(triplet);
                    left++;
                    right--;
                    // Skip duplicate values at both pointers.
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
