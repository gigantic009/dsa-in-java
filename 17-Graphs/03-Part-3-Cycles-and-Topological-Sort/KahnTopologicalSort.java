import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/** Kahn's algorithm; an empty result indicates a directed cycle. */
public class KahnTopologicalSort {
    public static List<Integer> sort(List<List<Integer>> graph) {
        if(graph==null)throw new IllegalArgumentException("Graph cannot be null");
        for(int i=0;i<graph.size();i++) BFS.validateGraphAndStart(graph,i);
        int n=graph.size();int[] indegree=new int[n];
        for(List<Integer> neighbors:graph)for(int v:neighbors)indegree[v]++;
        Queue<Integer> queue=new ArrayDeque<>();
        for(int i=0;i<n;i++)if(indegree[i]==0)queue.add(i);
        List<Integer> order=new ArrayList<>();
        while(!queue.isEmpty()){
            int u=queue.remove();order.add(u);
            for(int v:graph.get(u))if(--indegree[v]==0)queue.add(v);
        }
        return order.size()==n?order:new ArrayList<>();
    }
    public static void main(String[] args){
        List<List<Integer>> graph=new ArrayList<>();for(int i=0;i<4;i++)graph.add(new ArrayList<>());
        graph.get(0).add(1);graph.get(0).add(2);graph.get(1).add(3);graph.get(2).add(3);
        System.out.println(sort(graph));
    }
}