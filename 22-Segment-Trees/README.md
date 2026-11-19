# Segment Trees — Range Queries and Updates

## Prerequisites
Arrays, recursion, divide-and-conquer and complexity.

## 1. Why a segment tree?
When an array changes and range queries must be answered repeatedly, recomputing each query from scratch can be inefficient. A segment tree stores summaries of intervals, allowing updates and queries in logarithmic time for common operations.

## 2. Core concepts
- A node represents an interval.
- Leaves represent individual array elements.
- Internal nodes combine summaries of child intervals.
- The combine operation depends on the problem (sum, minimum, maximum, etc.).
- Query intervals are split when needed.
- Point updates modify a leaf and recompute its ancestors.

## 3. Learning sequence
1. Understand recursive interval splitting.
2. Build the tree.
3. Query a range.
4. Update a point.
5. Compare with prefix sums and Fenwick trees.
6. Learn lazy propagation for range updates only after point updates are mastered.

## 4. Complexity
Typical build: O(n). Point update: O(log n). Range query: O(log n). Memory is often allocated as approximately 4n for a conventional recursive implementation; explain the exact structure used.

## 5. Practice
Range sum, range minimum, point update, multiple query types, lazy range update and Fenwick comparison.

## Checkpoint
Draw the interval tree for 8 elements, trace a query, trace an update and implement both from scratch.
