# Segment Tree Fundamentals

A segment tree stores summaries for intervals of an array. It is useful when repeated range queries and point updates are needed.

## Structure
- Each node represents an interval.
- Leaves store individual array values.
- Internal nodes combine their children (addition for sums).
- The implementation uses inclusive index intervals.

## Operations in SegmentTree.java
- Build: recursively construct the tree.
- Sum query: combine covered nodes for [left, right].
- Point update: replace one array element and recompute ancestors.

## Complexity
- Build: O(n)
- Query: O(log n)
- Point update: O(log n)
- Space: O(n), conventionally allocated as about 4n nodes.

## Assumptions and edge cases
Null arrays are rejected. Empty arrays can be constructed, but queries and updates on them are invalid. Range endpoints must be valid and left <= right. Integer sums can overflow if the values or range totals exceed the int range.

## Learning order
1. Understand interval splitting.
2. Build a tree.
3. Query intervals.
4. Update a point.
5. Compare with prefix sums and Fenwick trees.
6. Study lazy propagation later.

## Checkpoint
Draw the tree for a small array, trace a query and update, and explain how the parent summaries are recalculated.
