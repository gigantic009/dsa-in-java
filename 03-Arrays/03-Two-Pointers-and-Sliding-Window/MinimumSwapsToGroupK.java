/*
 * Problem: Find the minimum swaps needed to bring all elements <= k together.
 * LeetCode: Not available
 * Time: O(n) | Auxiliary space: O(1)
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

        // The final group must have exactly as many slots as qualifying values.
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

        /*
         * Any window of this size can hold all qualifying elements.
         * The number of non-qualifying ("bad") values in a window is the swaps
         * needed to replace them with qualifying values from outside that window.
         */
        int badElements = 0;
        for (int i = 0; i < goodElements; i++) {
            if (numbers[i] > k) {
                badElements++;
            }
        }
        int minimumSwaps = badElements;

        // Slide one position: remove the outgoing value and add the incoming value.
        for (int right = goodElements; right < n; right++) {
            int left = right - goodElements;
            if (numbers[left] > k) {
                badElements--;
            }
            if (numbers[right] > k) {
                badElements++;
            }
            // The window with the fewest bad values gives the fewest required swaps.
            minimumSwaps = Math.min(minimumSwaps, badElements);
        }
        System.out.println(minimumSwaps);
        sc.close();
    }
}
