import java.util.ArrayList;
import java.util.List;

/**
 * Finds subsets whose sum equals the target.
 * This basic version treats each array position as a separate choice.
 */
public class SubsetSum {

    public static List<List<Integer>> find(int[] values, int target) {
        if (values == null) {
            throw new IllegalArgumentException("Input array must not be null.");
        }

        List<List<Integer>> result = new ArrayList<>();
        walk(values, 0, target, new ArrayList<>(), result);
        return result;
    }

    private static void walk(int[] values, int index, long remaining,
                             List<Integer> path, List<List<Integer>> result) {
        if (index == values.length) {
            if (remaining == 0) {
                result.add(new ArrayList<>(path));
            }
            return;
        }

        // Choice 1: skip the current value.
        walk(values, index + 1, remaining, path, result);

        // Choice 2: include it, then undo before returning.
        path.add(values[index]);
        walk(values, index + 1, remaining - values[index], path, result);
        path.remove(path.size() - 1);
    }

    public static void main(String[]args) {
        int[] values = {2, 3, 5};
        System.out.println(find(values, 5));
    }
}
