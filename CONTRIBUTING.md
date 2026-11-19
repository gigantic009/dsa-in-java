# Learning and Code Quality Standards

## Teaching standard
A beginner should never be expected to infer a missing prerequisite. Lessons should define unfamiliar terms, include a simple analogy where helpful, show a worked example, and provide practice before advanced problems.

## Java solution standard
- Use readable indentation and descriptive identifiers.
- Standalone runnable examples must read necessary data from standard input.
- Platform solution files must retain expected signatures and avoid unnecessary prompts.
- Add comments to explain meaningful decisions, invariants, tricky loops and recursive transitions.
- Prefer standard Java collections where they clarify the algorithm; explain the structure before using it.
- Avoid overly clever or compressed code.

## Test standard
Where applicable, test:
- Empty and single-element input
- Duplicates
- Negative values
- Already sorted / reverse sorted
- Boundary indices
- Overflow risks
- Invalid or impossible input, where validation is part of the program
- Large input / complexity considerations

## Explanation standard for problem pages
Each problem explanation should include:
1. Problem restatement and assumptions
2. Examples and edge cases
3. Intuition
4. Brute-force baseline (when useful)
5. Optimized approach
6. Correctness reasoning or invariant
7. Complexity
8. Java solution
9. Test cases / dry run
10. Related problems / next concept

## Course lesson standard
Each topic README should contain learning objectives, prerequisites, concept explanations, examples, diagrams/trace tables as useful, practice, checkpoints and links.

## Accuracy and attribution
Do not invent company interview attribution, source links, question titles, tests, or completion status. Separate verified from inferred information.
