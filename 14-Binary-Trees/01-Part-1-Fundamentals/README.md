# Binary Tree Fundamentals

A binary tree node has at most two child references: left and right. A tree may be empty; do not assume every node has two children.

## Vocabulary
Root, parent, child, sibling, leaf, depth, height, subtree.

## Traversals
- Preorder: node, left, right.
- Inorder: left, node, right.
- Postorder: left, right, node.
- Level order: visit by levels, typically with a queue.

## Common problems
Maximum depth, node count, leaf count, diameter, balance, level-order variants, lowest common ancestor, path sums.

## Recursive pattern
Define precisely what the helper returns for a subtree. Base case for null, recursively solve left/right, and combine results. Avoid repeatedly computing the same subtree metric.

## Practice progression
Build a tree; implement traversals; level order; depth; counts; diameter; balance; zigzag and boundary traversals; vertical traversal; LCA; serialization; maximum path sum.

## Complexity
Most full-tree traversals visit each node once: O(n) time. Recursive auxiliary space is O(h), where h is tree height; worst-case h can be n.

## Checkpoint
Trace all three DFS traversals on a small tree and implement level order without notes.
