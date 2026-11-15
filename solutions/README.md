# Arrays — Starter Solution Notes

The Java files in this folder keep the code minimal. The explanations and complexity notes live here so the source files remain clean.

## 1. Maximum and Minimum Element in an Array
**Idea:** Start both minimum and maximum at the first element. Scan the remaining elements once, updating either value when a smaller or larger element is found.

- Time: O(n), because every element is checked once.
- Extra space: O(1), because only two trackers are used (the returned pair is the output).

## 2. Reverse the Array
**Idea:** Use two pointers. Swap the leftmost and rightmost values, then move both pointers inward. Stop when they meet or cross.

- Time: O(n), because at most half the array's elements are swapped.
- Extra space: O(1), because reversal happens in place.

## 3. Best Time to Buy and Sell Stock (one transaction)
**Idea:** Keep the lowest price seen so far. At each day, calculate the profit from selling today and update the best profit. Then update the lowest price.

- Time: O(n), one pass through the prices.
- Extra space: O(1), only two variables are maintained.

The stock solution assumes one buy followed by one sell, matching the standard single-transaction version of the problem.
