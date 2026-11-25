// EDUCATIONAL NOTES:
// At least one side of the midpoint is sorted (assuming distinct values).
// Check whether target belongs to that sorted interval, then discard the other
// half. This preserves O(log n) time despite the rotation.

/**
 * LeetCode 33: search a rotated sorted array.
 * Time: O(log n), Space: O(1).
 */
public class SearchRotatedArray {
    static int search(int[] nums, int target) {
        if (nums == null) {
            throw new IllegalArgumentException("Array must not be null");
        }

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return mid; // Match found.
            }

            // One of the two halves must still be sorted.
            if (nums[low] <= nums[mid]) {
                // Target lies inside the sorted left half.
                if (nums[low] <= target && target < nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1; // Otherwise discard left half.
                }
            } else {
                // Right half is sorted; decide whether target lies there.
                if (nums[mid] < target && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return -1; // Target isn't in the array.
    }

    public static void main(String[] args) {
        System.out.println(search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));
    }
}
