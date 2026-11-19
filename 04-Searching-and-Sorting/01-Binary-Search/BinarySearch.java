/**
 * Binary Search (LeetCode 704)
 * Find target in a sorted array, returning its index or -1.
 *
 * Example: [-1, 0, 3, 5, 9, 12], target=9 -> 4
 *
 * Approach: Halve the candidate interval after each comparison.
 * Time: O(log n) | Space: O(1)
 */
public class BinarySearch {
    static int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        System.out.println(search(nums, 9)); // 4
        System.out.println(search(nums, 2)); // -1
    }
}