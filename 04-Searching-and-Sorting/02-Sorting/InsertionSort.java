/** Insertion sort: insert into sorted prefix. Time O(n^2), best O(n), space O(1). */
import java.util.Arrays;
public class InsertionSort {
    static void sort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int value = nums[i], j = i - 1;
            while (j >= 0 && nums[j] > value) { nums[j + 1] = nums[j]; j--; }
            nums[j + 1] = value;
        }
    }
    public static void main(String[] args) {
        int[] nums = {4, 3, 1}; sort(nums); System.out.println(Arrays.toString(nums));
    }
}