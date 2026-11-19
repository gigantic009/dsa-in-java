# Graph Representation

A graph contains **vertices (nodes)** and **edges (connections)**. Graphs may be directed/undirected and weighted/unweighted.

## Vocabulary
- Vertex: a node.
- Edge: a connection between vertices.
- Degree: incident edges in an undirected graph.
- Indegree/outdegree: incoming/outgoing edges in directed graphs.
- Component: a maximal connected set of vertices.
- Path: vertices connected by edges.
- Cycle: a path returning to its starting vertex.

## Representations
- **Adjacency matrix:** V × V table. Edge lookup O(1), space O(V²). Useful for dense graphs.
- **Adjacency list:** each vertex stores its neighbors. Space O(V+E); usually preferable for sparse graphs.
- **Edge list:** stores edges as pairs (or triples with weights). Convenient for edge-oriented algorithms such as Kruskal.

In an undirected adjacency list, an edge is stored at both endpoints. A directed edge is stored only at its source. Weighted graphs store the neighbor and weight together.

## Implemented
- [x] Build undirected adjacency list — AdjacencyList.java

## Practice
- [ ] Build adjacency matrix and edge list
- [ ] Compute degrees
- [ ] Represent directed, weighted and disconnected graphs

## Checkpoint
Explain which representation you would choose for a sparse graph and a dense graph, and why.