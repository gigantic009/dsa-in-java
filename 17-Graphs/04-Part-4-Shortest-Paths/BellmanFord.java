import java.util.Arrays;

/** Bellman-Ford supports negative edges and detects reachable negative cycles. */
public class BellmanFord {
    public static long[] run(int vertices,int[][] edges,int source) {
        if(vertices<0||source<0||source>=vertices)throw new IllegalArgumentException("Invalid vertices or source");
        for(int[] e:edges)if(e==null||e.length<3||e[0]<0||e[0]>=vertices||e[1]<0||e[1]>=vertices)throw new IllegalArgumentException("Invalid edge");
        long[] distance=new long[vertices];Arrays.fill(distance,Long.MAX_VALUE);distance[source]=0;
        // Relax every edge up to V-1 times.
        for(int pass=1;pass<vertices;pass++){
            boolean changed=false;
            for(int[] e:edges)if(distance[e[0]]!=Long.MAX_VALUE&&distance[e[0]]+e[2]<distance[e[1]]){
                distance[e[1]]=distance[e[0]]+e[2];changed=true;
            }
            if(!changed)break;
        }
        // A further improvement reveals a negative cycle reachable from source.
        for(int[] e:edges)if(distance[e[0]]!=Long.MAX_VALUE&&distance[e[0]]+e[2]<distance[e[1]])throw new IllegalArgumentException("Reachable negative cycle");
        return distance;
    }
}