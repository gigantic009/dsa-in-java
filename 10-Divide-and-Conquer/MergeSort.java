// Merge sort divides the array and merges sorted halves.
// Time Complexity: O(n log n) in all cases.
// Space Complexity: O(n) auxiliary arrays (plus O(log n) recursion stack).
import java.util.Arrays;

public class MergeSort {
    public static void sort(int[] a) {
        if (a == null) {
            throw new IllegalArgumentException("Array must not be null");
        }
        if (a.length < 2) {
            return;
        }

        int mid = a.length / 2;
        int[] left = Arrays.copyOfRange(a, 0, mid);
        int[] right = Arrays.copyOfRange(a, mid, a.length);

        sort(left);
        sort(right);
        merge(a, left, right);
    }

    private static void merge(int[] a, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        // Select the smaller value from the two sorted halves.
        while (i < left.length && j < right.length) {
            a[k++] = left[i] <= right[j] ? left[i++] : right[j++];
        }

        // Copy any values remaining in either half.
        while (i < left.length) {
            a[k++] = left[i++];
        }
        while (j < right.length) {
            a[k++] = right[j++];
        }
    }
}