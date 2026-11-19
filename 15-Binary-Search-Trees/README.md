# Binary Search Trees — Ordered Binary Trees

## BST invariant
For a BST, keys in the left subtree obey the chosen smaller-key rule and keys in the right subtree obey the larger-key rule. Duplicate handling must be explicitly defined. The invariant applies to entire subtrees, not only immediate children.

## Part A — Operations
[Operations](01-Part-A-Operations/README.md): search, insertion, deletion, min/max, inorder and successor/predecessor.

## Part B — Validation and advanced patterns
[Validation and advanced](02-Part-B-Validation-and-Advanced/README.md): validation using bounds, LCA, kth element, balancing concepts and recovery patterns.

## Complexity
Operations are O(h), where h is tree height. A balanced BST has logarithmic height; a degenerate tree may have linear height. Do not assume logarithmic complexity unless balance is maintained or guaranteed.

## Checkpoint
Implement search, insert, delete and validation. Explain why checking only each node's immediate children is insufficient for validation.


## Sprint teaching expansion

BST ordering applies across descendants and requires duplicate policy. Inorder is sorted. Validate with propagated bounds. Test duplicates, extreme values and skew.

Self-check: explain, trace, justify, implement, test boundaries and analyze complexity.
