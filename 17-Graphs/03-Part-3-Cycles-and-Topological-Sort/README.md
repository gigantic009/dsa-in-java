# Cycles & Topological Sort

Cycle detection differs for directed and undirected graphs. Topological ordering is defined only for directed acyclic graphs (DAGs).

## Implemented
- [x] Undirected cycle detection — CycleDetectionUndirected.java
- [x] Directed cycle detection — DirectedCycleDetection.java
- [x] Topological sort (Kahn's algorithm) — TopologicalSort.java
- [x] Kahn's algorithm with cycle-aware empty result — KahnTopologicalSort.java

These algorithms run in O(V+E) time using adjacency lists.

**KahnTopologicalSort contract:** returns an empty list when it cannot produce a full order because the graph contains a cycle. An empty graph also naturally produces an empty list, so callers should distinguish those cases using the vertex count. The separate TopologicalSort.sort implementation throws when it detects a cycle.

## Practice
- [ ] DFS topological sort
- [ ] Course Schedule
- [ ] Course Schedule II
- [ ] Alien Dictionary
