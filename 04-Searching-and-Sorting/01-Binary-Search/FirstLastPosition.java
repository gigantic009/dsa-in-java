/**
 * Find First and Last Position (LeetCode 34)
 * Return [first, last] for target, or [-1, -1].
 * Example: [5, 7, 7, 8, 8, 10], target=8 -> [3, 4]
 * Time: O(log n) | Space: O(1)
 */
import java.util.Arrays;

public class FirstLastPosition {
    private static int findBound(int[] nums, int target, boolean first) {
        int low = 0;
        int high = nums.length - 1;
        int answer = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                answer = mid;
                if (first) high = mid - 1;
                else low = mid + 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return answer;
    }

    static int[] searchRange(int[] nums, int target) {
        return new int[]{findBound(nums, target, true),
                         findBound(nums, target, false)};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(
            searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8)));
    }
}