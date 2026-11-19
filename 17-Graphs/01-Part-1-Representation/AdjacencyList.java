// Build an undirected graph adjacency list.
import java.util.*;
public class AdjacencyList {
 public static List<List<Integer>> build(int n,int[][]edges){List<List<Integer>>g=new ArrayList<>();for(int i=0;i<n;i++)g.add(new ArrayList<>());
  for(int[]e:edges){g.get(e[0]).add(e[1]);g.get(e[1]).add(e[0]);} // Store each edge at both endpoints.
  return g;
 }
}