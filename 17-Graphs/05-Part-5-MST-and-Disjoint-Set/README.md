# MST & Disjoint Set (Union-Find)

A minimum spanning tree connects all vertices in a connected, undirected, weighted graph with minimum total edge weight and no cycles.

## Implemented
- [x] DSU — UnionFind.java (path compression and union by rank)
- [x] Kruskal's MST — KruskalMST.java

Union-Find operations are amortized near O(1). Kruskal typically runs in O(E log E). The implementation validates edge endpoints, rejects disconnected graphs and sorts a shallow copy of the edge array so the caller's order is preserved.

## Practice
- [ ] Prim's algorithm
- [ ] Redundant Connection
- [ ] Number of Provinces
- [ ] Accounts Merge
- [ ] Minimum Cost to Connect Points
