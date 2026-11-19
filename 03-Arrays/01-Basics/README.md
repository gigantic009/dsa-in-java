# Array Fundamentals

## Theory
- Declaration, initialization, indexing and traversal.
- Length, update, insertion/deletion by shifting.
- Min/max, reverse, rotate and linear search.
- Reference semantics and arrays as method arguments.

## Implemented solutions
- [Find minimum and maximum](ArrayMinMax.java)
- [Reverse an array in place](ReverseArray.java)

## Question checklist (Easy → Medium)
> These are the planned practice questions for this subtopic. A question is marked implemented only when its standalone Java file is committed here.

### Easy
- [x] Find minimum and maximum — `ArrayMinMax.java`
- [x] Reverse an array in place — `ReverseArray.java`
- [ ] Linear search for a target
- [ ] Check whether an array is sorted (non-decreasing)
- [ ] Find the second-largest distinct element
- [ ] Count occurrences of a given element
- [ ] Copy an array
- [ ] Insert an element at a given index (shifting)
- [ ] Delete an element at a given index (shifting)
- [ ] Left rotate an array by one position
- [ ] Right rotate an array by one position
- [ ] Left rotate an array by k positions
- [ ] Move all zeroes to the end (preserve order)
- [ ] Remove duplicates from a sorted array (in-place)

### Medium
- [ ] Merge two sorted arrays
- [ ] Union of two sorted arrays
- [ ] Intersection of two arrays
- [ ] Rearrange array elements alternately (where constraints permit)
- [ ] Leaders in an array
- [ ] Equilibrium index / pivot index

## Sources and company tags
- Problem descriptions and constraints should be linked to their original sources when each solution file is added.
- Company tags are added only when supported by credible interview reports or company-tagged problem databases; otherwise marked **Not verified**.


## Mini lesson: traversal and the running maximum

Suppose the input is `[7, 2, 9, 4]` and you want the largest value. Do not sort the array: sorting changes more information than you need and costs more time.

### Idea

Keep a variable named `maximum`. Initialize it using the first element, then visit each remaining element. If the current element is larger, replace `maximum`. After the loop, the variable contains the largest value seen so far.

### Trace

| Index | Value | Maximum before | Action | Maximum after |
|---:|---:|---:|---|---:|
| 0 | 7 | — | initialize | 7 |
| 1 | 2 | 7 | 2 is not larger | 7 |
| 2 | 9 | 7 | update | 9 |
| 3 | 4 | 9 | keep | 9 |

### Java example

```java
public class RunningMaximum {
    public static int maximum(int[] values) {
        if (values == null || values.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }
        int max = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i] > max) {
                max = values[i];
            }
        }
        return max;
    }
}
```

### Why it works

After processing index `i`, the variable `max` is the greatest value among indices `0` through `i`. This is the loop invariant. Each new value either becomes the maximum or leaves the current maximum unchanged. When the loop ends, every element has been considered, so `max` is the array's maximum.

- **Time:** O(n), because each element is considered at most once.
- **Extra space:** O(1), because only a fixed number of variables are used.
- **Edge cases:** a single element; all negative values; repeated maximum values; empty array (rejected); null (rejected).

### Try before looking at other solutions

1. Change the method to return the minimum instead.
2. Return both minimum and maximum (decide how you want to represent the result).
3. Find the second-largest distinct value. What should happen when there is no second distinct value?
4. Count how many values are greater than a threshold `k`.

