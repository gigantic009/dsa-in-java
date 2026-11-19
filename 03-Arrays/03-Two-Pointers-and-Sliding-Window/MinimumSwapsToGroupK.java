/*
 * Problem: Find the minimum swaps needed to bring all elements <= k together.
 * LeetCode: Not available
 */

import java.util.Scanner;

public class MinimumSwapsToGroupK {
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
        int k = sc.nextInt();
        // Count how many elements should be in the final group.
        int goodElements = 0;
        for (int number : numbers) {
            if (number <= k) {
                goodElements++;
            }
        }
        if (goodElements <= 1) {
            System.out.println(0);
            sc.close();
            return;
        }
        // Count elements greater than k in the first window.
        int badElements = 0;
        for (int i = 0; i < goodElements; i++) {
            if (numbers[i] > k) {
                badElements++;
            }
        }
        int minimumSwaps = badElements;
        // Slide the window and keep track of the bad elements.
        for (int right = goodElements; right < n; right++) {
            int left = right - goodElements;
            if (numbers[left] > k) {
                badElements--;
            }
            if (numbers[right] > k) {
                badElements++;
            }
            minimumSwaps = Math.min(minimumSwaps, badElements);
        }
        System.out.println(minimumSwaps);
        sc.close();
    }
}
