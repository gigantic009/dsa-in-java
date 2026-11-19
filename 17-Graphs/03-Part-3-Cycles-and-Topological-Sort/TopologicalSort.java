// Kahn's algorithm: topologically order a directed acyclic graph.
import java.util.*;
public class TopologicalSort {
 public static List<Integer> sort(int n,int[][]edges){List<List<Integer>>g=new ArrayList<>();int[]indegree=new int[n];for(int i=0;i<n;i++)g.add(new ArrayList<>());
  for(int[]e:edges){g.get(e[0]).add(e[1]);indegree[e[1]]++;}Queue<Integer>q=new ArrayDeque<>();for(int i=0;i<n;i++)if(indegree[i]==0)q.add(i);List<Integer>order=new ArrayList<>();
  while(!q.isEmpty()){int u=q.remove();order.add(u);for(int v:g.get(u))if(--indegree[v]==0)q.add(v);} // A vertex becomes ready once all prerequisites are removed.
  if(order.size()!=n)throw new IllegalArgumentException("Cycle detected");return order;
 }
}