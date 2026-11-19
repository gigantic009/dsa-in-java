// EDUCATIONAL NOTES:
// A rotation still contains two sorted portions. Comparing mid with high
// tells which portion contains the minimum. Keep mid when it may be the answer;
// otherwise discard the left portion. This implementation assumes no duplicates.

// LeetCode 153: Find the minimum in a rotated sorted array.
// Time: O(log n), Space: O(1).
public class RotatedArrayMinimum {
    static int findMin(int[] nums) {
        if (nums == null || nums.length == 0) throw new IllegalArgumentException("Array must be nonempty");

        int low = 0, high = nums.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;

            // If mid is bigger, the minimum is on its right.
            if (nums[mid] > nums[high]) low = mid + 1;
            // Otherwise, mid may be the minimum, so keep it.
            else high = mid;
        }
        return nums[low];
    }

    public static void main(String[] args) {
        System.out.println(findMin(new int[]{3, 4, 5, 1, 2}));
    }
}
