import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] arr) {
        Set<Integer> seen = new HashSet<>();

        for (int value : arr) {
            if (!seen.add(value)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1};
        System.out.println(containsDuplicate(arr));
    }
}
