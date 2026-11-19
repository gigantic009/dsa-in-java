// Selection Sort: O(n^2) time, O(1) space.
// Selects the smallest element and puts it at the front each time.
import java.util.Arrays;

public class SelectionSort {
    static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;

            // Find the smallest element in the remaining array.
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) min = j;
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 1, 2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
