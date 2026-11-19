# Beginner Checkpoint 1 — Foundations, Java and Arrays

Use this checkpoint after studying Foundations, Java Basics, Complexity and Array Fundamentals. Try it without looking at the answer key first. Suggested time: 45–60 minutes. This is a self-study checkpoint, not a graded or official exam.

## Part A — Explain (short answers)

1. What is the difference between an algorithm and a program?
2. What are input, output and constraints in a problem statement?
3. Why should you trace code with a small input before coding?
4. Explain the difference between an array's index and its value.
5. Why is initializing a maximum with 0 unsafe if an array may contain negative values?
6. Explain why a single loop over n values is O(n), and why two nested loops over n values are commonly O(n²).

## Part B — Trace

### 7. What is printed?

```java
int[] a = {4, 7, 2, 9};
int sum = 0;
for (int i = 0; i < a.length; i++) {
    sum += a[i];
}
System.out.println(sum);
```

### 8. What is printed?

```java
int[] a = {5, 3, 8, 1};
int max = a[0];
for (int i = 1; i < a.length; i++) {
    if (a[i] > max) max = a[i];
}
System.out.println(max);
```

### 9. Identify the bug

```java
int[] a = {2, 4, 6};
for (int i = 0; i <= a.length; i++) {
    System.out.println(a[i]);
}
```

### 10. What is the final value of count?

```java
int count = 0;
for (int i = 1; i <= 5; i++) {
    if (i % 2 == 1) count++;
}
```

## Part C — Implement

11. Write a method to return the sum of an integer array.
12. Write a method to find the minimum value, handling an empty array deliberately.
13. Write a method that returns whether an array is non-decreasing.
14. Write a method that counts how many times a target occurs.
15. Reverse an array in place.
16. Find the second-largest distinct value; define what you return if it does not exist.

## Part D — Complexity and reasoning

17. What is the time and auxiliary space complexity of finding a maximum using one traversal?
18. What is the time complexity of this code?

```java
for (int i = 0; i < n; i++) {
    for (int j = 0; j < 5; j++) {
        work();
    }
}
```

19. What cases would you test for a reverse-array method?
20. Explain the loop invariant for finding the maximum in an array.

## Answer key — use after attempting

1. An algorithm is the logical procedure; a program is its implementation in a language and environment.
2. Input is supplied information, output is the required result, constraints restrict sizes/ranges/conditions.
3. Small traces expose misunderstandings, off-by-one errors and states before implementation.
4. Index is the position (typically zero-based in Java); value is the element stored at that position.
5. All values might be negative, so zero would incorrectly appear larger than every array element.
6. A single traversal performs proportional work; nested loops often multiply the work counts.
7. 22.
8. 8.
9. The condition should be i < a.length; <= accesses index a.length and throws an exception.
10. 3 (1, 3 and 5 are odd).
11–16. Evaluate using correctness, clear edge-case behavior, and test evidence; multiple implementations may be valid.
17. O(n) time and O(1) auxiliary space.
18. O(n), because the inner loop executes a fixed 5 times per outer iteration.
19. Empty, single element, two elements, duplicates, odd/even lengths, negative values, and typical input.
20. After processing index i, the stored maximum equals the maximum of all elements seen from index 0 through i.

## Mastery gate

Before marking this checkpoint complete, implement questions 11–16 without copying, test them yourself, explain the complexity and the edge cases, and revisit at least one solution the following day.
