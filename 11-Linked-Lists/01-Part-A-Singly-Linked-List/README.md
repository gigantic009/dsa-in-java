# Singly Linked Lists

A linked list stores elements in nodes. Each node references the next node; unlike an array, nodes need not be adjacent in memory. Access by position is not constant-time.

## Node model
A node commonly contains data and a reference to the next node. The list's head points to the first node; an empty list has head null.

## Core operations
- Traverse: follow next references until null.
- Insert at head: new node points to old head, then becomes head.
- Delete at head: head moves to head.next.
- Search: walk through nodes.
- Reverse: repeatedly redirect next pointers using previous/current/next.

## Complexity
| Operation | Typical cost |
|---|---|
| Access by index | O(n) |
| Search | O(n) |
| Insert/delete at head | O(1) |
| Insert/delete after known node | O(1) (excluding finding it) |

## Pointer tracing: iterative reverse
Maintain `prev`, `curr`, and `next`. Save next before changing curr.next. Redirect curr.next to prev, then advance. Losing the saved next pointer disconnects the remainder of the list.

## Learning order
### Easy
Create/traverse, length, search, insertion/deletion, iterative/recursive reverse (`ReverseLinkedList.java`, `ReverseRecursive.java`), middle, remove duplicates (`RemoveDuplicatesSortedList.java`).

### Medium
Cycle detection (`LinkedListCycle.java`), merge sorted lists (`MergeSortedLists.java`), remove nth from end (`RemoveNthFromEnd.java`), palindrome (`LinkedListPalindrome.java`), intersection (`IntersectionOfLinkedLists.java`), add two numbers, reverse k groups.

### Challenge
Merge k sorted lists and copy a list with random pointers.

## Common mistakes
- Updating a pointer before saving the link needed next.
- Incorrect handling of head or empty list.
- Losing the tail in insertion.
- Forgetting dummy/sentinel nodes can simplify edge cases.
- Comparing node identity versus values when the problem requires node identity.

## Checkpoint
Draw pointer changes before implementing reverse, merge, and cycle detection. Test empty, one-node and two-node lists.
