/**
 * Merge Sort sorts an array using the divide-and-conquer approach:
 * divide the array into halves, sort each half, and merge them.
 *
 * Time Complexity: O(n log n) in all cases
 * Auxiliary Space: O(n) for the temporary merge array
 *
 * Related problem: LeetCode 912 - Sort an Array
 * https://leetcode.com/problems/sort-an-array/
 */
import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {

    /**
     * Sorts the portion of the array from left to right (inclusive).
     */
    static void sort(int[] array, int left, int right) {
        // A range containing at most one element is already sorted.
        if (left >= right) {
            return;
        }

        // Calculate midpoint safely.
        int middle = left + (right - left) / 2;

        // Recursively sort both halves.
        sort(array, left, middle);
        sort(array, middle + 1, right);

        // Merge the two sorted halves.
        merge(array, left, middle, right);
    }

    /**
     * Merges the sorted ranges left..middle and middle+1..right.
     */
    private static void merge(int[] array, int left, int middle, int right) {
        int[] temporary = new int[right - left + 1];
        int firstPointer = left;
        int secondPointer = middle + 1;
        int tempPointer = 0;

        // Compare both halves and copy the smaller element.
        while (firstPointer <= middle && secondPointer <= right) {
            if (array[firstPointer] <= array[secondPointer]) {
                temporary[tempPointer++] = array[firstPointer++];
            } else {
                temporary[tempPointer++] = array[secondPointer++];
            }
        }

        // Copy any remaining elements from the left half.
        while (firstPointer <= middle) {
            temporary[tempPointer++] = array[firstPointer++];
        }

        // Copy any remaining elements from the right half.
        while (secondPointer <= right) {
            temporary[tempPointer++] = array[secondPointer++];
        }

        // Copy the merged result back into the original array.
        for (int i = 0; i < temporary.length; i++) {
            array[left + i] = temporary[i];
        }
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
