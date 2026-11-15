# Maximum and Minimum Element in an Array

**LeetCode:** Not available — no exact LeetCode problem number verified.  
**Companies:** ABCO, Accolite, Amazon, Cisco, Hike, Microsoft, Snapdeal, VMWare, Google, Adobe

## Intuition
Initialise both minimum and maximum with the first element. Scan the remaining elements and update either value when a smaller or larger value is found.

## Dry run
For `[7, 2, 9, 4, 1, 6]`:
- Minimum updates: 7 → 2 → 1
- Maximum updates: 7 → 9
- Result: minimum 1, maximum 9

## Complexity
- **Time:** O(n)
- **Space:** O(1)
