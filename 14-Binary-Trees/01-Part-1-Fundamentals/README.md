# Binary Tree Fundamentals

A binary tree node has at most two child references: left and right. A tree can be empty; a node does not need to have both children.

## Vocabulary
Root, parent, child, sibling, leaf, depth, height and subtree.

## Traversals
- Preorder: node, left, right.
- Inorder: left, node, right.
- Postorder: left, right, node.
- Level order: visit by levels, typically with a queue.

## Implemented problems
- [Count total nodes and leaf nodes](CountTreeNodes.java) — beginner recursion exercise.
- [Maximum depth](MaximumDepth.java) — LeetCode 104, Maximum Depth of Binary Tree.

## Recursive pattern
Define exactly what the recursive method returns for a subtree. Handle the null base case, solve the left and right subtrees, and combine their results.

## Future practice (not implemented in this folder yet)
Diameter, balance checking, zigzag and boundary traversals, vertical traversal, LCA, serialization and maximum path sum.

## Complexity
A full traversal visits each node once: O(n) time. Recursive auxiliary space is O(h), where h is tree height; in the worst case h can equal n.

## Checkpoint
Trace the recursion for node counting and maximum depth on an empty tree, a single node and a skewed tree.
