# Binary Trees — Build a Strong Foundation

## Prerequisites
Recursion, references, stacks, queues and complexity analysis.

## Vocabulary
Root, parent, child, sibling, leaf, depth, height, subtree, path, complete, full and balanced. In this folder, maximum depth/height is measured in **nodes**; diameter is measured in **edges**.

## Learning sequence
- [Part 1: Fundamentals](01-Part-1-Fundamentals/README.md): node structure, counting nodes/leaves and maximum depth.
- [Part 2: Traversals](02-Part-2-Traversals/README.md): iterative inorder, preorder, postorder and level-order traversal.
- [Part 3: Advanced problems](03-Part-3-Advanced-Problems/README.md): invert tree, diameter, path sum and LCA.

## DFS vs BFS
DFS explores depth first, using recursion or a stack. BFS explores level by level using a queue. Choose the approach according to the information the problem requires.

## Code library coverage
Every implemented problem in the three subfolders is linked in its respective README. Topics listed as future practice are clearly marked as not yet implemented.

## Checkpoint
Build a small tree, perform all four basic traversals, calculate its depth and node count, invert it, and solve a root-to-leaf path sum problem.

## Complexity
A traversal that visits every node takes O(n) time. Recursive traversal uses O(h) stack space, where h is the tree height; in a skewed tree h can be n.
