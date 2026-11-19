// EDUCATIONAL NOTES:
// This is a lower-bound search over [low, high), a half-open interval.
// Values before low are smaller than target; values at/after high are
// candidates. The converged low is the first index >= target, or array length.

/** LeetCode 35: return target's index, or its insertion position.
 * Time: O(log n), Space: O(1). */
public class SearchInsertPosition {
    static int searchInsert(int[] nums, int target) {
        int low = 0;                    // First possible insertion position.
        int high = nums.length;          // Exclusive upper bound.

        while (low < high) {
            int mid = low + (high - low) / 2; // Inspect the midpoint.
            if (nums[mid] < target) {
                low = mid + 1;           // Move past values smaller than target.
            } else {
                high = mid;              // Keep mid: it may be the answer.
            }
        }
        return low;                       // First index whose value is >= target.
    }
    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 2)); // Prints 1.
    }
}