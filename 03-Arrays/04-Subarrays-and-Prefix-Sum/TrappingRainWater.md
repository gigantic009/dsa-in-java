# Trapping Rain Water

**LeetCode:** [#42 — Trapping Rain Water](https://leetcode.com/problems/trapping-rain-water/)  
**Companies:** Samsung

## Intuition
Use two pointers and track the maximum wall seen from each side. The side with the smaller current height determines how much water can safely be added there.

## Dry run
For `[0,1,0,2,1,0,1,3,2,1,2,1]`, the trapped water totals 6 units.

## Complexity
- **Time:** O(n)
- **Space:** O(1)
