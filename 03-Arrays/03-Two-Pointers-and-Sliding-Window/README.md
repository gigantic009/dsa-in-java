# Two Pointers and Sliding Window

These techniques reduce repeated work by organizing how indices move.

## Learning outcomes
After this chapter, you should be able to explain when two pointers are appropriate, distinguish fixed and variable windows, maintain a window invariant, and identify when a window technique is not valid.

## 1. Two pointers

Use two indices to represent positions or boundaries. The technique is especially useful when the input is sorted, when scanning from both ends, or when one pointer can move monotonically.

### Opposite-direction pointers
Start at both ends and move inward. Example: checking whether an array is a palindrome.

```java
static boolean isPalindrome(int[] a) {
    int left = 0, right = a.length - 1;
    while (left < right) {
        if (a[left] != a[right]) return false;
        left++;
        right--;
    }
    return true;
}
```

### Same-direction pointers
One pointer tracks the position to write or retain, another scans. Example: removing duplicates from a sorted array in-place.

### Sorted pair-sum pattern
If the sum is too small, increase the left pointer; if too large, decrease the right pointer. This decision is valid because the array is sorted.

## 2. Sliding window

A window is a contiguous range, often represented by `left` and `right`.

### Fixed-size window
For a window of length k:
1. Add the new right element.
2. Once the window exceeds k, remove the left element.
3. Update the answer when the window length equals k.

### Variable-size window
Expand right to include new elements; shrink left while the constraint is violated. **This common pattern requires a constraint whose validity can be restored by removing elements.** It is not automatically valid for arbitrary arrays with negative numbers.

## Dry run: maximum sum of k consecutive elements

Array `[2, 1, 5, 1, 3, 2]`, k = 3.

| Window | Sum |
|---|---:|
| 2 + 1 + 5 | 8 |
| 1 + 5 + 1 | 7 |
| 5 + 1 + 3 | 9 |
| 1 + 3 + 2 | 6 |

Answer: 9. Instead of recalculating each sum, subtract the outgoing element and add the incoming one.

## Implemented solution
- [Container With Most Water](ContainerWithMostWater.java) — use the two-pointer width and height trade-off to find the maximum area in O(n).

## Practice progression
### Warm-up
- Move Zeroes
- Remove Duplicates from Sorted Array
- Valid Palindrome

### Core
- Two Sum II (sorted input)
- Maximum Sum Subarray of Size K
- Longest Substring Without Repeating Characters

### Challenge
- Container With Most Water
- 3Sum
- Minimum Window Substring (after maps and variable windows)

## Common mistakes
- Using the two-pointer sum strategy on unsorted data without justification.
- Forgetting that windows must be contiguous.
- Shrinking a variable window in a problem where negative values invalidate the monotonic logic.
- Updating an answer before the window meets the intended size/constraint.

## Checkpoint
Explain the pointer invariant for each solved problem. Write a fixed-size and variable-size window from memory. Test k=1, k=n and boundary cases.
