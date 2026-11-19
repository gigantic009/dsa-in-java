# Arrays Masterclass

## Learning outcomes

Understand fixed-size contiguous storage, traversal, mutation, index safety, prefix/suffix state, two-pointer techniques, sliding windows, hashing, sorting and array optimization.

## 1. The mental model

An array stores a fixed number of elements of one type. Positions are numbered 0 through length−1. Random access is O(1); insertion in the middle typically requires shifting elements and is O(n). A valid index obeys 0 <= index < length. An array reference may be null; an allocated array may be empty. Default values are not necessarily meaningful input.

## 2. Traversal and invariant

A loop from i=0 while i<n visits every element once. A useful invariant: before each iteration, a summary variable describes the elements already processed. Finding the maximum uses max initialized to the first element—not zero, because all values may be negative.

## 3. Prefix state

Prefix sum P[i] is the sum through index i. The sum from l through r is P[r]-P[l-1], with a special case for l=0. Build in O(n), then range queries in O(1). Prefix/suffix products must consider zeroes and overflow; long is still finite.

## 4. Two-pointer patterns

- Opposite ends: pair search in sorted arrays, reversal, container area.
- Same direction: partitioning, deduplication, fast/slow scanning.
- Sliding window: maintain a contiguous interval and expand/shrink pointers. For sum-based windows, the monotonicity often requires non-negative values; arbitrary negatives invalidate many simple shrink rules.

Correctness must explain why pointer movement discards candidates that cannot improve the answer under the problem's assumptions.

## 5. Pattern comparison

| Pattern | Typical application | Complexity |
|---|---|---|
| Traversal | min/max/count | O(n), O(1) |
| Prefix sum | range queries | O(n) prep, O(1) query |
| Hash/frequency | membership/pair lookup | expected O(n) |
| Two pointers | sorted pair/partition | often O(n) |
| Sliding window | contiguous constraints | often O(n) |
| Kadane | max sum subarray | O(n), O(1) |
| Sort then scan | intervals/order | O(n log n) |

## 6. Kadane worked trace

Input: [-2,1,-3,4,-1,2,1,-5,4]. Maintain current=max(x,current+x), best=max(best,current).

| x | current | best |
|---:|---:|---:|
| -2 | -2 | -2 |
| 1 | 1 | 1 |
| -3 | -2 | 1 |
| 4 | 4 | 4 |
| -1 | 3 | 4 |
| 2 | 5 | 5 |
| 1 | 6 | 6 |
| -5 | 1 | 6 |
| 4 | 5 | 6 |

Answer is 6. If empty subarrays are not allowed, initialize from the first value or handle empty input explicitly; zero initialization fails for all-negative input.

## 7. Correctness idea

The best subarray ending at index i either begins at i or extends the best subarray ending at i−1. The recurrence considers both choices, so it finds the optimum ending at each index; tracking the largest of those values yields the global optimum.

## 8. Edge-case checklist

Null (if applicable), empty, singleton, two values, duplicates, all-positive, all-negative, mixed, zeroes, sorted/reverse-sorted, boundary values, overflow, mutation and large input.

## 9. Exercises

1. Min/max in one traversal with proof.
2. Reverse in-place and count swaps.
3. Stable move-zeroes.
4. First/last occurrence in sorted input.
5. Rotate by k using reversal.
6. Prefix-sum range query.
7. Longest target-sum subarray; compare hashing with sliding window and state assumptions.
8. Kadane with all-negative test.
9. Merge intervals; decide whether touching endpoints overlap.
10. Product except self; test zeroes and numeric limits.

## Mastery gate

Implement reverse, max/min, prefix query, two-sum, Kadane and merge intervals from memory. For each explain the invariant, complexity, assumptions, edge cases and mutation behavior. Then solve three unfamiliar array problems independently.
