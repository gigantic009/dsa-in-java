# Graph Representation

A graph consists of vertices (nodes) and edges (connections). A graph can be directed or undirected, weighted or unweighted.

## Vocabulary
- **Vertex:** an entity represented in the graph.
- **Edge:** connection between vertices.
- **Degree:** number of incident edges in an undirected graph.
- **Indegree / outdegree:** incoming / outgoing edge counts in directed graphs.
- **Connected component:** maximal set of vertices connected in an undirected graph.
- **Path:** sequence of vertices connected by edges.
- **Cycle:** path that returns to its starting vertex with the relevant restrictions.

## Representations

### Adjacency matrix
A V × V matrix. For simple presence queries, an edge is stored at matrix[u][v]. Space O(V²); edge lookup O(1).

### Adjacency list
Store each vertex's neighbors. Space O(V+E) for typical sparse graph storage; traversing all neighbors is efficient. In an undirected graph each edge is listed at both endpoints.

### Edge list
Store edges as pairs or triples. Useful for algorithms that process edges directly, such as Kruskal's MST.

## Directed vs undirected
For an undirected edge, update both adjacency entries. For a directed edge, update only the source's outgoing list. For weighted graphs, store neighbor and weight.

## Practice
- Build adjacency matrix and list from a small edge list.
- Compute degrees.
- Represent a disconnected graph.
- Represent weighted and directed examples.

## Checkpoint
Choose a representation for a dense graph and a sparse graph, and justify memory and operation tradeoffs.
