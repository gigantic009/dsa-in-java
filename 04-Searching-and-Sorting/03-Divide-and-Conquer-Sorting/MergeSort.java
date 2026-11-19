// Merge Sort: O(n log n) time, O(n) extra space.
// LeetCode: 912 - Sort an Array
import java.util.Arrays;

public class MergeSort {
    static void sort(int[] arr, int left, int right) {
        if (left >= right) return; // One element is already sorted.

        int mid = left + (right - left) / 2;
        sort(arr, left, mid);       // Sort the left half.
        sort(arr, mid + 1, right);  // Sort the right half.
        merge(arr, left, mid, right); // Combine the sorted halves.
    }

    static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;

        // Compare elements from both halves and take the smaller one.
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) temp[k++] = arr[i++];
            else temp[k++] = arr[j++];
        }

        // Copy elements left over in either half.
        while (i <= mid) temp[k++] = arr[i++];
        while (j <= right) temp[k++] = arr[j++];

        // Copy the merged elements back into the original array.
        for (int x = 0; x < temp.length; x++) arr[left + x] = temp[x];
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 1, 3};
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
