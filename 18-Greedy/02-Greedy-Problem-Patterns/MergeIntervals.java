// Merge overlapping intervals; input arrays are sorted in-place.
// Time O(n log n); output space O(n).
import java.util.*;
public class MergeIntervals {
 static int[][]merge(int[][]a){if(a==null)throw new IllegalArgumentException();if(a.length==0)return new int[0][2];Arrays.sort(a,Comparator.comparingInt(x->x[0]));List<int[]>out=new ArrayList<>();int[]cur=a[0].clone();for(int i=1;i<a.length;i++){if(a[i][0]<=cur[1])cur[1]=Math.max(cur[1],a[i][1]);else{out.add(cur);cur=a[i].clone();}}out.add(cur);return out.toArray(new int[out.size()][]);}
 public static void main(String[]args){System.out.println(Arrays.deepToString(merge(new int[][]{{1,3},{2,6},{8,10},{15,18}})));}
}