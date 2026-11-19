# Matrix Problem Patterns

A matrix is commonly represented as a two-dimensional array in Java. Rows can be jagged, so algorithms that require a rectangular matrix should state that assumption.

## Traversal patterns
- Row-wise and column-wise traversal
- Boundary traversal
- Spiral traversal using four boundaries
- Diagonal traversal

## Search patterns
- Binary search within a row when rows are independently sorted.
- Flattened binary search when rows and columns jointly guarantee one globally sorted sequence.
- Staircase search from a corner in a matrix sorted independently across rows and columns.

## Transformations
- Transpose: exchange row and column coordinates.
- Rotate a square matrix clockwise: transpose, then reverse each row.
- Set Matrix Zeroes: mark affected rows and columns, then apply marks. The first row/column marker technique avoids allocating another matrix.

## Practice ladder
### Easy
- Search in a globally sorted matrix
- Row with maximum ones

### Core
- Search in a row/column sorted matrix
- Set Matrix Zeroes
- Rotate Matrix
- Spiral Matrix

### Challenge
- Number of Islands (DFS/BFS connectivity)
- Maximal Rectangle
- Shortest Path in Binary Matrix
- Word Search (backtracking)

## Checkpoint
Trace algorithms on a single row, single column, rectangular matrix, and square matrix. Carefully check when boundaries cross.
