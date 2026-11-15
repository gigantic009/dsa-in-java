/*
 * Problem: Reverse an integer array in place.
 * LeetCode: Not available
 * Companies: Infosys, Moonfrog Labs
 * Time Complexity: O(n)
 * Space Complexity: O(1), excluding the input array.
 */

import java.util.Scanner;

public class ReverseArray {

    public static void reverse(int[] numbers) {

        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {

            int temp = numbers[left];
            numbers[left] = numbers[right];
            numbers[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        reverse(numbers);

        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println();

        sc.close();
    }
}
