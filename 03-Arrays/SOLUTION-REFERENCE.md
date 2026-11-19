# Arrays — Solution Reference

This reference records the expected complexity and input assumptions for the canonical implementations in this branch. All Java programs are standalone and read input from standard input.

| Solution | Time | Auxiliary space | Important assumption |
|---|---:|---:|---|
| 3Sum | O(n²) | O(1) auxiliary, excluding sort | Unique triplets; sorted internally |
| Best Time to Buy and Sell Stock | O(n) | O(1) | One transaction |
| Container With Most Water | O(n) | O(1) | Non-negative heights |
| Contains Duplicate | O(n) average | O(n) | Hash set |
| Given Sum Pair | O(n) average | O(n) | Any pair; int values |
| Maximum and Minimum | O(n) | O(1) | Non-empty input |
| Mo's Algorithm | O((n+q)√n) typical | O(q) | Zero-based inclusive query ranges; static array |
| Combinations of r | O(C(n,r)·r) | O(r) recursion/output | Distinct positions, not distinct values |
| Product Except Self | O(n) | O(1) auxiliary excluding output | Products fit in long |
| Repeat and Missing | O(n) | O(1) | Exactly one duplicate and one missing in 1..n |
| Space Optimisation / Single Number | O(n) | O(1) | **Interpretation used:** every value occurs twice except one |
| Largest Number | O(n log n · k) | O(n·k) | Non-negative integer tokens; k is token length |
| Reverse Array | O(n) | O(1) | In-place |
| Trapping Rain Water | O(n) | O(1) | Non-negative heights |
| All Pairs With Given Sum | O(n log n) | O(n) | Prints distinct value pairs |
| Common Elements in Three Sorted Arrays | O(n+m+k) | O(output) | All three inputs sorted |
| Duplicate in N+1 Integers | O(n) | O(1) | Values in 1..n; one repeated value |
| Large Factorial | O(n) multiplications | O(result digits) | BigInteger |
| Maximum/Minimum (alternate wording) | O(n) | O(1) | Non-empty input |
| Triplet Sum | O(n²) | O(1) auxiliary, excluding sort | Checks existence of a target-sum triplet |
| Union and Intersection | O(n+m) | O(output) | Both inputs sorted |
| Array Subset | O(n+m) average | O(n) | Multiplicity/frequency respected |
| More Than n/k | O(n + u log u) | O(u) | u is number of distinct values |
| Sort 0, 1, 2 | O(n) | O(1) | Input contains only 0, 1, 2 |
| Kadane / Maximum Subarray | O(n) | O(1) | Non-empty array |
| Maximum Profit — Two Transactions | O(n) | O(n) | At most two transactions |
| Median of Two Sorted Arrays | O(log(min(n,m))) | O(1) | Both arrays sorted |
| Median of Equal-Size Sorted Arrays | O(n) | O(1) | Both arrays sorted and equal length |
| Minimise Maximum Height Difference | O(n log n) | O(1) auxiliary, excluding sort | Non-negative starting heights |
| Minimum Jumps | O(n) | O(1) | Non-negative jump lengths |
| Make Array Palindrome — Adjacent Swaps | O(n²) | O(n) frequency map | **Interpretation used:** minimum adjacent swaps; impossible if >1 odd frequency |
| Minimum Swaps to Group Values ≤ K | O(n) | O(1) | Groups values <= k |
| Move Negatives to One Side | O(n) | O(1) | Relative order is not preserved |
| Alternate Positive and Negative | O(n²) worst case | O(1) | In-place; relative order is not preserved |
| Three-Way Partition | O(n) | O(1) | Partitions into < low, [low, high], > high |
| Find Minimum in Rotated Sorted Array | O(log n) typical, O(n) with many duplicates | O(1) | Rotated non-decreasing array |
| Merge Operations to Make Palindrome | O(n) | O(1) | Non-negative values; adjacent merge by sum |
| Pair Sum in Sorted & Rotated Array | O(n) | O(1) | Sorted array rotated at most once |
| Kth Smallest | O(n log n) | O(1) auxiliary, excluding sort | Counts duplicates as separate positions |
| Kth Largest | O(n log n) | O(1) auxiliary, excluding sort | Counts duplicates as separate positions |
| Maximum Product Subarray | O(n) | O(1) | Product fits in long |
| Next Permutation | O(n) | O(1) | Mutates input array |
| Search Rotated Sorted Array | O(log n) | O(1) | Distinct values |
| Subarray Sum Divisible by K | O(n) average | O(min(n,|k|)) | k must be non-zero |
| Count Inversions | O(n log n) | O(n) | Counts strict inversions |
| Zero-Sum Subarray | O(n) average | O(n) | Detects non-empty subarray |
| Longest Consecutive Sequence | O(n) average | O(n) | Unsorted integer array |
| Merge Sorted Arrays In Place | O((n+m) log(n+m)) | O(1) | Both inputs sorted; Shell-gap method |
| Merge Intervals | O(n log n) | O(n) | Each interval has start <= end |
| Smallest Subarray Sum > Target | O(n) | O(1) | **Requires positive array elements** |
| Cyclic Rotate by One | O(n) | O(1) | Right rotation |

## Input conventions

For an array, enter its length followed by its elements. If a problem needs a target, k, or another parameter, enter it after the array unless the source file's header specifies otherwise. For multiple arrays, enter each length followed by that array's values.

## Source wording that needs confirmation

Two titles in the workbook are underspecified:
- **Space Optimization Using Bit Manipulations:** the workbook title does not state the actual task. The current implementation demonstrates the standard single-number XOR pattern (all values occur twice except one).
- **Minimum operations required to make an array palindrome:** the title does not define the allowed operation. The current implementation interprets one operation as one adjacent swap. The separate merge-operations problem is implemented independently.

These interpretations are documented rather than presented as facts from the question wording.