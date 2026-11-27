import java.util.Arrays;

/** Assigns at most one cookie to each child, maximizing satisfied children. */
public class AssignCookies {
    // Time: O(n log n + m log m); auxiliary space: O(n + m) for sorted copies.
    public static int count(int[] greed, int[] cookies) {
        if (greed == null || cookies == null) {
            throw new IllegalArgumentException("Arrays cannot be null.");
        }

        int[] sortedGreed = greed.clone();
        int[] sortedCookies = cookies.clone();

        for (int value : sortedGreed) {
            if (value < 0) {
                throw new IllegalArgumentException("Greed must be nonnegative.");
            }
        }
        for (int value : sortedCookies) {
            if (value < 0) {
                throw new IllegalArgumentException("Cookie size must be nonnegative.");
            }
        }

        Arrays.sort(sortedGreed);
        Arrays.sort(sortedCookies);

        int child = 0;
        int cookie = 0;

        while (child < sortedGreed.length && cookie < sortedCookies.length) {
            if (sortedCookies[cookie] >= sortedGreed[child]) {
                child++;
            }
            cookie++;
        }

        return child;
    }

    public static void main(String[] args) {
        System.out.println(count(new int[]{1, 2, 3}, new int[]{1, 1})); // 1
    }
}
