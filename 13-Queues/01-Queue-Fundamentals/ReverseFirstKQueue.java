// Reverse the first k elements while preserving the remaining order.
import java.util.*;
public class ReverseFirstKQueue {
 public static void reverse(Queue<Integer> q,int k){
  if(k<0||k>q.size())throw new IllegalArgumentException("Invalid k");
  Stack<Integer> s=new Stack<>();
  for(int i=0;i<k;i++)s.push(q.remove()); // Extract the selected prefix.
  while(!s.empty())q.add(s.pop()); // Reinsert prefix in reversed order.
  for(int i=0;i<q.size()-k;i++)q.add(q.remove()); // Rotate suffix back behind prefix.
 }
}