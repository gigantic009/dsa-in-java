# Segment Tree Range Queries

The examples in this folder implement two query types with point updates.

## Implemented
- **RangeSumSegmentTree.java:** inclusive range sum query and point replacement.
- **RangeMinimumSegmentTree.java:** inclusive range minimum query and point replacement.

Both classes reject null arrays and invalid ranges or indices. Empty arrays may be constructed but cannot be queried or updated.

## Complexity
Build: O(n). Query: O(log n). Point update: O(log n). Space: O(n), typically allocated as approximately 4n entries.

## Further practice
- [ ] Range maximum with updates
- [ ] Lazy range update/query
- [ ] Count smaller after self

Integer sums may overflow for sufficiently large values; use a long-based tree when the problem requires larger totals.
