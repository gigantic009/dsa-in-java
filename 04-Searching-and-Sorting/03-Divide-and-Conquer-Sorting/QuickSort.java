/** Quick sort. Average O(n log n), worst O(n^2); average recursion space O(log n). */
import java.util.Arrays;
public class QuickSort {
    static void sort(int[] nums, int low, int high) {
        if (low >= high) return;                   // A range of 0 or 1 items is sorted.
        int pivotIndex = partition(nums, low, high); // Place pivot in its final position.
        sort(nums, low, pivotIndex - 1);            // Sort values left of the pivot.
        sort(nums, pivotIndex + 1, high);            // Sort values right of the pivot.
    }

    private static int partition(int[] nums, int low, int high) {
        int pivot = nums[high];                     // Choose the last value as pivot.
        int smallerIndex = low;                     // Boundary for values <= pivot.
        for (int j = low; j < high; j++) {
            if (nums[j] <= pivot) {
                swap(nums, smallerIndex, j);         // Move small value to left partition.
                smallerIndex++;
            }
        }
        swap(nums, smallerIndex, high);              // Place pivot between partitions.
        return smallerIndex;                         // Pivot's final sorted index.
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i]; nums[i] = nums[j]; nums[j] = temp; // Exchange two values.
    }

    public static void main(String[] args) {
        int[] nums = {9, 3, 7, 1, 5};
        sort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }
}