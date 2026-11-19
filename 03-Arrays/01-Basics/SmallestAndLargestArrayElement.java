/*
 * Problem: Print the minimum and maximum elements of the input array.
 * LeetCode: Not available
 */

import java.util.Scanner;

public class SmallestAndLargestArrayElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Empty");
            sc.close();
            return;
        }
        int minimum = Integer.MAX_VALUE;
        int maximum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int currentNumber = sc.nextInt();
            if (currentNumber < minimum) {
                minimum = currentNumber;
            }
            if (currentNumber > maximum) {
                maximum = currentNumber;
            }
        }
        System.out.println(minimum + " " + maximum);
        sc.close();
    }
}
