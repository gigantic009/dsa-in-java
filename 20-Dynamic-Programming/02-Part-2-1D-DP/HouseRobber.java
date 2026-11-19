// Maximize the sum without choosing two adjacent houses.
public class HouseRobber {
    public static int max(int[] arr) {
        int prev2 = 0;
        int prev1 = 0;

        for (int value : arr) {
            int current = Math.max(prev1, prev2 + value);
            prev2 = prev1;
            prev1 = current;
        }

        return prev1;
    }
}
