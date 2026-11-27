# Graphs — From Representation to Advanced Algorithms

## Prerequisites
Arrays, collections, queues, stacks, recursion and complexity.

## Vocabulary
Vertices, edges, directed/undirected, weighted/unweighted, degree, path, cycle and connected component.

## Learning sequence
1. [Representation](01-Part-1-Representation/README.md): adjacency list, matrix and edge list.
2. [Traversal](02-Part-2-Traversal/README.md): BFS, DFS, components, grids and reachability.
3. [Cycles and topological sort](03-Part-3-Cycles-and-Topological-Sort/README.md): directed/undirected cycle detection and DAG ordering.
4. [Shortest paths](04-Part-4-Shortest-Paths/README.md): BFS for unweighted, Dijkstra for nonnegative weights, Bellman-Ford for negative edges.
5. [MST and DSU](05-Part-5-MST-and-Disjoint-Set/README.md): union-find and Kruskal.

## BFS vs DFS
BFS uses a queue and explores distance layers. DFS explores deeply before backtracking. With adjacency lists both typically take O(V+E) time.

## Input contracts
The adjacency-list examples use zero-based vertices. Validation rejects null rows, null neighbor entries and out-of-range vertices. For cycle detection on undirected graphs, the adjacency list must represent edges symmetrically. Self-loops and parallel edges are supported by the builder.

## Checkpoint
- [x] Build an adjacency list
- [x] Run BFS and DFS
- [x] Detect directed and undirected cycles
- [x] Topological sorting
- [x] Unweighted shortest path
- [x] Dijkstra and Bellman-Ford
- [x] DSU and Kruskal
- [ ] Implement remaining practice topics listed in each section

For grids, model cells as vertices and valid moves as edges. Always check bounds and disconnected components.
