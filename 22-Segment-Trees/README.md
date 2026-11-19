# Segment Trees — Range Queries and Updates

## Prerequisites
Arrays, recursion, divide-and-conquer and complexity analysis.

## 1. Why a segment tree?
Repeated range queries become expensive when each query scans the array. A segment tree stores interval summaries so common queries and point updates can be handled efficiently.

## 2. Core concepts
- Each node represents an interval; leaves represent array elements.
- Internal nodes combine child summaries using the operation chosen for the problem.
- Queries combine the summaries of covered intervals.
- Point updates replace a leaf and recompute its ancestors.
- This folder uses inclusive interval endpoints.

## 3. Learning sequence
1. Understand recursive interval splitting.
2. Build the tree.
3. Query a range.
4. Update a point.
5. Compare with prefix sums and Fenwick trees.
6. Learn lazy propagation only after point updates are mastered.

## 4. Complexity
Build: O(n). Point update: O(log n). Range query: O(log n). Space: O(n), commonly allocated as about 4n entries in recursive implementations.

## 5. Implemented examples
- `SegmentTree.java`: range-sum queries and point updates.
- `RangeSumSegmentTree.java`: range-sum queries and point updates.
- `RangeMinimumSegmentTree.java`: range-minimum queries and point updates.

Null arrays are rejected. Empty arrays can be constructed, but queries and updates are invalid. Range indices must be valid and ordered. Integer sums can overflow; use long when problem constraints require it.

## Further practice
Range maximum, lazy propagation, and Fenwick tree comparison.

## Checkpoint
Draw the interval tree for 8 elements, trace a query and an update, and implement both from scratch.
