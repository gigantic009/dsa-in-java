import java.util.Scanner;

public class BestTimeToBuyAndSellStock {
    public static long maxProfit(int[] prices) {
        int minPrice = prices[0];
        long bestProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            bestProfit = Math.max(bestProfit, (long) prices[i] - minPrice);
            minPrice = Math.min(minPrice, prices[i]);
        }
        return bestProfit;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] prices = new int[n];

        for (int i = 0; i < n; i++) prices[i] = scanner.nextInt();

        System.out.println(maxProfit(prices));
        scanner.close();
    }
}