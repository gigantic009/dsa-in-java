# BST Operations

A binary search tree follows an ordering rule: every value in the left subtree is smaller than its node, and every value in the right subtree is larger. These implementations ignore duplicates.

## Implemented
- [x] Search — [SearchInBST.java](SearchInBST.java)
- [x] Insert — [InsertIntoBST.java](InsertIntoBST.java)
- [x] Delete — [DeleteFromBST.java)

## Deletion: three cases
1. Leaf: remove it.
2. One child: replace the node with its child.
3. Two children: copy the inorder successor (the smallest value in the right subtree) and remove the successor from its original position.

## Future practice (not implemented here)
Minimum/maximum, floor/ceiling, BST LCA, kth largest, iterator, recover BST and largest BST subtree.

## Complexity
Each operation is O(h), where h is tree height. Worst-case h is n; a balanced BST has logarithmic height.

## Checkpoint
Trace deletion for all three cases and explain why inorder traversal of a valid BST is sorted.
