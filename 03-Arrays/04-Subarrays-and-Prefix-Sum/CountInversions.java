/*
 * Problem: Count pairs (i, j) where i < j and numbers[i] > numbers[j].
 * LeetCode: Not available
 * Time: O(n log n) | Auxiliary space: O(n)
 */

import java.util.Scanner;

public class CountInversions {
    public static long mergeSort(int[] numbers, int[] temp, int left, int right) {
        // A range with one or zero elements cannot contain an inversion.
        if (left >= right) {
            return 0;
        }
        // Divide the range, count inversions within each half, then across halves.
        int middle = left + (right - left) / 2;
        long count = 0;
        count += mergeSort(numbers, temp, left, middle);
        count += mergeSort(numbers, temp, middle + 1, right);

        // The two halves are now sorted; merging can count cross-half inversions.
        int i = left;
        int j = middle + 1;
        int index = left;
        while (i <= middle && j <= right) {
            if (numbers[i] <= numbers[j]) {
                // This left value is not greater than the current right value.
                temp[index] = numbers[i];
                i++;
            } else {
                /*
                 * numbers[j] is smaller than numbers[i]. Since the left half is sorted,
                 * it is also smaller than every remaining left value, producing
                 * middle - i + 1 inversions at once.
                 */
                temp[index] = numbers[j];
                j++;
                count += middle - i + 1;
            }
            index++;
        }
        // Copy whichever half still has unmerged values.
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
        // Restore this range from the temporary buffer so parent merges stay sorted.
        for (int position = left; position <= right; position++) {
            numbers[position] = temp[position];
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Invalid array size");
            sc.close();
            return;
        }
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        int[] temp = new int[n];
        System.out.println(mergeSort(numbers, temp, 0, n - 1));
        sc.close();
    }
}
