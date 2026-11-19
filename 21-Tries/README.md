# Tries — Prefix Trees

## Prerequisites
Trees, references, arrays/maps, strings and recursion.

## 1. What is a trie?
A trie stores strings through shared prefix paths. Each node represents a prefix; a marker or field indicates whether a complete word ends there. A trie can provide prefix-oriented lookup without comparing every stored word from the beginning.

## 2. Node design
A node may contain children (often 26 children for lowercase English letters) and a boolean end-of-word marker. That 26-way design assumes the alphabet is restricted; maps or other representations support broader character sets.

## 3. Operations
- Insert a word
- Search for a complete word
- Check whether a prefix exists
- Remove a word (requires careful cleanup)
- Extend to autocomplete, wildcard search and XOR tries

## 4. Complexity
For a string of length L, operations typically take O(L), with memory depending on the number of created nodes and representation.

## Practice
Build insertion and search from scratch, then prefix search, a dictionary with wildcard handling and a maximum-XOR trie.

## Checkpoint
Draw trie paths for several words with shared prefixes. Explain why a prefix match is not necessarily a complete-word match and implement all basic operations.
