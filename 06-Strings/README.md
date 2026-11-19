# Strings in Java — Fundamentals and Problem Patterns

## Prerequisites
Java variables, arrays, loops, methods and complexity basics.

## 1. Strings in Java
A `String` represents text and is immutable: operations that appear to modify it produce another string. Repeated concatenation in loops can be costly; use `StringBuilder` when repeatedly constructing text.

## 2. Important operations
- `length()`, `charAt(i)`, `substring(a,b)`
- `equals()` vs `==` (content vs reference comparison)
- `toCharArray()`, `StringBuilder`
- Character classification and conversion
- Frequency arrays for known character ranges, maps for broader alphabets

## 3. Patterns
- Reverse and palindrome checks (two pointers)
- Frequency counting and anagrams
- Longest common prefix
- Remove/replace characters
- String rotation
- Substrings vs subsequences
- Fixed and variable sliding windows
- Longest substring without repetition
- Minimum window patterns
- Palindromic substring expansion
- Pattern matching: naive, KMP, Rabin–Karp and Z algorithm

## 4. Unicode caution
Java `char` represents a UTF-16 code unit, not always a complete Unicode code point. Many beginner algorithm problems constrain input to ASCII/lowercase English; make that assumption explicit when using a 26-element frequency array.

## Practice ladder
**Easy:** reverse, palindrome, count characters, toggle case (only when the input domain is defined), remove character, anagram.

**Medium:** group anagrams, longest substring without repeating characters, longest palindromic substring, string compression, permutation in string.

**Advanced:** KMP, Z-function, Rabin–Karp, minimum window substring and edit distance (DP).

## Checkpoint
- [ ] Explain immutability.
- [ ] Use `equals` correctly.
- [ ] Explain substring boundaries.
- [ ] Choose between char array, frequency array, map and StringBuilder.
- [ ] Distinguish substring from subsequence.
- [ ] Implement two-pointer and sliding-window string patterns.


## Sprint teaching expansion

Strings are immutable; Java indexes UTF-16 units. Clarify alphabet/Unicode; StringBuilder for repeated edits. Patterns: frequency, two pointers, windows, palindrome. Test empty, repeated, case, punctuation and Unicode.

Self-check: explain, trace, justify, implement, test boundaries and analyze complexity.
