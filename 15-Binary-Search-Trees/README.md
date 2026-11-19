# Binary Search Trees — Ordered Binary Trees

## BST invariant
Values in the left subtree are strictly smaller and values in the right subtree strictly larger in this repository's implementations. Duplicate values are not inserted. The ordering applies to entire subtrees, not just immediate children.

## Part A — Operations (implemented)
[Operations](01-Part-A-Operations/README.md): search, insertion and deletion.

## Part B — Validation and advanced (implemented)
[Validation and advanced](02-Part-B-Validation-and-Advanced/README.md): validate BST, kth-smallest and sorted-array-to-balanced-BST.

## Complexity
Operations are O(h), where h is tree height. A balanced tree has logarithmic height; a degenerate tree may have linear height. Do not assume logarithmic complexity unless balance is maintained or guaranteed.

## Code coverage
The implementations in both subfolders are listed in their README. Other topics mentioned as future practice are not yet implemented here.

## Checkpoint
Implement search, insert, delete and validation. Explain why checking only immediate children is insufficient and why inorder traversal produces sorted values.
