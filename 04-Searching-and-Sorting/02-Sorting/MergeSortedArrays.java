// EDUCATIONAL NOTES:
// Both inputs must already be sorted. Two read pointers select the next smaller
// value; a write pointer fills the output. Remaining tails are copied afterward.

// Merge two sorted arrays: O(n + m) time, O(n + m) space.
import java.util.Arrays;

public class MergeSortedArrays {
    static int[] merge(int[] a, int[] b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("Both arrays must not be null");
        }

        int[] result = new int[a.length + b.length];
        int i = 0;
        int j = 0;
        int k = 0;

        // Pick the smaller element from the two arrays.
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                result[k++] = a[i++];
            } else {
                result[k++] = b[j++];
            }
        }

        // Copy leftover elements.
        while (i < a.length) {
            result[k++] = a[i++];
        }

        while (j < b.length) {
            result[k++] = b[j++];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7};
        int[] b = {2, 4, 6, 8};
        System.out.println(Arrays.toString(merge(a, b)));
    }
}
