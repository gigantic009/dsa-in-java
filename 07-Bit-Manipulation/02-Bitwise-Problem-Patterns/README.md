# Bitwise Problem Patterns

## Practice
Check/set/clear/toggle ith bit; odd/even; power of two; count set bits; unique number using XOR; generate subsets with bit masks.


## Complexity and constraints
- Count set bits (Brian Kernighan): O(k), where k is the number of set bits; O(1) auxiliary space.
- Power of two: O(1) time and space.
- Single Number: O(n) time, O(1) extra space; assumes exactly one value occurs once and all others occur twice.
- Generate subsets: O(n * 2^n) time and output space. The implementation intentionally caps input at 20 elements to avoid excessive allocation.

For subset masks, bit i corresponds to element i. For example, mask `0101` selects elements at indices 0 and 2.
