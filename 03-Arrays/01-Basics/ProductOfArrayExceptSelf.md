# Product of Array Except Self

**LeetCode:** [#238 — Product of Array Except Self](https://leetcode.com/problems/product-of-array-except-self/)  
**Companies:** Microsoft, Facebook

## Intuition
For each index, multiply the product of all values to its left by the product of all values to its right. Store left products in the answer first, then multiply by right products in a reverse pass. No division is used.

## Dry run
For `[1, 2, 3, 4]`:
- Left products stored: `[1, 1, 2, 6]`
- Multiply by right products in reverse: `[24, 12, 8, 6]`

## Complexity
- **Time:** O(n)
- **Extra space:** O(1), excluding the output array
