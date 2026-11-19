// Check whether an integer array is sorted in nondecreasing order.
// Time: O(n); Space: O(n) recursion depth.
public class ArraySortedRecursion {
    public static boolean isSorted(int[] a) {
        if (a == null) throw new IllegalArgumentException("Array must not be null");
        return check(a, 1);
    }
    private static boolean check(int[] a, int i) {
        if (i >= a.length) return true;
        if (a[i] < a[i - 1]) return false;
        return check(a, i + 1);
    }
    public static void main(String[] args) {
        int[] sample = {1, 2, 2, 5, 9};
        System.out.println("Sorted: " + isSorted(sample));
    }
}