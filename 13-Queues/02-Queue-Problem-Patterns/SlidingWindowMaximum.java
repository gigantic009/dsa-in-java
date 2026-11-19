// Maximum value in every window of size k using a deque of indices.
import java.util.*;
public class SlidingWindowMaximum {
 public static int[] max(int[] a,int k){
  if(k<=0||k>a.length)throw new IllegalArgumentException("Invalid window");
  int[] result=new int[a.length-k+1];Deque<Integer>d=new ArrayDeque<>();
  for(int i=0;i<a.length;i++){
   while(!d.isEmpty()&&d.peekFirst()<=i-k)d.removeFirst(); // Remove expired indices.
   while(!d.isEmpty()&&a[d.peekLast()]<=a[i])d.removeLast(); // Keep candidates decreasing.
   d.addLast(i);
   if(i>=k-1)result[i-k+1]=a[d.peekFirst()]; // Front index holds current window maximum.
  }return result;
 }
}