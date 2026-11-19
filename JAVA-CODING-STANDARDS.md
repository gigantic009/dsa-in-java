# Java Coding Standards for This Repository

These conventions make examples easier for beginners to read and reuse.

## Standalone learning examples

- Use descriptive class, method, and variable names.
- Include a short comment describing the algorithm's idea, not every obvious line.
- Where appropriate, include a runnable `main` method and input/output demonstration.
- Avoid unexplained magic values.
- Validate assumptions when the example is meant to be robust.
- Use Java standard-library structures appropriately (`ArrayDeque`, `HashMap`, `HashSet`, `PriorityQueue`, etc.).
- Keep each example focused on one concept.

## Online judge solutions

- Preserve the required method signature and class structure for the judge.
- Do not add input/output code if the judge expects a method-only solution.
- State assumptions and edge cases in nearby documentation.

## Every solution should ideally document

1. Problem statement or link (when available and verified).
2. Input/output and constraints.
3. Idea and why it works.
4. Algorithm steps.
5. Complexity.
6. Edge cases.
7. Runnable example or tests.

## Correctness and safety

- Prefer clear code over clever tricks.
- Avoid integer overflow; use `long` where justified.
- Avoid relying on undefined assumptions such as sorted input unless stated.
- For sorting comparators, beware subtraction overflow; use comparison utilities.
- For recursion, consider depth and stack limits.
- Do not label a solution tested unless it has actually been tested.
- Do not invent company tags, problem IDs, or source links.
