// Maximize sum without choosing adjacent houses.
public class HouseRobber {
 public static int max(int[]a){int prev2=0,prev1=0;for(int x:a){int current=Math.max(prev1,prev2+x);prev2=prev1;prev1=current;}return prev1;}
}