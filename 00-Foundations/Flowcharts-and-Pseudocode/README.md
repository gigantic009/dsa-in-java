# Flowcharts and Pseudocode

**Theory-only foundation.** This folder teaches how to plan a solution before coding.

## Learn
- Read the statement; identify input, output, constraints and edge cases.
- Flowchart symbols: start/end, input/output, process, decision and arrows.
- Sequence, selection and iteration.
- Pseudocode conventions, indentation and meaningful variable names.
- Dry-run tables and tracing variables.
- Translate a plan into Java only after the logic is clear.

## Example: even or odd
```mermaid
flowchart TD
 A([Start]) --> B[/Read n/]
 B --> C{n % 2 == 0?}
 C -- Yes --> D[Print Even]
 C -- No --> E[Print Odd]
 D --> F([End])
 E --> F
```

```text
READ n
IF n is divisible by 2
    PRINT Even
ELSE
    PRINT Odd
END IF
```
