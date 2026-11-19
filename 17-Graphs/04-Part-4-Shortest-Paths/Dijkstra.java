// Dijkstra shortest paths for nonnegative edge weights.
import java.util.*;
public class Dijkstra {
 static class Edge{int to,weight;Edge(int t,int w){to=t;weight=w;}}
 public static int[] distances(List<List<Edge>>g,int src){int n=g.size();int[]d=new int[n];Arrays.fill(d,Integer.MAX_VALUE);d[src]=0;PriorityQueue<int[]>pq=new PriorityQueue<>(Comparator.comparingInt(a->a[1]));pq.add(new int[]{src,0});
  while(!pq.isEmpty()){int[]cur=pq.remove();int u=cur[0],dist=cur[1];if(dist!=d[u])continue; // Ignore outdated heap entries.
   for(Edge e:g.get(u))if(dist+e.weight<d[e.to]){d[e.to]=dist+e.weight;pq.add(new int[]{e.to,d[e.to]});}
  }return d;
 }
}