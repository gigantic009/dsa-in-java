// 0/1 knapsack: each item can be selected at most once.
public class ZeroOneKnapsack {
    public static int maxValue(int[] weights, int[] values, int capacity) {
        if (weights == null || values == null || weights.length != values.length || capacity < 0) {
            throw new IllegalArgumentException("Invalid input");
        }
        for (int weight : weights) {
            if (weight < 0) throw new IllegalArgumentException("Weights must be non-negative");
        }

        int[] dp = new int[capacity + 1];
        for (int i = 0; i < weights.length; i++) {
            for (int c = capacity; c >= weights[i]; c--) {
                dp[c] = Math.max(dp[c], Math.addExact(values[i], dp[c - weights[i]]));
            }
        }
        return dp[capacity];
    }
}