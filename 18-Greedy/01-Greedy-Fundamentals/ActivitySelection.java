// Select the maximum number of non-overlapping activities.
import java.util.*;
public class ActivitySelection {
 public static int select(int[]start,int[]end){int n=start.length;int[][]a=new int[n][2];for(int i=0;i<n;i++){a[i][0]=start[i];a[i][1]=end[i];}Arrays.sort(a,Comparator.comparingInt(x->x[1]));int count=0,lastEnd=Integer.MIN_VALUE;
  for(int[]activity:a)if(activity[0]>=lastEnd){count++;lastEnd=activity[1];} // Earliest finish leaves room for later activities.
  return count;
 }
}