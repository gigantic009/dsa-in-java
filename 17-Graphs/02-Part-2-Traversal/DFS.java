// Depth-first search recursively explores a branch before backtracking.
import java.util.*;
public class DFS {
 public static List<Integer> traverse(List<List<Integer>>g,int start){List<Integer>out=new ArrayList<>();boolean[]seen=new boolean[g.size()];visit(g,start,seen,out);return out;}
 private static void visit(List<List<Integer>>g,int u,boolean[]seen,List<Integer>out){seen[u]=true;out.add(u);for(int v:g.get(u))if(!seen[v])visit(g,v,seen,out); // Skip visited nodes to prevent cycles.
 }
}