import java.util.*;

public class SetMatrixZeroes {
    // Use the first row and column as markers to avoid extra arrays.
    static void setZeroes(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        boolean firstRow = false, firstCol = false;

        // Check whether the first column originally contains a zero.
        for (int row = 0; row < rows; row++) {
            if (matrix[row][0] == 0) firstCol = true;
        }

        // Check whether the first row originally contains a zero.
        for (int col = 0; col < cols; col++) {
            if (matrix[0][col] == 0) firstRow = true;
        }

        // Mark zero-containing rows and columns using the first row/column.
        for (int row = 1; row < rows; row++) {
            for (int col = 1; col < cols; col++) {
                if (matrix[row][col] == 0) {
                    matrix[row][0] = 0;
                    matrix[0][col] = 0;
                }
            }
        }

        // Set marked rows to zero.
        for (int row = 1; row < rows; row++) {
            if (matrix[row][0] == 0) {
                for (int col = 1; col < cols; col++) matrix[row][col] = 0;
            }
        }

        // Set marked columns to zero.
        for (int col = 1; col < cols; col++) {
            if (matrix[0][col] == 0) {
                for (int row = 1; row < rows; row++) matrix[row][col] = 0;
            }
        }

        // Apply the saved information for the original first row/column.
        if (firstRow) Arrays.fill(matrix[0], 0);
        if (firstCol) {
            for (int row = 0; row < rows; row++) matrix[row][0] = 0;
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };

        setZeroes(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
}
