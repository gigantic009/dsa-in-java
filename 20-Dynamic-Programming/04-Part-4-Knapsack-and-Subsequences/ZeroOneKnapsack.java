// 0/1 knapsack: each item can be selected at most once.
public class ZeroOneKnapsack {
 public static int maxValue(int[]w,int[]v,int capacity){int[]dp=new int[capacity+1];
  for(int i=0;i<w.length;i++)for(int c=capacity;c>=w[i];c--)dp[c]=Math.max(dp[c],v[i]+dp[c-w[i]]); // Descending capacity prevents reusing item.
  return dp[capacity];}
}