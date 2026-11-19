/**
 * Bubble Sort: repeatedly swap adjacent out-of-order values.
 * Example: [5,1,4,2] -> [1,2,4,5]
 * Time: O(n^2), best O(n) | Space: O(1)
 */
import java.util.Arrays;

public class BubbleSort {
    static void sort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            boolean swapped = false;
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        int[] nums = {5, 1, 4, 2};
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}