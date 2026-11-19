import java.util.Arrays;
import java.util.Comparator;

/** Fractional knapsack: items can be split, so sort by value/weight ratio. */
public class FractionalKnapsack {
    static class Item {
        final double value, weight;
        Item(double value, double weight) {
            if (value < 0 || weight <= 0) throw new IllegalArgumentException("Invalid item");
            this.value = value; this.weight = weight;
        }
    }

    public static double maxValue(Item[] items, double capacity) {
        if (items == null || capacity < 0) throw new IllegalArgumentException("Invalid input");
        Item[] copy = items.clone();
        for (Item item : copy) if (item == null) throw new IllegalArgumentException("Item cannot be null");
        Arrays.sort(copy, Comparator.comparingDouble((Item item) -> item.value / item.weight).reversed());
        double total = 0;
        for (Item item : copy) {
            if (capacity == 0) break;
            double amount = Math.min(capacity, item.weight);
            total += amount * item.value / item.weight;
            capacity -= amount;
        }
        return total;
    }

    public static void main(String[] args) {
        Item[] items = {new Item(60, 10), new Item(100, 20), new Item(120, 30)};
        System.out.println(maxValue(items, 50)); // 240.0
    }
}