/*
 * Problem: Count pairs (i, j) where i < j and numbers[i] > numbers[j].
 * LeetCode: Not available
 * Companies: Not listed
 * Time Complexity: O(n log n)
 * Space Complexity: O(n), for the temporary array.
 */

import java.util.Scanner;

public class CountInversions {
    public static long mergeSort(int[] numbers, int[] temp, int left, int right) {
        if (left >= right) {
            return 0;
        }
        int middle = left + (right - left) / 2;
        long count = 0;
        count += mergeSort(numbers, temp, left, middle);
        count += mergeSort(numbers, temp, middle + 1, right);
        int i = left;
        int j = middle + 1;
        int index = left;
        // Merge both sorted halves and count inversions.
        while (i <= middle && j <= right) {
            if (numbers[i] <= numbers[j]) {
                temp[index] = numbers[i];
                i++;
            } else {
                temp[index] = numbers[j];
                j++;
                // Every remaining element in the left half forms an inversion.
                count += middle - i + 1;
            }
            index++;
        }
        while (i <= middle) {
            temp[index] = numbers[i];
            i++;
            index++;
        }
        while (j <= right) {
            temp[index] = numbers[j];
            j++;
            index++;
        }
        // Copy the merged values back into the original array.
        for (int position = left; position <= right; position++) {
            numbers[position] = temp[position];
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        int[] temp = new int[n];
        System.out.println(mergeSort(numbers, temp, 0, n - 1));
        sc.close();
    }
}
