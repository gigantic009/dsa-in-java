# Subarrays and Prefix Sums

## Outcomes
Distinguish subarrays from subsequences, compute range sums efficiently, recognize prefix-frequency patterns and understand Kadane's algorithm.

## Subarray vs subsequence
- **Subarray:** contiguous elements.
- **Subsequence:** elements chosen in order but not necessarily adjacent.

## Prefix sum
Define `prefix[i]` as the sum of elements from index 0 through i. Then a range sum from l through r can be computed from prefix sums in constant time after preprocessing.

Using a prefix array with an extra leading zero makes the formula especially clean:
`sum(l, r) = prefix[r + 1] - prefix[l]`.

## Prefix sums and HashMap
For the count of subarrays summing to k, let the running sum be s. A previous prefix sum of `s-k` means the intervening subarray has sum k. Store frequencies of encountered prefix sums. Initialize frequency of 0 to 1 to account for subarrays beginning at index 0.

## Kadane's algorithm
For maximum subarray sum, at each index decide whether to:
- extend the previous best ending-here subarray, or
- start a new subarray here.

`current = max(value, current + value)` and track the best seen. Initializing from the first element handles all-negative arrays correctly.

## Practice
### Warm-up
- Range Sum Query (prefix-sum preprocessing)
- Running Sum of 1D Array

### Core
- Maximum Subarray (Kadane)
- Subarray Sum Equals K
- Product of Array Except Self (prefix/suffix products)

### Challenge
- Maximum Product Subarray
- Count subarrays with a given XOR
- Difference-array range updates

## Common pitfalls
- Confusing subsequence with subarray.
- Forgetting the zero-prefix frequency initialization.
- Assuming the subarray-sum sliding window works with negative numbers.
- Returning zero for an all-negative maximum-subarray input when the task requires a nonempty subarray.

## Checkpoint
Implement prefix range sums, Kadane, and prefix sum + frequency map independently. Explain why each approach is correct.
