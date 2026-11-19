# BST Operations

A binary search tree follows an ordering invariant: values in the left subtree are smaller than the node and values in the right subtree are larger, according to the convention chosen for duplicates.

## Search and insert
Compare at each node and follow the appropriate subtree. This is O(h), where h is tree height. Balanced trees have logarithmic height; an unbalanced tree can have height O(n).

## Minimum and maximum
Follow left references for the minimum and right references for the maximum.

## Delete
Three cases:
1. Leaf: remove it.
2. One child: replace the node with that child.
3. Two children: replace with the inorder successor (or predecessor), then remove that replacement from its original location.

## Practice
Search, insert, traversal, min/max, deletion, floor/ceiling, LCA, kth smallest/largest, iterator, recover BST, largest BST subtree.

## Checkpoint
Trace deletion for all three cases. Explain why an inorder traversal of a valid BST produces sorted values.
