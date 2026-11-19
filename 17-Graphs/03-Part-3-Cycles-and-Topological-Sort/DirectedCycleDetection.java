// Directed cycle detection with DFS colors (0 unvisited, 1 active, 2 complete).
// Time O(V+E); space O(V).
import java.util.*;
public class DirectedCycleDetection {
 static boolean cycle(List<List<Integer>>g){int[]c=new int[g.size()];for(int i=0;i<c.length;i++)if(c[i]==0&&dfs(i,g,c))return true;return false;}
 static boolean dfs(int u,List<List<Integer>>g,int[]c){c[u]=1;for(int v:g.get(u)){if(c[v]==1)return true;if(c[v]==0&&dfs(v,g,c))return true;}c[u]=2;return false;}
 public static void main(String[]args){List<List<Integer>>g=new ArrayList<>();for(int i=0;i<3;i++)g.add(new ArrayList<>());g.get(0).add(1);g.get(1).add(2);g.get(2).add(0);System.out.println(cycle(g));}
}