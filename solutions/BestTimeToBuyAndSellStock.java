/**
 * Question:
 * Given daily stock prices, choose one day to buy and a later day to sell to maximise profit. Return 0 if no profit is possible.
 *
 * LeetCode: Not available (no exact problem number verified).
 *
 * Companies:
 * Amazon, D-E-Shaw, Directi, Flipkart, Goldman Sachs, Intuit, MakeMyTrip, Microsoft
 */
public class BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            int profit = prices[i] - minPrice;

            if (profit > maxProfit) {
                maxProfit = profit;
            }

            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }
}
