// Recursively generate subsets by making include/exclude choices.
import java.util.*;
public class SubsetGeneration {
 public static List<List<Integer>>generate(int[]a){List<List<Integer>>out=new ArrayList<>();walk(a,0,new ArrayList<>(),out);return out;}
 private static void walk(int[]a,int i,List<Integer>path,List<List<Integer>>out){if(i==a.length){out.add(new ArrayList<>(path));return;}walk(a,i+1,path,out);path.add(a[i]);walk(a,i+1,path,out);path.remove(path.size()-1); // Undo inclusion before returning to caller.
 }
}