// Count inversions while merging halves in sorted order.
// Time Complexity: O(n log n) — merge sort plus counting during each merge.
// Space Complexity: O(n) auxiliary space for temporary merge arrays (plus O(log n) recursion stack).
public class CountInversions {
    public static long count(int[] a) {
        return sort(a, 0, a.length - 1);
    }

    private static long sort(int[] a, int left, int right) {
        if (left >= right) {
            return 0;
        }

        int mid = left + (right - left) / 2;
        long total = sort(a, left, mid) + sort(a, mid + 1, right);

        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;

        while (i <= mid && j <= right) {
            if (a[i] <= a[j]) {
                temp[k++] = a[i++];
            } else {
                // Every remaining left-half value is greater than a[j].
                total += mid - i + 1;
                temp[k++] = a[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = a[i++];
        }
        while (j <= right) {
            temp[k++] = a[j++];
        }

        // Copy the merged, sorted range back into the original array.
        for (int x = 0; x < temp.length; x++) {
            a[left + x] = temp[x];
        }

        return total;
    }
}
