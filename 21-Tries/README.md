# Tries — Prefix Trees

## Prerequisites
Trees, references, arrays/maps, strings and recursion.

## 1. What is a trie?
A trie stores strings through shared prefix paths. Each node represents a prefix; a terminal marker distinguishes complete words from prefixes. Tries are useful for dictionaries, autocomplete, prefix queries and some bitwise problems.

## 2. Node design
Nodes can store child references and metadata. A 26-child array is efficient for lowercase English letters but restricts the alphabet; maps can support more flexible character sets.

## 3. Operations
- Insert a word
- Search for a complete word
- Check whether a prefix exists
- Remove a word (requires careful cleanup)
- Extend to autocomplete, wildcard search, grid word search and XOR tries

## 4. Complexity
For a string of length L, insert, search and prefix lookup typically take O(L) time. Memory depends on the nodes created and the child representation.

## Practice
Implement basic insertion and search, then prefix queries, wildcard search, autocomplete, grid word search and maximum-XOR patterns.

## Checkpoint
Draw trie paths for words sharing prefixes. Explain why a prefix match is not necessarily a complete-word match. Trace empty strings and invalid characters, and analyze complexity.
