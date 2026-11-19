# BST — Part B: Validation and Advanced

## Implemented
- [x] Validate a BST using bounds — [ValidateBST.java](ValidateBST.java)
- [x] Kth smallest element — [KthSmallestBST.java](KthSmallestBST.java)
- [x] Convert a sorted distinct array into a height-balanced BST — [SortedArrayToBST.java](SortedArrayToBST.java)

## Future practice (not implemented here)
- [ ] LCA in a BST
- [ ] Recover swapped nodes
- [ ] Merge BSTs
- [ ] Other balancing patterns

## Theory
Validation must use inherited lower and upper bounds. Kth-smallest uses inorder traversal because it visits values in increasing order. Choosing the midpoint of a sorted array recursively creates a height-balanced tree.

## Complexity
Validation O(n); kth-smallest O(n) worst-case and O(h) auxiliary space; sorted-array conversion O(n) time and O(log n) recursion space for balanced output.
