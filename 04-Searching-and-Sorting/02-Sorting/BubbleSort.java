// EDUCATIONAL NOTES:
// After each outer pass, the largest element among the unsorted suffix has
// bubbled into its final position. swapped enables early exit on sorted input.

// Bubble Sort: O(n^2) time, O(1) space.
// Repeatedly swaps adjacent elements that are in the wrong order.
import java.util.Arrays;

public class BubbleSort {
    static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean swapped = false;

            // The largest remaining element moves to the end.
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no swap happened, the array is already sorted.
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 1, 2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
