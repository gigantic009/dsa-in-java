/** 0/1 knapsack: every item can be selected at most once. */
public class ZeroOneKnapsack {
    public static int maxValue(int[] weights, int[] values, int capacity) {
        if (weights == null || values == null || weights.length != values.length || capacity < 0)
            throw new IllegalArgumentException("Invalid input.");
        for (int w : weights) if (w < 0) throw new IllegalArgumentException("Negative weight.");
        int[] dp = new int[capacity + 1];
        // Descending capacities prevent reusing an item during this iteration.
        for (int i = 0; i < weights.length; i++)
            for (int c = capacity; c >= weights[i]; c--)
                dp[c] = Math.max(dp[c], Math.addExact(values[i], dp[c - weights[i]]));
        return dp[capacity];
    }
    public static void main(String[] args) {
        System.out.println(maxValue(new int[]{1,3,4,5}, new int[]{1,4,5,7}, 7)); // 9
    }
}