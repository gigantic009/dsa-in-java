# Best Time to Buy and Sell Stock

**LeetCode:** [#121 — Best Time to Buy and Sell Stock](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/)  
**Companies:** Amazon, D-E-Shaw, Directi, Flipkart, Goldman Sachs, Intuit, MakeMyTrip, Microsoft

## Intuition
Track the lowest price seen so far. At each day, calculate the profit if selling today and keep the maximum profit.

## Dry run
For `[7, 1, 5, 3, 6, 4]`:
- Lowest price becomes 1.
- Selling at 5 gives profit 4.
- Selling at 6 gives profit 5, the best result.
- Return 5.

## Complexity
- **Time:** O(n)
- **Space:** O(1)
