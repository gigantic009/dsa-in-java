/** 0/1 knapsack: every item can be selected at most once. */
public class ZeroOneKnapsack {
    public static int maxValue(int[] weights, int[] values, int capacity) {
        if (weights == null || values == null
                || weights.length != values.length || capacity < 0) {
            throw new IllegalArgumentException("Invalid input.");
        }

        for (int weight : weights) {
            if (weight < 0) {
                throw new IllegalArgumentException("Negative weight.");
            }
        }

        int[] dp = new int[capacity + 1];

        // Process each item once. Descending capacities prevent reusing it.
        for (int item = 0; item < weights.length; item++) {
            int weight = weights[item];
            int value = values[item];

            for (int currentCapacity = capacity;
                    currentCapacity >= weight; currentCapacity--) {
                int valueWithItem = Math.addExact(
                        value, dp[currentCapacity - weight]);

                dp[currentCapacity] = Math.max(
                        dp[currentCapacity], valueWithItem);
            }
        }

        return dp[capacity];
    }

    public static void main(String[] args) {
        int[] weights = {1, 3, 4, 5};
        int[] values = {1, 4, 5, 7};
        System.out.println(maxValue(weights, values, 7)); // 9
    }
}
