# Divide and Conquer

Divide and conquer is a strategy: **divide** a problem into smaller parts, **conquer** those parts recursively, and **combine** their results.

## How to recognize it
- The problem can be split into smaller related instances.
- Those instances are often independent.
- A combine step creates the answer for the larger instance.

## Examples
- Binary search: discard half of a monotonic/sorted search space.
- Merge sort: sort halves and merge.
- Quick sort: partition around a pivot and sort each side.
- Quickselect: partition to find an order statistic without fully sorting.
- Inversion counting: count across halves during merge.
- Closest pair of points: advanced geometric example.

## Merge sort outline
1. Split the array into halves.
2. Recursively sort each half.
3. Merge sorted halves.
4. Base case: size at most one.

Time: O(n log n). Auxiliary space: O(n) for the typical array implementation.

## Practice order
### Warm-up
- Binary search and recursive binary search

### Core
- Merge sort
- Quick sort
- Quickselect (kth largest)

### Challenge
- Count inversions
- Majority element using divide and conquer
- Closest pair of points (study after the foundations)

## Checkpoint
Explain the divide, conquer, and combine steps for merge sort. Trace a 5-element array. Compare quicksort's average and worst-case time.
