// Kahn's algorithm; empty result indicates a cycle.
// Time O(V+E); space O(V).
import java.util.*;
public class KahnTopologicalSort {
 static List<Integer>sort(List<List<Integer>>g){int n=g.size();int[]in=new int[n];for(List<Integer>e:g)for(int v:e)in[v]++;Queue<Integer>q=new ArrayDeque<>();for(int i=0;i<n;i++)if(in[i]==0)q.add(i);List<Integer>o=new ArrayList<>();while(!q.isEmpty()){int u=q.remove();o.add(u);for(int v:g.get(u))if(--in[v]==0)q.add(v);}return o.size()==n?o:Collections.emptyList();}
 public static void main(String[]args){List<List<Integer>>g=new ArrayList<>();for(int i=0;i<4;i++)g.add(new ArrayList<>());g.get(0).add(1);g.get(0).add(2);g.get(1).add(3);g.get(2).add(3);System.out.println(sort(g));}
}