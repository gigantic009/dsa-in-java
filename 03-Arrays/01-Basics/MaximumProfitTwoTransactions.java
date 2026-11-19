/*
 * Problem: Find the maximum profit from at most two buy-and-sell transactions.
 * LeetCode: #123
 * Time: O(n) | Auxiliary space: O(n)
 */
import java.util.Scanner;

public class MaximumProfitTwoTransactions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n < 0) {
            System.out.println("Price count must be non-negative");
            scanner.close();
            return;
        }
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = scanner.nextInt();
        }
        long[] bestLeft = new long[n];
        long[] bestRight = new long[n];

        // bestLeft[i] stores the best single-transaction profit ending on or before i.
        long minimumPrice = Long.MAX_VALUE;
        long bestProfit = 0;
        for (int i = 0; i < n; i++) {
            minimumPrice = Math.min(minimumPrice, prices[i]);
            bestProfit = Math.max(bestProfit, prices[i] - minimumPrice);
            bestLeft[i] = bestProfit;
        }

        // bestRight[i] stores the best single-transaction profit starting on or after i.
        long maximumPrice = Long.MIN_VALUE;
        bestProfit = 0;
        for (int i = n - 1; i >= 0; i--) {
            maximumPrice = Math.max(maximumPrice, prices[i]);
            bestProfit = Math.max(bestProfit, maximumPrice - prices[i]);
            bestRight[i] = bestProfit;
        }

        // Try every split: one transaction on the left, another on the right.
        // A zero profit is allowed, so the result also covers fewer than two trades.
        long answer = 0;
        for (int i = 0; i < n; i++) {
            answer = Math.max(answer, bestLeft[i] + bestRight[i]);
        }
        System.out.println(answer);
        scanner.close();
    }
}
