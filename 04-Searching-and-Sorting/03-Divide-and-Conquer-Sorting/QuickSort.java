// EDUCATIONAL NOTES:
// A three-way partition places values below, equal to and above the pivot in
// separate regions. Random pivots help avoid consistently unbalanced partitions.
// Sorting the smaller region first keeps the recursion depth bounded.

// Quick Sort: O(n log n) average time, O(log n) average space.
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class QuickSort {
    static void sort(int[] arr, int low, int high) {
        while (low < high) {
            int pivot = arr[ThreadLocalRandom.current().nextInt(low, high + 1)];
            int smaller = low;
            int current = low;
            int larger = high;

            // Divide the range into values below, equal to and above the pivot.
            while (current <= larger) {
                if (arr[current] < pivot) {
                    swap(arr, smaller, current);
                    smaller++;
                    current++;
                } else if (arr[current] > pivot) {
                    swap(arr, current, larger);
                    larger--;
                } else {
                    current++;
                }
            }

            // Recurse on the smaller range, then continue with the larger one.
            if (smaller - low < high - larger) {
                sort(arr, low, smaller - 1);
                low = larger + 1;
            } else {
                sort(arr, larger + 1, high);
                high = smaller - 1;
            }
        }
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
