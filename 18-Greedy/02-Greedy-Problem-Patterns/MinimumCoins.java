// Greedy coin selection for canonical coin systems (not all systems).
import java.util.*;
public class MinimumCoins {
 public static List<Integer>choose(int amount,int[]coins){Arrays.sort(coins);List<Integer>out=new ArrayList<>();for(int i=coins.length-1;i>=0;i--)while(amount>=coins[i]){amount-=coins[i];out.add(coins[i]);}if(amount!=0)throw new IllegalArgumentException("Not representable by greedy selection");return out;}
}