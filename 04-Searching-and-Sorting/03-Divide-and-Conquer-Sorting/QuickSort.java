// Quick Sort: O(n log n) average, O(n^2) worst-case time.
// LeetCode: 912 - Sort an Array
import java.util.Arrays;

public class QuickSort {
    static void sort(int[] arr, int low, int high) {
        if (low >= high) return; // One element is already sorted.

        int pivotIndex = partition(arr, low, high);
        sort(arr, low, pivotIndex - 1); // Sort values before the pivot.
        sort(arr, pivotIndex + 1, high); // Sort values after the pivot.
    }

    // Uses the last element as pivot and puts it in its correct position.
    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low;

        // Move values smaller than or equal to pivot to the left side.
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                swap(arr, i, j);
                i++;
            }
        }

        swap(arr, i, high); // Place pivot between the two sides.
        return i;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 1, 3};
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
