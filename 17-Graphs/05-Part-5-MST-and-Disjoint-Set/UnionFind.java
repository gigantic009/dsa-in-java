/** Disjoint Set Union using path compression and union by rank. */
public class UnionFind {
    private final int[] parent,rank;
    public UnionFind(int n){
        if(n<0)throw new IllegalArgumentException("Size cannot be negative");
        parent=new int[n];rank=new int[n];for(int i=0;i<n;i++)parent[i]=i;
    }
    /** Returns the representative and compresses the path. */
    public int find(int x){
        validate(x);if(parent[x]!=x)parent[x]=find(parent[x]);return parent[x];
    }
    /** Merges sets; false means the elements were already connected. */
    public boolean union(int a,int b){
        a=find(a);b=find(b);if(a==b)return false;
        if(rank[a]<rank[b])parent[a]=b;
        else if(rank[a]>rank[b])parent[b]=a;
        else{parent[b]=a;rank[a]++;}
        return true;
    }
    private void validate(int x){if(x<0||x>=parent.length)throw new IllegalArgumentException("Index out of bounds");}
}