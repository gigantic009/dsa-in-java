/*
 * Problem: Find the maximum and minimum values in an array in one traversal.
 * LeetCode: Not available
 */

import java.util.Scanner;

public class FindMaximumMinimum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Array is empty");
            sc.close();
            return;
        }
        // Read the first element and use it for both initial values.
        int firstNumber = sc.nextInt();
        int minimum = firstNumber;
        int maximum = firstNumber;
        // Check each remaining element once.
        for (int i = 1; i < n; i++) {
            int currentNumber = sc.nextInt();
            if (currentNumber < minimum) {
                minimum = currentNumber;
            }
            if (currentNumber > maximum) {
                maximum = currentNumber;
            }
        }
        System.out.println("Minimum: " + minimum);
        System.out.println("Maximum: " + maximum);
        sc.close();
    }
}
