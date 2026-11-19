// EDUCATIONAL NOTES:
// Dutch National Flag invariant: [0, low) zeroes, [low, mid) ones, (high, n) twos;
// [mid, high] is unknown. After swapping a 2 with high, mid stays put because
// the incoming value is unclassified and must be examined.

// Sort an array of 0, 1 and 2: O(n) time, O(1) space.
// Dutch National Flag algorithm.
import java.util.Arrays;

public class Sort012 {
    static void sort(int[] arr) {
        int low = 0, mid = 0, high = arr.length - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr, low, mid);
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else { // arr[mid] is 2
                swap(arr, mid, high);
                high--;
            }
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {2, 0, 1, 2, 1, 0};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
