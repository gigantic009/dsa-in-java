/*
 * Problem: Sort an array containing only 0, 1 and 2.
 * Do not use a comparison-based sorting algorithm.
 * LeetCode: #75
 * Companies: Not listed
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

import java.util.Arrays;
import java.util.Scanner;

public class Sort012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
            if (numbers[i] < 0 || numbers[i] > 2) {
                System.out.println("Only 0, 1 and 2 are allowed");
                sc.close();
                return;
            }
        }
        int low = 0;
        int middle = 0;
        int high = n - 1;
        // Values before low are 0; values after high are 2.
        while (middle <= high) {
            if (numbers[middle] == 0) {
                int temp = numbers[low];
                numbers[low] = numbers[middle];
                numbers[middle] = temp;
                low++;
                middle++;
            } else if (numbers[middle] == 1) {
                middle++;
            } else {
                int temp = numbers[middle];
                numbers[middle] = numbers[high];
                numbers[high] = temp;
                high--;
            }
        }
        System.out.println(Arrays.toString(numbers));
        sc.close();
    }
}
