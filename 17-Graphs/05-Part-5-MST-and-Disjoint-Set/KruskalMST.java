import java.util.Arrays;
import java.util.Comparator;

/** Kruskal's algorithm for a minimum spanning tree of an undirected graph. */
public class KruskalMST {
    public static long total(int vertices,int[][] edges){
        if(vertices<0)throw new IllegalArgumentException("Invalid vertex count");
        if(vertices==0)return 0;
        for(int[] e:edges)if(e==null||e.length<3||e[0]<0||e[0]>=vertices||e[1]<0||e[1]>=vertices)throw new IllegalArgumentException("Invalid edge");
        Arrays.sort(edges,Comparator.comparingInt(e->e[2]));
        UnionFind uf=new UnionFind(vertices);long total=0;int selected=0;
        for(int[] e:edges){
            if(uf.union(e[0],e[1])){total+=e[2];selected++;if(selected==vertices-1)break;}
        }
        if(selected!=vertices-1)throw new IllegalArgumentException("Graph disconnected; MST does not exist");
        return total;
    }
}