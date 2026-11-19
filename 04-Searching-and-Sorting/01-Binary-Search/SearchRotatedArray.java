/**
 * Search in Rotated Sorted Array (LeetCode 33)
 * Example: [4,5,6,7,0,1,2], target=0 -> 4
 * At each step, determine which half is sorted.
 * Time: O(log n) | Space: O(1)
 */
public class SearchRotatedArray {
    static int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) return mid;

            if (nums[low] <= nums[mid]) {
                if (nums[low] <= target && target < nums[mid])
                    high = mid - 1;
                else low = mid + 1;
            } else {
                if (nums[mid] < target && target <= nums[high])
                    low = mid + 1;
                else high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(search(new int[]{4,5,6,7,0,1,2}, 0));
    }
}