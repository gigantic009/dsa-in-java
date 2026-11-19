# Time and Space Complexity — A Beginner's Guide

Complexity describes how an algorithm's resource use changes as the input grows. It is not simply a stopwatch result: we study growth with input size.

## 1. What is n?
Always define the input size. For an array, n often means the number of elements; for a graph, it may involve both vertices V and edges E.

## 2. Time complexity
We estimate how many basic operations an algorithm performs as a function of input size.

| Growth | Name | Intuition |
|---|---|---|
| O(1) | Constant | Doesn't grow with input |
| O(log n) | Logarithmic | Repeatedly reduces the search space |
| O(n) | Linear | Visits each element roughly once |
| O(n log n) | Linearithmic | Common in efficient comparison sorting |
| O(n²) | Quadratic | Often all pairs or nested full loops |
| O(2ⁿ) | Exponential | Often explores every subset |
| O(n!) | Factorial | Often explores every permutation |

Big-O commonly describes an asymptotic upper bound; Big-Ω a lower bound; Big-Θ a tight bound. In algorithm discussions, be clear about the case (best, average, worst) being described.

## 3. Worked examples
### One loop
```java
for (int i = 0; i < n; i++) {
    System.out.println(i);
}
```
The loop body executes n times: O(n).

### Nested loops
```java
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        // Constant-time work.
    }
}
```
The inner body executes n × n times: O(n²).

### Halving
```java
int value = n;
while (value > 1) {
    value /= 2;
}
```
The number of halvings is proportional to log₂(n): O(log n).

## 4. Space complexity
Distinguish total space from auxiliary space. Auxiliary space is additional memory used by the algorithm. A recursive algorithm may use stack space even if it doesn't allocate an array.

## 5. Common traps
- Two consecutive loops are O(n) + O(n) = O(n), not O(n²).
- Different loop limits matter.
- Nested loops aren't automatically quadratic.
- Ignore constant factors for asymptotic classification, but don't ignore them in practical performance.
- Recursive calls need stack-space analysis.
- For graph algorithms, express complexity using V and E where appropriate.

## Practice (try before reading solutions)
1. Count operations in a loop from 0 to n−1.
2. Analyse two consecutive loops.
3. Analyse nested loops where the inner loop runs i times.
4. Analyse a loop that doubles i each iteration.
5. Compare linear search and binary search; state the binary-search precondition.
6. Compare recursive and iterative factorial space.
7. Explain why two recursive calls per level may lead to exponential work.

**Mastery check:** Given unfamiliar code, define n, count operations, state the bound, and explain your reasoning.
