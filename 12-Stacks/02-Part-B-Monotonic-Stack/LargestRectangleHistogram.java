// Largest rectangle area in a histogram using a monotonic stack.
import java.util.*;
public class LargestRectangleHistogram {
 public static int largest(int[] h){
  Stack<Integer> s=new Stack<>();int best=0;
  for(int i=0;i<=h.length;i++){
   int height=i==h.length?0:h[i]; // Sentinel height flushes remaining bars.
   while(!s.empty()&&h[s.peek()]>height){
    int bar=h[s.pop()];int left=s.empty()?0:s.peek()+1; // Stack top is previous smaller bar.
    best=Math.max(best,bar*(i-left)); // Width extends to current smaller bar.
   }
   s.push(i);
  }return best;
 }
}