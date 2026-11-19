# Hashing and Frequency

Hash tables support fast average-case lookup and insertion by key. Java's `HashMap` stores key-value associations; `HashSet` stores unique values.

## 1. Frequency counting
For a small, known integer or character range, an array may be simpler than a map. For general keys, use a map.

```java
Map<Integer, Integer> frequency = new HashMap<>();
for (int value : values) {
    frequency.put(value, frequency.getOrDefault(value, 0) + 1);
}
```

## 2. Set membership
A set answers whether an item has already been seen. This often converts repeated linear searches into average constant-time membership checks.

## 3. Hashing and complexity
Hash-table operations are typically O(1) average, but are not guaranteed O(1) in every circumstance. The key must obey consistent equals/hashCode behavior when used in Java maps and sets.

## 4. Pattern recognition
- Need to know whether an element exists? Set.
- Need counts? Map.
- Need to group items by a shared signature? Map from signature to collection.
- Need to count prefix sums encountered so far? Map of prefix value to frequency.

## Practice
### Warm-up
- Contains Duplicate
- Valid Anagram
- Frequency of Elements

### Core
- Two Sum
- Majority Element
- First Non-Repeating Character
- Group Anagrams
- Intersection of Arrays

### Challenge
- Longest Consecutive Sequence
- Subarray Sum Equals K
- Four Sum (combine sorting and duplicate control)

## Common mistakes
- Assuming map iteration order is sorted.
- Modifying a collection while iterating in ways that invalidate the iterator.
- Using a mutable key whose hash/equality changes after insertion.
- Forgetting that collisions exist and hash-based complexity is average-case.

## Checkpoint
Implement frequency counting, duplicate detection and Two Sum. Explain when a frequency array is preferable to a HashMap.
