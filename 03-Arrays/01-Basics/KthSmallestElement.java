/*
 * Problem: Find the kth smallest element in an unsorted array.
 * LeetCode: Not available
 * Companies: ABCO, Accolite, Amazon, Cisco, Hike, Microsoft,
 *            Snapdeal, VMWare, Google, Adobe
 * Time Complexity: O(n log n), due to sorting.
 * Space Complexity: Depends on the sorting implementation.
 */

import java.util.Arrays;
import java.util.Scanner;

public class KthSmallestElement {
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
        System.out.println(numbers[k - 1]);
        sc.close();
    }
}
