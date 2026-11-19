/*
 * Problem: Find the maximum profit from at most two buy-and-sell transactions.
 * LeetCode: #123
 * Time: O(n) | Auxiliary space: O(n)
 */
import java.util.Scanner;

class LeetCode123BestTimeToBuyAndSellStockIII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = scanner.nextInt();
        }

        /*
         * bestLeft[i] represents the best profit from one transaction ending
         * on or before i. Track the minimum buy price while scanning forward.
         */
        long[] bestLeft = new long[n];
        long[] bestRight = new long[n];
        long minimumPrice = Long.MAX_VALUE;
        long bestProfit = 0;
        for (int i = 0; i < n; i++) {
            minimumPrice = Math.min(minimumPrice, prices[i]);
            bestProfit = Math.max(bestProfit, prices[i] - minimumPrice);
            bestLeft[i] = bestProfit;
        }

        /*
         * bestRight[i] represents the best single transaction starting at or after i.
         * Scan backward, tracking the highest future selling price.
         */
        long maximumPrice = Long.MIN_VALUE;
        bestProfit = 0;
        for (int i = n - 1; i >= 0; i--) {
            maximumPrice = Math.max(maximumPrice, prices[i]);
            bestProfit = Math.max(bestProfit, maximumPrice - prices[i]);
            bestRight[i] = bestProfit;
        }

        /*
         * Split the timeline at each index: combine a transaction on the left
         * with one on the right. A profit of zero allows either transaction to be skipped.
         */
        long answer = 0;
        for (int i = 0; i < n; i++) {
            answer = Math.max(answer, bestLeft[i] + bestRight[i]);
        }
        System.out.println(answer);
        scanner.close();
    }
}
