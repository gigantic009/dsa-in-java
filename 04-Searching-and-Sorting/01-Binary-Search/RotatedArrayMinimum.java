/** LeetCode 153: find the minimum in a rotated sorted array.
 * Time: O(log n), Space: O(1). */
public class RotatedArrayMinimum {
    static int findMin(int[] nums) {
        if (nums == null || nums.length == 0) throw new IllegalArgumentException("Array must be nonempty");
        int low = 0, high = nums.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] > nums[high]) low = mid + 1;
            else high = mid;
        }
        return nums[low];
    }
    public static void main(String[] args) {
        System.out.println(findMin(new int[]{3,4,5,1,2}));
    }
}