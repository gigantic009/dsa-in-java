# Grid Dynamic Programming

## Implemented
- [UniquePaths.java](UniquePaths.java) — LeetCode 62; paths moving right/down.

## Medium
- [x] Unique paths
- [ ] Unique paths with obstacles
- [ ] Minimum path sum
- [ ] Triangle path sum
- [ ] Dungeon game

## Hard
- [ ] Cherry pickup

For right/down moves, the typical recurrence is dp[r][c] = dp[r-1][c] + dp[r][c-1], with boundary initialization. O(m*n) time and space for this implementation.

Practice obstacle grids, minimum path cost, 1x1, 1xN and Nx1 cases.