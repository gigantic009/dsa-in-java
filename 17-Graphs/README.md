# Graphs — From Representation to Advanced Algorithms

## Prerequisites
Arrays, collections, queues, stacks, recursion and complexity.

## 1. Vocabulary
A graph has vertices (nodes) and edges (connections). Graphs can be directed/undirected, weighted/unweighted and cyclic/acyclic. Understand degree, path, cycle, connected component and adjacency.

## 2. Representation
[Part 1](01-Part-1-Representation/README.md): adjacency list, matrix and edge list. Choose a representation based on graph density and operations.

## 3. Learning sequence
- [Part 2: BFS and DFS](02-Part-2-Traversal/README.md): traversal, components, grids, islands and reachability.
- [Part 3: Cycles and topological sort](03-Part-3-Cycles-and-Topological-Sort/README.md): directed/undirected cycle detection, DAG ordering and bipartite concepts.
- [Part 4: Shortest paths](04-Part-4-Shortest-Paths/README.md): BFS for unweighted graphs, Dijkstra for nonnegative weights, Bellman-Ford for negative edges under its conditions, Floyd-Warshall for all-pairs.
- [Part 5: MST and DSU](05-Part-5-MST-and-Disjoint-Set/README.md): union-find, Kruskal and Prim.

## 4. BFS vs DFS
BFS uses a queue and explores by distance layers in an unweighted graph; DFS explores deeply before backtracking. Both are typically O(V+E) with adjacency lists.

## 5. Grid graphs
A grid can be treated as a graph implicitly: a cell is a vertex and legal neighboring cells are edges. Define movement directions and boundary checks carefully.

## Checkpoint
- [ ] Build an adjacency list.
- [ ] Run BFS and DFS.
- [ ] Count components.
- [ ] Detect cycles.
- [ ] Explain topological sort's DAG precondition.
- [ ] Choose a shortest-path algorithm based on edge weights.
- [ ] Implement DSU and one MST algorithm.
