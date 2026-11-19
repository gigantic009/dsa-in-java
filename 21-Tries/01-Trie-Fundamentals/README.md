# Trie Fundamentals

A trie is a tree that stores keys through shared prefixes. It is useful for prefix queries over strings and can be adapted for bitwise keys.

## Node design
Each node stores child references and metadata such as whether a complete word ends here. For a fixed alphabet, child arrays may be efficient; for flexible characters, maps may be appropriate.

## Operations
- Insert: walk/create nodes for each character; mark terminal.
- Search: walk the path and verify terminal.
- Prefix query: walk path and check that it exists, without requiring terminal.

For a word of length L, operations take O(L) time under typical assumptions.

## Practice
Implement insert/search/prefix, word and prefix counts, longest word with all prefixes, replace words and wildcard search.

## Pitfalls
- Distinguishing a prefix from a complete stored word.
- Correctly incrementing/decrementing counts if deletion is supported.
- Character indexing assumptions.
- Empty word behavior.

## Checkpoint
Insert several words sharing prefixes. Draw the node structure and implement prefix query.
