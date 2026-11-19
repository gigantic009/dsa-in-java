// Backtracking finds subsets whose values sum to target.
import java.util.*;
public class SubsetSum {
 public static List<List<Integer>>find(int[]a,int target){List<List<Integer>>out=new ArrayList<>();walk(a,0,target,new ArrayList<>(),out);return out;}
 private static void walk(int[]a,int i,int rem,List<Integer>path,List<List<Integer>>out){if(rem==0){out.add(new ArrayList<>(path));return;}if(i==a.length)return;walk(a,i+1,rem,path,out);path.add(a[i]);walk(a,i+1,rem-a[i],path,out);path.remove(path.size()-1); // Restore path after choosing this value.
 }
}