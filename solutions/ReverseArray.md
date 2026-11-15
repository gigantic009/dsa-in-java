# Reverse the Array

**LeetCode:** Not available — the supplied problem is array reversal, not the separate LeetCode string-reversal problem.  
**Companies:** Infosys, Moonfrog Labs

## Intuition
Use two pointers: one at the beginning and one at the end. Swap their values, then move both pointers towards the centre.

## Dry run
For `[1, 2, 3, 4]`:
- Swap 1 and 4 → `[4, 2, 3, 1]`
- Swap 2 and 3 → `[4, 3, 2, 1]`

## Complexity
- **Time:** O(n)
- **Space:** O(1)
