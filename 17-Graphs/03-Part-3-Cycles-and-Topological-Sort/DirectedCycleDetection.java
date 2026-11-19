import java.util.ArrayList;
import java.util.List;

/** Directed cycle detection with DFS states: 0=unvisited, 1=active, 2=finished. */
public class DirectedCycleDetection {
    public static boolean hasCycle(List<List<Integer>> graph) {
        if(graph==null) throw new IllegalArgumentException("Graph cannot be null");
        for(int i=0;i<graph.size();i++) BFS.validateGraphAndStart(graph,i);
        int[] state=new int[graph.size()];
        for(int i=0;i<graph.size();i++) if(state[i]==0 && dfs(i,graph,state)) return true;
        return false;
    }
    private static boolean dfs(int vertex,List<List<Integer>> graph,int[] state) {
        state[vertex]=1;
        for(int neighbor:graph.get(vertex)){
            if(state[neighbor]==1) return true;
            if(state[neighbor]==0 && dfs(neighbor,graph,state)) return true;
        }
        state[vertex]=2;
        return false;
    }
    public static void main(String[] args) {
        List<List<Integer>> graph=new ArrayList<>(); for(int i=0;i<3;i++)graph.add(new ArrayList<>());
        graph.get(0).add(1);graph.get(1).add(2);graph.get(2).add(0);
        System.out.println(hasCycle(graph));
    }
}