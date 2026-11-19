/*
 * Problem: Sort an array containing only 0, 1 and 2.
 * Do not use a comparison-based sorting algorithm.
 * LeetCode: #75
 * Time: O(n) | Auxiliary space: O(1)
 */

import java.util.Arrays;
import java.util.Scanner;

class LeetCode75SortColors {
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

        // Dutch National Flag invariant: low..middle is the 1-region; high marks 2s.
        int low = 0;
        int middle = 0;
        int high = n - 1;
        // The middle..high range remains unclassified until the pointers cross.
        while (middle <= high) {
            if (numbers[middle] == 0) {
                // Swap a zero into the front region; both front pointers advance.
                int temp = numbers[low];
                numbers[low] = numbers[middle];
                numbers[middle] = temp;
                low++;
                middle++;
            } else if (numbers[middle] == 1) {
                // A one already belongs in the middle region.
                middle++;
            } else {
                // Move a two to the end; recheck the value swapped into middle.
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
