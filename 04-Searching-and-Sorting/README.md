# Searching and Sorting — A Complete Beginner's Module

## Searching
### Linear search
Inspect each element until the target is found or the input ends. O(n) time and O(1) extra space.

### Binary search
Requires a sorted search space or a proven monotonic predicate. Maintain a range that still contains the answer. Each iteration reduces the range; classic binary search is O(log n).

Learn: midpoint safety (`low + (high-low)/2`), boundary conditions, inclusive/exclusive ranges, first/last occurrence, lower/upper bounds, rotated arrays, binary search on answer.

## Sorting
Sorting arranges data by a chosen ordering. Learn why comparison sorting cannot generally beat O(n log n) comparisons in the worst case under the standard comparison model.

| Algorithm | Average/Worst time | Extra space | Stable? (typical implementation) |
|---|---|---|---|
| Bubble | O(n²) | O(1) | Yes |
| Selection | O(n²) | O(1) | No |
| Insertion | O(n²) | O(1) | Yes |
| Merge | O(n log n) | O(n) | Yes |
| Quick | O(n log n) avg, O(n²) worst | stack | Usually no |

## Learning order
1. Linear search; verify binary-search preconditions.
2. Binary search and trace table.
3. First/last occurrence and insertion position.
4. Search in rotated sorted arrays.
5. Binary search on answer.
6. Bubble, selection and insertion sort (understand, don't use as default).
7. Merge sort and quicksort.
8. Sorting-based problem patterns and comparison.

## Checkpoint
Implement linear search, binary search, lower-bound style search, merge sort and quicksort from memory. Explain preconditions, stability, in-place behavior and complexity.


## Sprint teaching expansion

Binary search requires sortedness/monotonicity and an interval invariant; midpoint low+(high-low)/2. Sorting trade-offs. Test duplicates, sorted, reversed, tiny inputs. Practice lower/upper bound, merge sort, quicksort, selection.

Self-check: explain, trace, justify, implement, test boundaries and analyze complexity.
