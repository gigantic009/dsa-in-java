# Linked Lists — Understand References and Pointer Changes

## Prerequisites
Java references, classes, objects, arrays and basic complexity.

## 1. Node model
A linked list stores nodes connected through references. A singly linked node contains data and a reference to the next node. The list's head reference identifies its first node; the last node points to null.

## 2. Why use a linked list?
Insertion/deletion at a known node can be efficient, but accessing the kth element requires traversal. Unlike arrays, nodes are not accessed by constant-time indexing.

## Part A — Singly linked lists
[Part A](01-Part-A-Singly-Linked-List/README.md): node design, traversal, insert, delete, search, length, reverse, middle, nth-from-end, merge and cycle detection.

## Part B — Doubly, circular and advanced
[Part B](02-Part-B-Doubly-Circular-and-Advanced/README.md): previous pointers, circular invariants, insertion/deletion, intersections, palindrome and advanced list patterns.

## Pointer diagrams
Before changing links, draw nodes and arrows. For reversal, preserve the next reference before overwriting it:
`next = current.next`; redirect `current.next`; advance both references. Trace the first, middle and final node.

## Complexity
Traversal/search: O(n). Access by index: O(n). Insert/delete at a known node/reference: O(1), but finding that node may require O(n). Space for n nodes: O(n).

## Common errors
- Losing the remainder of the list
- Updating head incorrectly
- Forgetting null and single-node cases
- Incorrect cycle handling
- Using a stale reference
- Confusing the node to delete with the link to change

## Checkpoint
- [ ] Implement traversal and insertion.
- [ ] Remove a node safely.
- [ ] Reverse iteratively and recursively.
- [ ] Find middle and nth-from-end.
- [ ] Detect a cycle using Floyd's algorithm.
- [ ] Explain complexity of access vs insertion.
