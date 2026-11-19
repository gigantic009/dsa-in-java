# 3Sum

**LeetCode:** [#15 — 3Sum](https://leetcode.com/problems/3sum/)  

## Intuition
Sort the array. Fix one value, then use two pointers to find pairs that make the total zero. Skip repeated values so each triplet appears once.

## Dry run
For `[-1, 0, 1, 2, -1, -4]`, sorting gives `[-4, -1, -1, 0, 1, 2]`. The unique triplets are `[-1, -1, 2]` and `[-1, 0, 1]`.

## Complexity
- **Time:** O(n²)
- **Extra space:** O(1) auxiliary, excluding sorting implementation and output
