/** LeetCode 198: maximize loot without robbing adjacent houses. */
public class HouseRobber {
    public static int max(int[] houses) {
        if (houses == null) throw new IllegalArgumentException("Input must not be null.");
        int prev2 = 0, prev1 = 0;
        for (int value : houses) {
            int current = Math.max(prev1, Math.addExact(prev2, value));
            prev2 = prev1;
            prev1 = current;
        }
        return prev1;
    }
    public static void main(String[] args) { System.out.println(max(new int[]{2,7,9,3,1})); // 12
    }
}