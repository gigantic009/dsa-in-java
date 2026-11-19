# Segment Tree Fundamentals

A segment tree stores information about intervals of an array. It supports selected range queries and updates efficiently when the stored operation can be combined.

## Concept
Each node represents an interval. Leaves represent individual array elements; internal nodes combine their children. For sum queries, the combine operation is addition.

## Core operations
- Build: construct tree from the input array.
- Query: return the result for a requested interval by combining covered nodes.
- Point update: update a leaf and recompute ancestors.

For a typical segment tree, build is O(n), point update O(log n), and range query O(log n). Storage is commonly allocated as about 4n entries for a recursive implementation.

## Variations
Range minimum/maximum, sum, and lazy propagation for certain range updates.

## Learning order
1. Understand interval splitting and recursion.
2. Build a sum tree.
3. Query intervals.
4. Update one element.
5. Learn lazy propagation only after the above works.

## Common mistakes
- Incorrect interval boundaries.
- Treating a partial overlap as full coverage.
- Updating only a leaf, not its ancestors.
- Using a combine operation that does not match the query.

## Checkpoint
Draw a tree for 8 elements. Trace a query spanning both child intervals and a point update.
