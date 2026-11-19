# Contains Duplicate

**LeetCode:** [#217 — Contains Duplicate](https://leetcode.com/problems/contains-duplicate/)  
**Companies:** Amazon

## Intuition
Keep a set of values already visited. If insertion fails, that value has appeared before, so a duplicate exists.

## Dry run
For `[1, 2, 3, 1]`:
- Add 1, 2, and 3 to the set.
- The second 1 is already present, so return `true`.

## Complexity
- **Time:** O(n) average
- **Space:** O(n)
