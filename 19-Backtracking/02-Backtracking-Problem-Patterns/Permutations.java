// Generate all permutations by choosing an unused element at each depth.
import java.util.*;
public class Permutations {
 public static List<List<Integer>>generate(int[]a){List<List<Integer>>out=new ArrayList<>();build(a,new boolean[a.length],new ArrayList<>(),out);return out;}
 private static void build(int[]a,boolean[]used,List<Integer>path,List<List<Integer>>out){if(path.size()==a.length){out.add(new ArrayList<>(path));return;}for(int i=0;i<a.length;i++)if(!used[i]){used[i]=true;path.add(a[i]);build(a,used,path,out);path.remove(path.size()-1);used[i]=false; // Backtrack both state changes after recursion.
  }}
}