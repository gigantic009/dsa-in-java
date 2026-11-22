import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Greedy coin selection. This strategy is optimal only for certain coin systems.
 * It may fail to find a minimum coin count for arbitrary denominations.
 */
public class MinimumCoins {
    public static List<Integer> choose(int amount, int[] denominations) {
        if (amount < 0 || denominations == null) {
            throw new IllegalArgumentException("Invalid input");
        }

        int[] coins = denominations.clone();
        for (int coin : coins) {
            if (coin <= 0) {
                throw new IllegalArgumentException("Coins must be positive");
            }
        }

        Arrays.sort(coins);
        List<Integer> chosen = new ArrayList<>();

        for (int i = coins.length - 1; i >= 0; i--) {
            while (amount >= coins[i]) {
                amount -= coins[i];
                chosen.add(coins[i]);
            }
        }

        if (amount != 0) {
            throw new IllegalArgumentException(
                    "Amount cannot be represented by greedy choices");
        }

        return chosen;
    }

    public static void main(String[] args) {
        System.out.println(choose(27, new int[]{1, 5, 10, 25}));
    }
}
