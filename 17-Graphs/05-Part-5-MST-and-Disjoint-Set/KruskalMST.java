// Kruskal minimum spanning tree uses Union-Find to avoid cycles.
import java.util.*;
public class KruskalMST {
 public static int total(int n,int[][]edges){Arrays.sort(edges,Comparator.comparingInt(e->e[2]));UnionFind uf=new UnionFind(n);int sum=0,count=0;for(int[]e:edges)if(uf.union(e[0],e[1])){sum+=e[2];count++;if(count==n-1)break;}if(count!=n-1)throw new IllegalArgumentException("Graph disconnected");return sum;}
}