# Divide and Conquer

Divide and conquer is a strategy: **divide** a problem into smaller parts, **conquer** those parts recursively, and **combine** their results.

## How to recognize it
- The problem can be split into smaller related instances.
- Those instances are often independent.
- A combine step creates the answer for the larger instance.

## Lessons in this branch
| Problem | File | Key idea |
|---|---|---|
| Binary search | [BinarySearch.java](./BinarySearch.java) | Halve a sorted search space |
| Merge sort | [MergeSort.java](./MergeSort.java) | Sort halves, then merge |
| Quickselect | [QuickSelect.java](./QuickSelect.java) | Partition to find an order statistic |
| Count inversions | [CountInversions.java](./CountInversions.java) | Count cross-half inversions while merging |
| Majority element | [MajorityElementDivideConquer.java](./MajorityElementDivideConquer.java) | Combine half-candidates and verify |

## Merge sort outline
1. Split the array into halves.
2. Recursively sort each half.
3. Merge sorted halves.
4. Base case: size at most one.

Time: O(n log n). Auxiliary space: O(n) for the typical array implementation.

## Practice order
### Warm-up
- Binary search (iterative implementation here); implement recursive binary search as practice.

### Core
- Merge sort
- Quickselect (kth largest)

### Challenge
- Count inversions
- Majority element using divide and conquer
- Closest pair of points (implement as an extension)

## Contracts and side effects
- Binary search requires the input to be sorted in ascending order and returns -1 if the target is absent.
- Merge sort sorts its array in place and rejects null.
- Count inversions sorts its input array as a side effect; inversion pairs are indices i < j where a[i] > a[j].
- Quickselect validates k and rearranges the array during selection.
- Majority-element method rejects empty/null arrays and arrays without a strict majority.

## Checkpoint
Explain the divide, conquer, and combine steps for merge sort. Trace a 5-element array. Compare quicksort's average and worst-case time. Test empty/singleton arrays, duplicates, already-sorted and reverse-sorted input, and absent targets.