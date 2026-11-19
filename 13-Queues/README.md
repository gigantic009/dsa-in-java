# Queues — FIFO, Deques and Breadth-First Processing

## 1. Queue
First In, First Out (FIFO): enqueue adds at the back and dequeue removes from the front. A circular array avoids shifting every element on each removal.

## 2. Java choices
- Queue interface and ArrayDeque
- Deque for insertion/removal at both ends
- PriorityQueue for priority ordering (not FIFO)
- Custom circular queue for implementation practice

## Part 1
[Queue fundamentals](01-Queue-Fundamentals/README.md): implementation, circular queue, operations and complexity.

## Part 2
[Queue patterns](02-Queue-Problem-Patterns/README.md): queue-based problems, BFS, deque and sliding-window patterns.

## Common mistakes
- Confusing queue order with priority order.
- Shifting all elements unnecessarily.
- Incorrect circular-index wraparound.
- Forgetting empty/full distinctions in a custom queue.

## Checkpoint
Implement a circular queue and use a queue for BFS. Explain the invariant for head, tail and occupancy.
