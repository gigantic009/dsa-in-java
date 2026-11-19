import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

/** Dijkstra shortest paths for graphs with nonnegative edge weights. */
public class Dijkstra {
    public static class Edge {
        public final int to,weight;
        public Edge(int to,int weight){
            if(to<0||weight<0)throw new IllegalArgumentException("Destination and weight must be nonnegative");
            this.to=to;this.weight=weight;
        }
    }
    public static long[] distances(List<List<Edge>> graph,int source){
        if(graph==null||source<0||source>=graph.size())throw new IllegalArgumentException("Invalid graph or source");
        int n=graph.size();long[] distance=new long[n];Arrays.fill(distance,Long.MAX_VALUE);distance[source]=0;
        PriorityQueue<long[]> queue=new PriorityQueue<>((a,b)->Long.compare(a[1],b[1]));
        queue.add(new long[]{source,0});
        while(!queue.isEmpty()){
            long[] current=queue.remove();int u=(int)current[0];long d=current[1];
            if(d!=distance[u])continue; // Discard outdated queue entries.
            for(Edge edge:graph.get(u)){
                if(edge.to>=n)throw new IllegalArgumentException("Invalid edge destination");
                long candidate=d+edge.weight;
                if(candidate<distance[edge.to]){distance[edge.to]=candidate;queue.add(new long[]{edge.to,candidate});}
            }
        }
        return distance;
    }
}