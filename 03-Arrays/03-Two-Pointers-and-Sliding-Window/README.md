# Two Pointers and Sliding Window

Every listed item below has a Java implementation in this folder or is explicitly marked as not implemented.

## Implemented problems

| Problem | Pattern | Java solution | LeetCode |
|---|---|---|---|
| 3Sum | Sorting + two pointers | [ThreeSum.java](ThreeSum.java) | [#15](https://leetcode.com/problems/3sum/) |
| Container With Most Water | Opposite-direction pointers | [ContainerWithMostWater.java](ContainerWithMostWater.java) | [#11](https://leetcode.com/problems/container-with-most-water/) |
| Smallest Subarray with Sum Greater Than a Given Value | Variable-size sliding window | [SmallestSubarraySumGreaterThanValue.java](SmallestSubarraySumGreaterThanValue.java) | Not available |
| Minimum Merge Operations to Make an Array Palindrome | Greedy two pointers | [MinimumMergeOperationsForPalindrome.java](MinimumMergeOperationsForPalindrome.java) | Not available |
| Find Pair with Sum in Sorted and Rotated Array | Circular two pointers | [PairSumSortedRotatedArray.java](PairSumSortedRotatedArray.java) | Not available |

## Pattern checklist

- [x] Opposite-direction pointers
- [x] Sorting + two pointers
- [x] Variable-size sliding window
- [x] Circular two-pointer traversal
- [ ] Same-direction / slow-fast pointers
- [ ] Fixed-size sliding window

## Input format

Each program runs independently. Enter the array size, then the array elements. If the problem needs a target, enter it after the array. All `main` methods read from standard input using `Scanner`; there are no hardcoded sample arrays.

**Important assumption:** The smallest-subarray sliding-window solution requires positive array elements, as stated in its problem description.
