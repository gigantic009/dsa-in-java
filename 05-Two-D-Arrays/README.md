# 2D Arrays and Matrices — Learn from the Ground Up

## Prerequisites
Understand 1D arrays, loops, nested loops and array indexing.

## 1. What is a 2D array?
A Java 2D array is an array whose elements are references to row arrays. Rows may have different lengths (a jagged array). `matrix.length` counts rows while `matrix[row].length` counts the cells in that row.

```java
int[][] matrix = {
    {10, 20, 30},
    {40, 50, 60}
};
```

Indices begin at zero. The element at row 1, column 2 is 60.

## 2. Traversal
```java
for (int row = 0; row < matrix.length; row++) {
    for (int col = 0; col < matrix[row].length; col++) {
        System.out.print(matrix[row][col] + " ");
    }
    System.out.println();
}
```
The outer loop selects a row; the inner loop visits its cells. For an r × c rectangular matrix, this is O(rc) time.

## 3. Common patterns
- Row traversal and row sums
- Column traversal and column sums
- Main and secondary diagonals (square matrices)
- Transpose
- Rotation by 90 degrees
- Spiral traversal
- Staircase search in sorted rows and columns
- Matrix prefix sums and range queries

## 4. Transpose
For a square matrix, swapping `matrix[i][j]` with `matrix[j][i]` only above the diagonal avoids swapping twice. For rectangular matrices, construct a new matrix with reversed dimensions.

## 5. Rotation
A common square-matrix 90-degree clockwise rotation strategy is transpose followed by reversing each row. Trace a 3×3 example before coding.

## 6. Search in sorted matrix
Do not assume every matrix is sorted in the same way. A globally sorted matrix supports flattened binary search; a row/column sorted matrix can use staircase search. State the precondition before choosing an algorithm.

## 7. Implementation contracts and complexity

| Implementation | Input contract | Time | Extra space |
|---|---|---|---|
| Rotate 90° clockwise | Square matrix | O(n²) | O(1) |
| Flattened binary search | Rectangular matrix sorted globally row-wise | O(log(rc)) | O(1) |
| Set Matrix Zeroes | Rectangular matrix | O(rc) | O(1) |
| Spiral traversal | Rectangular matrix | O(rc) | O(1), excluding result |
| Transpose | Rectangular matrix | O(rc) | O(rc) for output |

These implementations do not validate every row of a jagged array. Use them only when their listed shape and ordering preconditions hold. The Java 2D-array model itself permits jagged rows; an algorithm's contract must state when that flexibility is not supported.

## Practice ladder
1. Print all cells.
2. Sum each row and column.
3. Find largest and smallest.
4. Print diagonals.
5. Transpose.
6. Rotate 90 degrees.
7. Spiral traversal.
8. Search in row-sorted matrix.
9. Search in globally sorted matrix.
10. Matrix prefix sum.

## Checkpoint
- [ ] Explain row and column indices.
- [ ] Handle jagged-array row lengths safely.
- [ ] Traverse in O(rows × columns).
- [ ] Implement transpose and rotation.
- [ ] Explain the preconditions for each search technique.
- [ ] Solve three unseen matrix problems.

## Self-check
Explain the approach, trace it by hand, justify each boundary or marker, implement it, test edge cases and analyze complexity.
