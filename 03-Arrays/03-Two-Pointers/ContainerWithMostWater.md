# Container With Most Water

**LeetCode:** [#11 — Container With Most Water](https://leetcode.com/problems/container-with-most-water/)

## Intuition
Start with the widest container. The shorter side limits the water level, so move that pointer inward; moving the taller side cannot improve the limiting height while width shrinks.

## Dry run
For `[1,8,6,2,5,4,8,3,7]`, the best pair is heights 8 and 7, separated by width 7. Area = 7 × 7 = 49.

## Complexity
- **Time:** O(n)
- **Space:** O(1)
