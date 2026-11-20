/** Disjoint Set Union using path compression and union by rank. */
public class UnionFind {
    private final int[] parent;
    private final int[] rank;

    public UnionFind(int size) {
        if (size < 0) {
            throw new IllegalArgumentException("Size cannot be negative");
        }

        parent = new int[size];
        rank = new int[size];

        for (int i = 0; i < size; i++) {
            parent[i] = i;
        }
    }

    /** Returns the representative and compresses the path. */
    public int find(int value) {
        validate(value);

        if (parent[value] != value) {
            parent[value] = find(parent[value]);
        }
        return parent[value];
    }

    /** Merges two sets; false means the elements were already connected. */
    public boolean union(int first, int second) {
        first = find(first);
        second = find(second);

        if (first == second) {
            return false;
        }

        if (rank[first] < rank[second]) {
            parent[first] = second;
        } else if (rank[first] > rank[second]) {
            parent[second] = first;
        } else {
            parent[second] = first;
            rank[first]++;
        }
        return true;
    }

    private void validate(int value) {
        if (value < 0 || value >= parent.length) {
            throw new IllegalArgumentException("Index out of bounds");
        }
    }
}
