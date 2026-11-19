// Backtracking finds subsets whose values sum to the target.
import java.util.*;

public class SubsetSum {
    public static List<List<Integer>> find(int[] a, int target) {
        List<List<Integer>> out = new ArrayList<>();
        walk(a, 0, target, new ArrayList<>(), out);
        return out;
    }

    private static void walk(int[] a, int i, int remaining,
                             List<Integer> path, List<List<Integer>> out) {
        if (i == a.length) {
            if (remaining == 0) out.add(new ArrayList<>(path));
            return;
        }

        walk(a, i + 1, remaining, path, out);

        path.add(a[i]);
        walk(a, i + 1, remaining - a[i], path, out);
        path.remove(path.size() - 1);
    }
}