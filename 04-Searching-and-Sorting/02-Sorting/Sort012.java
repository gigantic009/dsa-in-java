/**
 * Sort Colors (LeetCode 75): sort an array containing 0, 1 and 2.
 * Dutch National Flag algorithm.
 * Time: O(n) | Space: O(1)
 */
import java.util.Arrays;

public class Sort012 {
    static void sort(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;
        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low++, mid++);
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                swap(nums, mid, high--);
            }
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}