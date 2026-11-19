# Trie Patterns

These patterns build on trie fundamentals. The current code folder contains a trie-building utility used as a foundation for grid word-search and dictionary traversal problems.

## Practice roadmap
- [ ] Maximum XOR pair (bitwise trie)
- [ ] Word dictionary with wildcard search
- [ ] Search suggestions / autocomplete
- [ ] Maximum XOR queries
- [ ] Word squares
- [ ] Word Search II (grid DFS + trie pruning)

## Foundation
`WordSearchTrie.java` builds a trie from lowercase words and stores each word at its terminal node. This makes it possible for recursive grid traversal to stop early whenever the current path is not a valid dictionary prefix.

## Complexity
Building a trie from words with a total of T characters takes O(T) time and O(T) nodes in the worst case, assuming a fixed alphabet and constant-sized child arrays.

## Next step
Extend the builder with DFS over a character grid, mark visited cells during recursion, and restore the visited state when backtracking. Use terminal-word clearing or a result set to avoid reporting the same word multiple times.
