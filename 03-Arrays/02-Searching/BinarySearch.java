/*
 * Problem: Given a sorted array and a target, return its index.
 * Print -1 if the target is not present.
 * LeetCode: #704
 * Companies: Not listed
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */

import java.util.Scanner;

public class BinarySearch {
    public static int search(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (numbers[middle] == target) {
                return middle;
            }
            if (numbers[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(search(numbers, target));
        sc.close();
    }
}
