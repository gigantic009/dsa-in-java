# String & Advanced DP

## Implemented
- [LongestCommonSubsequence.java](LongestCommonSubsequence.java) — LeetCode 1143; LCS length.

## Medium
- [x] Longest common subsequence
- [ ] Longest palindromic subsequence
- [ ] Longest common substring
- [ ] Wildcard matching

## Hard
- [ ] Edit distance
- [ ] Distinct subsequences
- [ ] Regex matching
- [ ] Palindrome partitioning II
- [ ] Burst balloons
- [ ] Matrix chain multiplication

LCS recurrence: matching characters extend the diagonal; otherwise take the maximum after skipping one character from either prefix. Complexity: O(m*n) time and space.

Practice reconstructing an actual subsequence and then implement Edit Distance.