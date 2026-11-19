/** Selection sort: repeatedly select the minimum. Time O(n^2), space O(1). */
import java.util.Arrays;
public class SelectionSort {
    static void sort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < nums.length; j++)
                if (nums[j] < nums[minIndex]) minIndex = j;
            int temp = nums[i]; nums[i] = nums[minIndex]; nums[minIndex] = temp;
        }
    }
    public static void main(String[] args) {
        int[] nums = {4, 2, 5, 1}; sort(nums); System.out.println(Arrays.toString(nums));
    }
}