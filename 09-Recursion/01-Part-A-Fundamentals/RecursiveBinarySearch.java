// Recursive binary search. Input must be sorted in ascending order.
// Time: O(log n); Space: O(log n) recursion depth.
public class RecursiveBinarySearch {
    public static int search(int[] a, int target) {
        if (a == null) {
            throw new IllegalArgumentException("Array must not be null");
        }

        return search(a, target, 0, a.length - 1);
    }

    private static int search(int[] a, int target, int low, int high) {
        if (low > high) {
            return -1;
        }

        int mid = low + (high - low) / 2;

        if (a[mid] == target) {
            return mid;
        }

        if (a[mid] < target) {
            return search(a, target, mid + 1, high);
        }

        return search(a, target, low, mid - 1);
    }

    public static void main(String[] args) {
        int[] sample = {-4, 0, 3, 8, 12, 17};
        System.out.println("Index: " + search(sample, 8));
    }
}
