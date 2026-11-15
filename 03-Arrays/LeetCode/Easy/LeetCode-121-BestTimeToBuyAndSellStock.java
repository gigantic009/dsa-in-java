/*
 * Problem: Find the maximum profit from one stock purchase and one later sale.
 * LeetCode: #121
 * Companies: Amazon, D-E-Shaw, Directi, Flipkart, Goldman Sachs, Intuit, MakeMyTrip, Microsoft
 * Time Complexity: O(n)
 * Space Complexity: O(1), excluding the input array.
 */

import java.util.Scanner;

public class LeetCode121BestTimeToBuyAndSellStock {
    public static long maxProfit(int[] prices) {
        if (prices.length < 2) {
            return 0;
        }
        int minimumPrice = prices[0];
        long maximumProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            long currentProfit = (long) prices[i] - minimumPrice;
            if (currentProfit > maximumProfit) {
                maximumProfit = currentProfit;
            }
            if (prices[i] < minimumPrice) {
                minimumPrice = prices[i];
            }
        }
        return maximumProfit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }
        System.out.println(maxProfit(prices));
        sc.close();
    }
}
