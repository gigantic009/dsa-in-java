/*
 * Problem: Partition an array into values below a, from a through b,
 * and values above b.
 * LeetCode: Not available
 * Time: O(n) | Auxiliary space: O(1)
 */

import java.util.Arrays;
import java.util.Scanner;

public class ThreeWayPartition {
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
        int low = sc.nextInt();
        int high = sc.nextInt();
        if (low > high) {
            System.out.println("Invalid range");
            sc.close();
            return;
        }

        /*
         * Three-region invariant: [0,left) is below low, [left,middle) is
         * in the allowed range, and (right,n) is above high.
         * middle..right is the unclassified region.
         */
        int left = 0;
        int middle = 0;
        int right = n - 1;
        while (middle <= right) {
            if (numbers[middle] < low) {
                // Move a small value into the left region; both pointers advance.
                int temp = numbers[left];
                numbers[left] = numbers[middle];
                numbers[middle] = temp;
                left++;
                middle++;
            } else if (numbers[middle] > high) {
                // Move a large value into the right region; recheck the swapped value.
                int temp = numbers[middle];
                numbers[middle] = numbers[right];
                numbers[right] = temp;
                right--;
            } else {
                // The value belongs in the middle region, so classify it and advance.
                middle++;
            }
        }
        System.out.println(Arrays.toString(numbers));
        sc.close();
    }
}
