/*
 * Problem: Given daily stock prices, find the maximum profit from one buy followed by one sell.
 * LeetCode: #121
 * Companies: Amazon, D-E-Shaw, Directi, Flipkart, Goldman Sachs, Intuit, MakeMyTrip, Microsoft
 * Time: O(n) | Auxiliary space: O(1)
 */
import java.util.Scanner;
public class BestTimeToBuyAndSellStock {
 public static long maxProfit(int[] prices){if(prices.length<2)return 0;int min=prices[0];long best=0;for(int i=1;i<prices.length;i++){best=Math.max(best,(long)prices[i]-min);min=Math.min(min,prices[i]);}return best;}
 public static void main(String[] args){Scanner sc=new Scanner(System.in);int n=sc.nextInt();int[] p=new int[n];for(int i=0;i<n;i++)p[i]=sc.nextInt();System.out.println(maxProfit(p));}
}