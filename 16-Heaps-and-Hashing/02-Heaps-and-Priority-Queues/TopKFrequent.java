// Return k most frequent values; tie order is unspecified.
// Time O(n log k), space O(n).
import java.util.*;
public class TopKFrequent {
 public static int[] topK(int[]a,int k){if(a==null||k<0)throw new IllegalArgumentException();Map<Integer,Integer>f=new HashMap<>();for(int x:a)f.merge(x,1,Integer::sum);if(k>f.size())throw new IllegalArgumentException("k exceeds distinct count");PriorityQueue<Integer>q=new PriorityQueue<>(Comparator.comparingInt(f::get));for(int x:f.keySet()){q.add(x);if(q.size()>k)q.poll();}int[]out=new int[k];for(int i=k-1;i>=0;i--)out[i]=q.poll();return out;}
 public static void main(String[]args){System.out.println(Arrays.toString(topK(new int[]{1,1,1,2,2,3},2)));}
}