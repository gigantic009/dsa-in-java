// Detect an undirected graph cycle with DFS parent tracking.
import java.util.*;
public class CycleDetectionUndirected {
 public static boolean hasCycle(List<List<Integer>>g){boolean[]seen=new boolean[g.size()];for(int i=0;i<g.size();i++)if(!seen[i]&&dfs(g,i,-1,seen))return true;return false;}
 private static boolean dfs(List<List<Integer>>g,int u,int parent,boolean[]seen){seen[u]=true;for(int v:g.get(u)){if(!seen[v]){if(dfs(g,v,u,seen))return true;}else if(v!=parent)return true;}return false;}
}