import java.util.Arrays;

/** Assigns at most one cookie to each child, maximizing satisfied children. */
public class AssignCookies {
    public static int count(int[] greed, int[] cookies) {
        if (greed == null || cookies == null) throw new IllegalArgumentException("Arrays cannot be null");
        int[] g = greed.clone(), s = cookies.clone();
        for (int value : g) if (value < 0) throw new IllegalArgumentException("Greed must be nonnegative");
        for (int value : s) if (value < 0) throw new IllegalArgumentException("Cookie size must be nonnegative");
        Arrays.sort(g);
        Arrays.sort(s);
        int child = 0, cookie = 0;
        while (child < g.length && cookie < s.length) {
            if (s[cookie] >= g[child]) child++; // Satisfy the least demanding child first.
            cookie++;
        }
        return child;
    }

    public static void main(String[] args) {
        System.out.println(count(new int[]{1, 2, 3}, new int[]{1, 1})); // 1
    }
}