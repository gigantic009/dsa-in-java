/*
 * Problem: Find the minimum and maximum values in a non-empty integer array.
 * LeetCode: Not available
 * Companies: ABCO, Accolite, Amazon, Cisco, Hike, Microsoft,
 *            Snapdeal, VMWare, Google, Adobe
 * Time Complexity: O(n)
 * Space Complexity: O(1), excluding the input array.
 */

import java.util.Scanner;

public class MaximumAndMinimum {
    public static int[] findMinMax(int[] numbers) {
        int minimum = numbers[0];
        int maximum = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minimum) {
                minimum = numbers[i];
            }
            if (numbers[i] > maximum) {
                maximum = numbers[i];
            }
        }
        return new int[]{minimum, maximum};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Array must contain at least one element.");
            sc.close();
            return;
        }
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        int[] answer = findMinMax(numbers);
        System.out.println("Minimum: " + answer[0]);
        System.out.println("Maximum: " + answer[1]);
        sc.close();
    }
}
