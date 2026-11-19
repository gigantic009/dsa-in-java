/** LeetCode 153: find the minimum in a rotated sorted array.
 * Time: O(log n), Space: O(1). */
public class RotatedArrayMinimum {
    static int findMin(int[] nums) {
        int low = 0, high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;
            // If mid is greater than high, the rotation pivot is to the right.
            if (nums[mid] > nums[high]) low = mid + 1;
            else high = mid;                       // Minimum may be mid itself.
        }
        return nums[low];                           // Range converges on minimum.
    }
    public static void main(String[] args) {
        System.out.println(findMin(new int[]{3,4,5,1,2})); // Prints 1.
    }
}