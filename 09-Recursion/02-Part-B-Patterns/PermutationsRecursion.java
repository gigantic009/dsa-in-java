// Recursion builds permutations by swapping each candidate into position index.
import java.util.ArrayList;
import java.util.List;

public class PermutationsRecursion {
    public static List<List<Integer>> generate(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        permute(nums, 0, result);
        return result;
    }

    private static void permute(int[] nums, int index, List<List<Integer>> result) {
        if (index == nums.length) {
            List<Integer> permutation = new ArrayList<>();
            for (int value : nums) {
                permutation.add(value);
            }
            result.add(permutation);
            return;
        }

        for (int choice = index; choice < nums.length; choice++) {
            swap(nums, index, choice); // Fix one candidate at the current position.
            permute(nums, index + 1, result);
            swap(nums, index, choice); // Undo the swap to explore the next candidate.
        }
    }

    private static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}