# Recursion Patterns
## Easy
- [ ] Binary string generation
- [ ] Subsequences
## Medium
- [ ] Subsets / subsets with duplicates
- [ ] Permutations
- [ ] Combination sum
- [ ] Phone keypad combinations
- [ ] Palindrome partitioning
- [ ] Rat in a maze
## Hard
- [ ] N-Queens
- [ ] Sudoku solver
- [ ] Word search

## Pattern complexity
- Binary strings without consecutive ones: output count grows exponentially; recursion depth O(n).
- Subsets: O(2^n) outputs and O(n) recursion depth (excluding output storage).
- Permutations: O(n * n!) time to copy each permutation, with O(n) recursion depth (excluding output storage). Duplicate input values can produce duplicate permutations; this implementation does not deduplicate.

The subset and permutation methods require a non-null input array.
