/*
 * Problem: Reverse the given array in place and print the resulting order.
 * LeetCode: Not available
 * Companies: Infosys, Moonfrog Labs
 * Time Complexity: O(n)
 * Space Complexity: O(1), excluding the input array.
 */

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        int left = 0;
        int right = n - 1;
        // Swap the first and last elements, then move towards the centre.
        while (left < right) {
            int temp = numbers[left];
            numbers[left] = numbers[right];
            numbers[right] = temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(numbers));
        sc.close();
    }
}
