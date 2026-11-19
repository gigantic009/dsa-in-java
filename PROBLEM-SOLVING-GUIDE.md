# Problem-Solving Guide

This guide is for learners who are new to coding problems. Use it every time you solve a problem.

## The 8-step routine

1. **Read twice.** Restate the task in your own words. What is given? What must be returned or printed?
2. **Extract examples.** Write input, output, and why that output follows.
3. **Ask about constraints.** Sizes, value ranges, sortedness, duplicates, negative values, empty input, and time limits determine the approach.
4. **Try a tiny case.** Trace 1–3 elements by hand. Include an edge case.
5. **Build a brute-force solution.** Make it correct before trying to make it fast.
6. **Find the bottleneck.** What work repeats? Can a data structure, invariant, prefix, pointer, or search eliminate it?
7. **Prove your idea informally.** State why it works and what your loop invariant or state means.
8. **Test, then explain.** Dry-run, test edge cases, analyze time/space, and explain the solution aloud.

## Before coding checklist

- [ ] I can explain the problem without copying the statement.
- [ ] I know the input constraints.
- [ ] I have identified edge cases.
- [ ] I have a brute-force idea.
- [ ] I can justify my improved approach.
- [ ] I know what each variable represents.
- [ ] I have tests beyond the sample.
- [ ] I can explain the complexity.

## Testing checklist

For arrays/strings, consider:
- empty input (if allowed), one item, two items
- duplicates and all-equal values
- already sorted and reverse sorted
- negative, zero and positive values
- target absent, first, middle, last
- maximum constraint and overflow risk

For graphs:
- disconnected graph, isolated vertices, self-loop if allowed
- parallel edges if allowed, cycle, tree, directed vs undirected
- negative weights (especially for shortest paths)
- start vertex not in the largest component

For recursion:
- base case
- smallest input
- whether recursive calls progress toward base cases
- stack depth
- repeated subproblems

## If you are stuck

After 20–30 minutes of serious effort, use hints progressively:
1. Restate the problem and identify the data structure.
2. Ask for a hint about the pattern.
3. Ask for a dry-run of a small example.
4. Read the solution only after attempting it.
5. Close the solution and implement from memory.
6. Re-solve in 1 day, 1 week, and 3 weeks.

Being stuck is part of learning; copying is not a substitute for retrieval practice.
