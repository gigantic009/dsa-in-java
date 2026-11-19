# Heaps and Hashing — Fast Lookup and Priority

## Implemented
- Hashing: [Two Sum](01-Hashing/TwoSum.java), [Contains Duplicate](01-Hashing/ContainsDuplicate.java), [Group Anagrams](01-Hashing/GroupAnagrams.java).
- Heap / PriorityQueue: [Kth Largest Element](02-Heaps-and-Priority-Queues/KthLargestElement.java), [Top K Frequent Elements](02-Heaps-and-Priority-Queues/TopKFrequent.java).

## Hashing
HashMap and HashSet provide expected efficient lookup under typical conditions, but do not guarantee sorted order. Understand key equality, hashing and collisions.

## Heap / PriorityQueue
A heap maintains a priority property, not complete sorted order. Java's PriorityQueue is a min-heap by default. Use a comparator for other priorities.

## Learning order
1. HashSet membership and duplicate detection.
2. HashMap frequency maps and grouping.
3. PriorityQueue: add, peek and remove.
4. Top-K patterns and heap operations.

## Complexity
Expected hash lookup/insertion: O(1). Heap insertion/removal: O(log n), peek: O(1). Top-K implementations here use O(n log k) or O(n) expected as documented.

## Future practice (not implemented in this folder)
Merge K sorted structures, scheduling, K closest points, streaming median, sliding window median, subarray sum K, longest consecutive sequence and other listed patterns.

## Checkpoint
Build a frequency map, solve a Top-K problem and explain why a heap is not a fully sorted array.
