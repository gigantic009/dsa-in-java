/**
 * Search Insert Position (LeetCode 35)
 * Return the target index, or its insertion position.
 * Example: [1, 3, 5, 6], target=2 -> 1
 * Time: O(log n) | Space: O(1)
 */
public class SearchInsertPosition {
    static int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length;

        // Lower-bound binary search.
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 2));
    }
}