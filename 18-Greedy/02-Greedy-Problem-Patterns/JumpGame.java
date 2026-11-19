// Greedy reachability: track the farthest index reachable so far.
public class JumpGame {
 public static boolean canReach(int[]a){int farthest=0;for(int i=0;i<a.length;i++){if(i>farthest)return false;farthest=Math.max(farthest,i+a[i]); // Update reach using this position's jump.
  }return true;}
}