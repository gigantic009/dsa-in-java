// Bellman-Ford supports negative edges and detects negative cycles.
import java.util.*;
public class BellmanFord {
 public static long[]run(int n,int[][]edges,int src){long[]d=new long[n];Arrays.fill(d,Long.MAX_VALUE/4);d[src]=0;
  for(int pass=1;pass<n;pass++){boolean changed=false;for(int[]e:edges)if(d[e[0]]<Long.MAX_VALUE/4&&d[e[0]]+e[2]<d[e[1]]){d[e[1]]=d[e[0]]+e[2];changed=true;}if(!changed)break;}
  for(int[]e:edges)if(d[e[0]]<Long.MAX_VALUE/4&&d[e[0]]+e[2]<d[e[1]])throw new IllegalArgumentException("Negative cycle");return d;}
}