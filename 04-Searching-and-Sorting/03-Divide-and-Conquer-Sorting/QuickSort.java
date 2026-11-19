/**
 * Quick Sort partitions an array around a pivot, then recursively sorts
 * the elements on either side of that pivot.
 *
 * Time Complexity: O(n log n) average, O(n^2) worst case
 * Auxiliary Space: O(log n) average recursion stack, O(n) worst case
 *
 * Related problem: LeetCode 912 - Sort an Array
 * https://leetcode.com/problems/sort-an-array/
 */
import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {

    /**
     * Sorts the portion of the array from low to high (inclusive).
     */
    static void sort(int[] array, int low, int high) {
        // A range containing at most one element is already sorted.
        if (low >= high) {
            return;
        }

        // Partition places the pivot at its final position.
        int pivotIndex = partition(array, low, high);

        // Recursively sort both partitions.
        sort(array, low, pivotIndex - 1);
        sort(array, pivotIndex + 1, high);
    }

    /**
     * Uses the last element as pivot and places smaller/equal elements
     * to its left and larger elements to its right.
     */
    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int smallerIndex = low;

        for (int current = low; current < high; current++) {
            if (array[current] <= pivot) {
                swap(array, smallerIndex, current);
                smallerIndex++;
            }
        }

        // Place the pivot between the two partitions.
        swap(array, smallerIndex, high);
        return smallerIndex;
    }

    /** Exchanges the values at two indices. */
    private static void swap(int[] array, int first, int second) {
        int temporary = array[first];
        array[first] = array[second];
        array[second] = temporary;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Array size: ");
        int size = scanner.nextInt();

        if (size < 0) {
            System.out.println("Invalid size.");
            scanner.close();
            return;
        }

        int[] array = new int[size];

        System.out.println("Enter elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        sort(array, 0, array.length - 1);

        System.out.println("Sorted array: " + Arrays.toString(array));
        scanner.close();
    }
}
