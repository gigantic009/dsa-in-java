import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/** Topological ordering for a DAG using Kahn's algorithm. */
public class TopologicalSort {
    public static List<Integer> sort(int vertices,int[][] edges) {
        if(vertices<0)throw new IllegalArgumentException("Invalid vertex count");
        List<List<Integer>> graph=new ArrayList<>();int[] indegree=new int[vertices];
        for(int i=0;i<vertices;i++)graph.add(new ArrayList<>());
        for(int[] edge:edges){
            if(edge==null||edge.length<2||edge[0]<0||edge[0]>=vertices||edge[1]<0||edge[1]>=vertices)throw new IllegalArgumentException("Invalid edge");
            graph.get(edge[0]).add(edge[1]);indegree[edge[1]]++;
        }
        Queue<Integer> queue=new ArrayDeque<>();for(int i=0;i<vertices;i++)if(indegree[i]==0)queue.add(i);
        List<Integer> order=new ArrayList<>();
        while(!queue.isEmpty()){int u=queue.remove();order.add(u);for(int v:graph.get(u))if(--indegree[v]==0)queue.add(v);}
        if(order.size()!=vertices)throw new IllegalArgumentException("Graph contains a cycle");
        return order;
    }
}