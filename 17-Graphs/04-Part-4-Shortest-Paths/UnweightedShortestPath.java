// BFS shortest distances in an unweighted graph. Unreachable vertices remain -1.
// Time O(V+E); space O(V).
import java.util.*;
public class UnweightedShortestPath {
 static int[]dist(List<List<Integer>>g,int s){if(s<0||s>=g.size())throw new IllegalArgumentException("Invalid source");int[]d=new int[g.size()];Arrays.fill(d,-1);Queue<Integer>q=new ArrayDeque<>();d[s]=0;q.add(s);while(!q.isEmpty()){int u=q.remove();for(int v:g.get(u))if(d[v]==-1){d[v]=d[u]+1;q.add(v);}}return d;}
 public static void main(String[]args){List<List<Integer>>g=new ArrayList<>();for(int i=0;i<5;i++)g.add(new ArrayList<>());g.get(0).add(1);g.get(1).add(0);g.get(1).add(2);g.get(2).add(1);g.get(3).add(4);g.get(4).add(3);System.out.println(Arrays.toString(dist(g,0));}
}