import java.util.ArrayList;
import java.util.List;

/**
 * Generates permutations of an array.
 * LeetCode 46: Permutations (the standard problem assumes distinct values).
 */
public class Permutations {

    public static List<List<Integer>> generate(int[] values) {
        if (values == null) {
            throw new IllegalArgumentException("Input array must not be null.");
        }

        List<List<Integer>> result = new ArrayList<>();
        build(values, new boolean[values.length], new ArrayList<>(), result);
        return result;
    }

    private static void build(int[] values, boolean[] used,
                              List<Integer> path, List<List<Integer>> result) {
        if (path.size() == values.length) {
            result.add(new ArrayList<>(path)); // Save a copy, not the mutable path.
            return;
        }

        for (int i = 0; i < values.length; i++) {
            if (!used[i]) {
                used[i] = true;
                path.add(values[i]);

                build(values, used, path, result);

                path.remove(path.size() - 1); // Undo the choice.
                used[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(generate(new int[]{1, 2, 3}));
    }
}
