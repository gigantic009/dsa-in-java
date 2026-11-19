# Heaps and Hashing — Fast Lookup and Priority

## Hashing
HashMap and HashSet provide expected efficient lookup under typical conditions, but hash-based structures do not promise sorted order. Understand key equality and hashing, collisions and why mutable keys can be problematic.

## Heap / PriorityQueue
A heap maintains a priority property, not complete sorted order. Java's PriorityQueue is a min-heap by default; use a comparator when another order is required.

## Learning order
1. HashSet: membership and duplicate detection.
2. HashMap: frequency maps, grouping and prefix-sum patterns.
3. PriorityQueue: insert, peek, remove and custom comparator.
4. Heapify and heap operations.
5. Top-K, kth-largest, merge K sorted structures and scheduling.

## Complexity
Typical hash lookup/insert is expected O(1); worst-case details depend on implementation. Heap insertion/removal is O(log n), peek O(1), building a heap from an array is typically O(n).

## Checkpoint
Build a frequency map, solve a top-K problem and explain why a heap is not a fully sorted array.
