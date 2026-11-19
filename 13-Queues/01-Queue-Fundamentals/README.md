# Queue Fundamentals

A queue is FIFO: the first item added is the first removed.

## Operations
- enqueue/addLast: add at the rear
- dequeue/removeFirst: remove at the front
- peek/front: inspect front
- empty check

## Implementations
- Array-based queue: use circular indexing to reuse slots.
- Linked queue: head and tail references.
- Deque: supports operations at both ends.
- Java: ArrayDeque is often a suitable general-purpose queue.

## Circular array intuition
When rear reaches the array's end, it wraps around to index zero using modulo. Track size (or carefully distinguish empty and full states) to avoid ambiguity.

## Applications
- BFS
- Scheduling
- Buffering
- Level-order tree traversal
- Sliding window

## Practice
### Easy
Implement array/linked queue, circular queue, deque.

### Core
Queue using stacks, stack using queues, first non-repeating character in a stream.

### Challenge
Sliding Window Maximum (typically deque of indices).

## Common mistakes
- Incorrect wraparound.
- Confusing full and empty conditions.
- Removing from the wrong end of a deque.
- Keeping values instead of indices when the window position matters.

## Checkpoint
Implement a circular queue and trace a sequence that wraps around.
