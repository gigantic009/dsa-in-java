// Recursively generate subsets by making include/exclude choices.
import java.util.ArrayList;
import java.util.List;

public class SubsetGeneration {
    public static List<List<Integer>> generate(int[] nums) {
        if (nums == null) {
            throw new IllegalArgumentException("Input array must not be null.");
        }
        List<List<Integer>> result = new ArrayList<>();
        walk(nums, 0, new ArrayList<>(), result);
        return result;
    }

    private static void walk(int[] nums, int index, List<Integer> path,
                             List<List<Integer>> result) {
        if (index == nums.length) {
            result.add(new ArrayList<>(path)); // Save a copy, not the changing path.
            return;
        }

        walk(nums, index + 1, path, result); // Choice 1: exclude current element.
        path.add(nums[index]);
        walk(nums, index + 1, path, result); // Choice 2: include current element.
        path.remove(path.size() - 1); // Backtrack to restore the previous state.
    }
}