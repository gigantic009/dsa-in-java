/*
 * Problem: Sort an array containing only 0, 1 and 2.
 * Do not use a comparison-based sorting algorithm.
 * LeetCode: #75
 * Time: O(n) | Auxiliary space: O(1)
 */

import java.util.Arrays;
import java.util.Scanner;

public class Sort012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
            if (numbers[i] < 0 || numbers[i] > 2) {
                System.out.println("Only 0, 1 and 2 are allowed");
                sc.close();
                return;
            }
        }

        /*
         * Dutch National Flag invariant:
         * [0, low) contains 0s, [low, middle) contains 1s,
         * (high, n) contains 2s; middle..high is still unclassified.
         */
        int low = 0;
        int middle = 0;
        int high = n - 1;
        while (middle <= high) {
            if (numbers[middle] == 0) {
                // Move a zero to the low region; both boundaries advance.
                int temp = numbers[low];
                numbers[low] = numbers[middle];
                numbers[middle] = temp;
                low++;
                middle++;
            } else if (numbers[middle] == 1) {
                // A one already belongs in the middle region.
                middle++;
            } else {
                // Move a two to the high region; recheck the swapped-in value.
                int temp = numbers[middle];
                numbers[middle] = numbers[high];
                numbers[high] = temp;
                high--;
            }
        }
        System.out.println(Arrays.toString(numbers));
        sc.close();
    }
}
