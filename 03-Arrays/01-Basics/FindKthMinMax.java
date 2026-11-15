/*
 * Problem: Find the kth smallest and kth largest elements in an array.
 * LeetCode: Not available
 * Companies: Not listed
 * Time Complexity: O(n log n), due to sorting.
 * Space Complexity: Depends on the sorting implementation.
 */

import java.util.Arrays;
import java.util.Scanner;

public class FindKthMinMax {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        if (k < 1 || k > n) {
            System.out.println("Invalid k");
            sc.close();
            return;
        }

        Arrays.sort(numbers);

        System.out.println("Kth smallest: " + numbers[k - 1]);
        System.out.println("Kth largest: " + numbers[n - k]);

        sc.close();
    }
}
