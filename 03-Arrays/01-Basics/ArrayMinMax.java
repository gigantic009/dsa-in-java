/*
 * Problem: Read an integer array and find its minimum and maximum values.
 * LeetCode: Not available
 * Companies: ABCO, Accolite, Amazon, Cisco, Hike, Microsoft,
 *            Snapdeal, VMWare, Google, Adobe
 * Time Complexity: O(n)
 * Space Complexity: O(1), excluding the input array.
 */

import java.util.Scanner;

public class ArrayMinMax {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Array must be non-empty");
            sc.close();
            return;
        }

        // Use the first element as the starting minimum and maximum.
        int firstNumber = sc.nextInt();

        int minimum = firstNumber;
        int maximum = firstNumber;

        // Compare every remaining element with the current values.
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
