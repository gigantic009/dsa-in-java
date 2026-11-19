// EDUCATIONAL NOTES:
// Before each iteration, the prefix [0, i) is sorted. Shift larger elements
// right to create a slot, then insert value. Stable and efficient on small or
// nearly sorted arrays; worst-case quadratic time.

// Insertion Sort: O(n^2) time, O(1) space.
// Places each element in its correct position in the sorted part.
import java.util.Arrays;

public class InsertionSort {
    static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int value = arr[i];
            int j = i - 1;

            // Move bigger elements one step to the right.
            while (j >= 0 && arr[j] > value) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = value;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 1, 3};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
