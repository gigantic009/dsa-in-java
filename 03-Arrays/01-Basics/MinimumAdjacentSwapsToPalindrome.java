/*
 * Problem: Find the minimum adjacent swaps needed to rearrange an array
 * into a palindrome, or report that it is impossible.
 * LeetCode: Not available
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MinimumAdjacentSwapsToPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
        Map<Integer, Integer> frequency = new HashMap<>();
        // Read the array and count how often each number appears.
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
            frequency.put(
                    numbers[i],
                    frequency.getOrDefault(numbers[i], 0) + 1
            );
        }
        // A palindrome can have at most one number with odd frequency.
        int oddFrequencyCount = 0;
        for (int count : frequency.values()) {
            if (count % 2 != 0) {
                oddFrequencyCount++;
            }
        }
        if (oddFrequencyCount > 1) {
            System.out.println(-1);
            sc.close();
            return;
        }
        int left = 0;
        int right = n - 1;
        long swaps = 0;
        while (left < right) {
            int match = right;
            // Find a matching number for the left-side element.
            while (match > left && numbers[match] != numbers[left]) {
                match--;
            }
            if (match == left) {
                // No match was found, so move this element one step inward.
                int temp = numbers[left];
                numbers[left] = numbers[left + 1];
                numbers[left + 1] = temp;
                swaps++;
            } else {
                // Move the matching element to the right-side position.
                while (match < right) {
                    int temp = numbers[match];
                    numbers[match] = numbers[match + 1];
                    numbers[match + 1] = temp;
                    match++;
                    swaps++;
                }
                left++;
                right--;
            }
        }
        System.out.println(swaps);
        sc.close();
    }
}
