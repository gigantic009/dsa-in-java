# Matrix Problem Patterns

Matrices are arrays of arrays. For Java, remember that a two-dimensional array is an array whose rows may have different lengths; do not assume a rectangular shape unless the input guarantees it.

## Traversal patterns
- Row-wise and column-wise traversal
- Boundary traversal
- Spiral traversal using four boundaries
- Diagonal traversal

## Search patterns
- Binary search within a row when rows are independently sorted.
- Treat a matrix as a flattened array when rows and columns jointly guarantee sorted order and indexing maps cleanly.
- For row/column sorted matrices, start at a corner where each move eliminates a row or column.

## Transformations
- Transpose: exchange row and column coordinates.
- Rotate 90° clockwise (square matrix): transpose, then reverse each row, or use a boundary rotation approach.
- Set Matrix Zeroes: mark affected rows and columns, then apply the marks; learn the in-place marker variant after understanding the extra-space approach.

## Practice
### Easy
- Search in a row-wise sorted matrix
- Row with maximum ones

### Core
- Search in a row/column sorted matrix
- Set Matrix Zeroes
- Rotate Matrix
- Spiral Matrix

### Challenge
- Number of Islands (connectivity introduces DFS/BFS)
- Maximal Rectangle
- Shortest Path in Binary Matrix
- Word Search (backtracking)

## Checkpoint
Implement a matrix traversal and rotation. Trace boundaries carefully for 1-row, 1-column and square/non-square cases.
