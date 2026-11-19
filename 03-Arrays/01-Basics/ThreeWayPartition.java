/*
 * Problem: Partition an array into values below a, from a through b,
 * and values above b.
 * LeetCode: Not available
 * Companies: Not listed
 * Time Complexity: O(n)
 * Space Complexity: O(1), excluding the input array.
 */

import java.util.Arrays;
import java.util.Scanner;

public class ThreeWayPartition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
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
        int left = 0;
        int middle = 0;
        int right = n - 1;
        // Keep values below low on the left and above high on the right.
        while (middle <= right) {
            if (numbers[middle] < low) {
                int temp = numbers[left];
                numbers[left] = numbers[middle];
                numbers[middle] = temp;
                left++;
                middle++;
            } else if (numbers[middle] > high) {
                int temp = numbers[middle];
                numbers[middle] = numbers[right];
                numbers[right] = temp;
                right--;
            } else {
                middle++;
            }
        }
        System.out.println(Arrays.toString(numbers));
        sc.close();
    }
}
