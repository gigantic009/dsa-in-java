/*
 * Problem: Rotate an array to the right by one position.
 * LeetCode: Not available
 * Time: O(n) | Auxiliary space: O(1)
 */

import java.util.Arrays;
import java.util.Scanner;

public class CyclicallyRotateArrayByOne {
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

        // Rotation has no effect when there are fewer than two elements.
        if (n > 1) {
            // Save the last value because the right shift will overwrite its position.
            int lastElement = numbers[n - 1];

            // Shift from right to left so each source value is still available.
            for (int i = n - 1; i > 0; i--) {
                numbers[i] = numbers[i - 1];
            }

            // Wrap the saved last value around to the first position.
            numbers[0] = lastElement;
        }

        System.out.println(Arrays.toString(numbers));
        sc.close();
    }
}
