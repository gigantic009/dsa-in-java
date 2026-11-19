# Time and Space Complexity — A Beginner's Guide

Complexity describes how an algorithm's resource use changes as input grows. It is not simply a stopwatch result: we study growth with input size, independent of a particular machine as much as possible.

## 1. Define the input size first
- For an array, n often means its number of elements.
- For a string, n may be the number of characters.
- For a graph, use both vertices (V) and edges (E) when they affect the work.
- For multiple inputs, use separate variables (e.g., m and n).

Always state what your variables represent before analyzing code.

## 2. Time complexity
Time complexity estimates how the number of operations grows with input size. We usually count dominant operations and simplify the resulting function asymptotically.

| Growth | Name | Intuition |
|---|---|---|
| O(1) | Constant | Work stays bounded as input grows |
| O(log n) | Logarithmic | Repeatedly reduces the search space by a fixed factor |
| O(n) | Linear | Work grows proportionally with input |
| O(n log n) | Linearithmic | Often efficient comparison sorting |
| O(n²) | Quadratic | Often all pairs or two full nested loops |
| O(n³) | Cubic | Often three nested loops over the same input |
| O(2ⁿ) | Exponential | Often explores combinations/subsets |
| O(n!) | Factorial | Often explores permutations |

Big-O commonly describes an asymptotic upper bound; Big-Ω a lower bound; Big-Θ a tight bound. In algorithm discussions, identify whether the bound is best, average, worst, or another case. Big-O alone does not automatically mean worst-case, though worst-case Big-O is common.

## 3. Simplifying expressions
When analyzing growth:
- Drop constant factors: 5n is O(n).
- Keep the dominant term: n² + 3n + 7 is O(n²).
- Do not confuse a practical constant cost with an asymptotic growth rate.
- State a useful bound, not a misleadingly loose one.

Examples: 3n + 20 -> O(n); 4n² + n + 10 -> O(n²); log₂(n) and log₁₀(n) differ only by a constant factor and both are O(log n).

## 4. Worked code examples

### A. Constant work
```java
int answer = a + b;
```
A fixed number of operations: O(1).

### B. One loop
```java
for (int i = 0; i < n; i++) {
    System.out.println(i);
}
```
The body executes n times: O(n).

### C. Two consecutive loops
```java
for (int i = 0; i < n; i++) { /* work */ }
for (int j = 0; j < n; j++) { /* work */ }
```
Total work is n + n = 2n: O(n), not O(n²).

### D. Nested loops
```java
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        // constant work
    }
}
```
The inner body runs n times for each of n outer iterations: n × n = n², or O(n²).

### E. Triangular nested loop
```java
for (int i = 0; i < n; i++) {
    for (int j = 0; j < i; j++) {
        // constant work
    }
}
```
The inner loop runs 0, 1, 2, ..., n-1 times. Total work is n(n-1)/2, which is O(n²). The loops are nested, but their limits are not both n on every iteration.

### F. Halving
```java
int value = n;
while (value > 1) {
    value /= 2;
}
```
The value halves each iteration. The number of iterations is proportional to log₂(n): O(log n).

### G. Doubling
```java
for (int i = 1; i < n; i *= 2) {
    // constant work
}
```
The sequence is 1, 2, 4, 8, ...; it takes O(log n) iterations to reach n.

### H. Two different bounds
```java
for (int i = 0; i < n; i++) {
    for (int j = 0; j < m; j++) {
        // constant work
    }
}
```
The body runs n × m times: O(nm). Don't replace m with n unless the problem defines them as equal.

## 5. Best, average and worst cases
An algorithm's cost may depend on the input arrangement.
- **Best case:** the most favorable input of a given size.
- **Worst case:** the least favorable input of a given size.
- **Average case:** expected cost under a stated input distribution.

Example: linear search on an array of n elements:
- Best case: target at first position -> O(1).
- Worst case: target absent or last -> O(n).
- Average case: depends on assumptions about target position; under a uniform position assumption, O(n).

## 6. Space complexity
Space complexity measures memory use as input grows. Distinguish:
- **Input space:** memory occupied by the supplied input.
- **Auxiliary space:** additional working memory used by the algorithm, often the focus in interview analysis.
- **Output space:** memory used to store the produced result; clarify whether it is counted.

Examples:
- A few scalar variables: O(1) auxiliary space.
- A new array of n elements: O(n) auxiliary space, if that allocation is additional.
- Recursive calls: the call stack contributes space.

## 7. Recursion and stack space
Consider recursive countdown:
```java
void countdown(int n) {
    if (n <= 0) return;
    countdown(n - 1);
}
```
There are n recursive calls before reaching the base case, with one active call per level: O(n) stack space. The depth is linear.

An iterative version using a loop may use O(1) auxiliary space because it does not grow a call stack with n.

For a recursion that splits input in half and has one recursive branch, depth is often O(log n), but analyze the recurrence and work per call rather than assuming every recursion is logarithmic.

## 8. Common traps
- Two consecutive loops add their work; they do not automatically multiply.
- Nested loops are not automatically quadratic: examine bounds and relationships.
- Loop limits may be n, m, n/2, or functions of the outer variable.
- A loop that doubles or halves a variable is often logarithmic.
- Recursive calls use stack space, even without explicit arrays.
- Space analysis should state whether input/output space is included.
- Big-O hides constants; constants can still matter in practical performance.
- For graphs, express bounds in terms of V and E where appropriate.
- Don't infer an algorithm's complexity from a single small run or timing measurement.

## 9. Guided practice (attempt before solutions/research)
1. Count the body executions in a loop from 0 to n-1.
2. Analyze two consecutive loops, each running n times.
3. Analyze nested loops where the inner loop runs i times.
4. Analyze a loop that doubles i each iteration.
5. Analyze a loop that halves n each iteration.
6. Analyze a nested loop with outer n and inner m.
7. Compare linear search and binary search; state binary search's precondition.
8. Compare iterative and recursive factorial space.
9. Explain why two recursive calls per level can lead to exponential work. Give a concrete recurrence such as T(n)=2T(n-1)+O(1), and solve/interpret it.
10. Given a new snippet, define the input size, count iterations, simplify the bound and explain the auxiliary space.

## 10. Mastery checklist
- [ ] I can define the input size before analyzing.
- [ ] I can recognize constant, logarithmic, linear, linearithmic, quadratic and exponential growth.
- [ ] I can count loop iterations and simplify expressions.
- [ ] I can distinguish sequential loops from nested loops.
- [ ] I can analyze nonuniform loop bounds.
- [ ] I can explain best, average and worst cases.
- [ ] I can distinguish input, output and auxiliary space.
- [ ] I can analyze recursion depth and stack usage.
- [ ] I can justify my answer instead of merely naming a Big-O.

**Study method:** explain the code in plain language, write an iteration trace, count the dominant work, simplify, then analyze additional memory.