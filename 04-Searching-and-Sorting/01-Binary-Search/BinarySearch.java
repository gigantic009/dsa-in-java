// EDUCATIONAL NOTES:
// The array must be sorted in ascending order. Each comparison eliminates
// roughly half of the remaining candidates. low/high describe the inclusive
// search interval; the loop ends when that interval becomes empty.

/** Binary Search (LeetCode 704): find a target in a sorted array.
 * Time: O(log n), Space: O(1). */
public class BinarySearch {
    static int search(int[] nums, int target) {
        int low = 0;                         // Left edge of the current search range.
        int high = nums.length - 1;           // Right edge of the current search range.

        while (low <= high) {                 // Continue while the range is not empty.
            int mid = low + (high - low) / 2; // Middle index; avoids potential overflow.
            if (nums[mid] == target) return mid; // Found: return its index.

            if (nums[mid] < target) {
                low = mid + 1;                // Target can only be in the right half.
            } else {
                high = mid - 1;               // Target can only be in the left half.
            }
        }
        return -1;                             // Target wasn't present.
    }
    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        System.out.println(search(nums, 9));   // Example: prints 4.
        System.out.println(search(nums, 2));   // Example: prints -1.
    }
}