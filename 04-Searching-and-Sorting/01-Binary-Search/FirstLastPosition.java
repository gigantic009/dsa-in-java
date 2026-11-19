/** LeetCode 34: find first and last occurrences of a target.
 * Two binary searches; Time O(log n), Space O(1). */
import java.util.Arrays;
public class FirstLastPosition {
    // 'first' controls whether we keep searching left or right after a match.
    static int boundary(int[] nums, int target, boolean first) {
        int low = 0, high = nums.length - 1;
        int answer = -1;                    // -1 means no match has been found.

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                answer = mid;                // Record this match.
                if (first) high = mid - 1;   // Search earlier indices for first match.
                else low = mid + 1;           // Search later indices for last match.
            } else if (nums[mid] < target) {
                low = mid + 1;                // Target must be to the right.
            } else {
                high = mid - 1;               // Target must be to the left.
            }
        }
        return answer;
    }

    static int[] searchRange(int[] nums, int target) {
        return new int[]{boundary(nums, target, true), boundary(nums, target, false)};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(searchRange(new int[]{5,7,7,8,8,10}, 8)));
    }
}