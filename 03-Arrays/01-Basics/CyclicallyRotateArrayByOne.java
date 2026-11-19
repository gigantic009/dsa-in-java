/*
 * Problem: Rotate an array to the right by one position.
 * LeetCode: Not available
 */

import java.util.Arrays;
import java.util.Scanner;

public class CyclicallyRotateArrayByOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        // An empty or single-element array does not need rotation.
        if (n > 1) {
            // Store the last element before shifting.
            int lastElement = numbers[n - 1];
            // Move every element one position to the right.
            for (int i = n - 1; i > 0; i--) {
                numbers[i] = numbers[i - 1];
            }
            // Place the old last element at the beginning.
            numbers[0] = lastElement;
        }
        System.out.println(Arrays.toString(numbers));
        sc.close();
    }
}
