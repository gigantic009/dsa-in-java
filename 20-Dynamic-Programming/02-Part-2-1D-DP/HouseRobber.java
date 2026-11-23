/** LeetCode 198: maximize loot without robbing adjacent houses. */
public class HouseRobber {
    public static int max(int[] houses) {
        if (houses == null) {
            throw new IllegalArgumentException("Input must not be null.");
        }

        int previousTwo = 0;
        int previousOne = 0;

        for (int value : houses) {
            int current = Math.max(previousOne, Math.addExact(previousTwo, value));
            previousTwo = previousOne;
            previousOne = current;
        }

        return previousOne;
    }

    public static void main(String[] args) {
        System.out.println(max(new int[]{2, 7, 9, 3, 1})); // 12
    }
}
