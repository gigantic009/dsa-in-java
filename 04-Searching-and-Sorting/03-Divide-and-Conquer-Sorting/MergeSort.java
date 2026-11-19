import java.util.Arrays;

/**
 * Merge Sort sorts an array by dividing it into halves, sorting each half,
 * and merging the sorted halves back together.
 *
 * Time Complexity: O(n log n)
 * Auxiliary Space: O(n)
 */
public class MergeSort {

    /**
     * Sorts the portion of the array from left to right (inclusive).
     */
    public static void sort(int[] array, int left, int right) {
        // A range containing at most one element is already sorted.
        if (left >= right) {
            return;
        }

        // Find the midpoint without risking integer overflow.
        int middle = left + (right - left) / 2;

        // Recursively sort both halves.
        sort(array, left, middle);
        sort(array, middle + 1, right);

        // Merge the two sorted halves.
        merge(array, left, middle, right);
    }

    /**
     * Merges two sorted ranges: left..middle and middle+1..right.
     */
    private static void merge(int[] array, int left, int middle, int right) {
        int[] temporary = new int[right - left + 1];
        int firstPointer = left;
        int secondPointer = middle + 1;
        int tempPointer = 0;

        // Compare elements from both halves and take the smaller one.
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

        // Copy the merged elements back into the original array range.
        for (int i = 0; i < temporary.length; i++) {
            array[left + i] = temporary[i];
        }
    }

    public static void main(String[] args) {
        int[] array = {8, 3, 5, 1, 9, 2};

        sort(array, 0, array.length - 1);

        System.out.println(Arrays.toString(array));
    }
}
