# Trie Fundamentals

A trie (prefix tree) stores strings by sharing nodes for common prefixes. It is useful for prefix lookup, dictionaries, autocomplete and related string problems.

## Node design
This implementation uses a 26-element child array for each node and a terminal flag. It supports only lowercase English letters (a-z). Other characters and null inputs are rejected. The empty string is supported.

## Operations
- **Insert:** create nodes along the path and mark the final node as a complete word.
- **Search:** follow the path and check the terminal flag.
- **Prefix query:** follow the path; terminal status is not required.

For a string of length L, these operations take O(L) time. Space is proportional to the nodes created (up to 26 child references per node).

## Example
Insert `apple` and `app`:
- `search("apple")` → true
- `search("app")` → true
- `search("ap")` → false (it is a prefix, not a stored word)
- `startsWith("ap")` → true
- `startsWith("")` → true (the root represents the empty prefix)

## Practice
Try word and prefix counts, longest word with all prefixes, replace words, wildcard search and autocomplete.

## Pitfalls
- Distinguishing a prefix from a complete stored word.
- Character-index assumptions and validation.
- Empty-string behavior.
- Duplicate insertions: marking a node terminal repeatedly does not create extra words.
- Deletion requires careful node cleanup.

## Checkpoint
Trace insertions of words with shared prefixes, draw the node structure, and explain why prefix lookup differs from exact search.
