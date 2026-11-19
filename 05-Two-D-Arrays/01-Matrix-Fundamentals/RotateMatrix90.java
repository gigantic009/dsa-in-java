import java.util.*;

public class RotateMatrix90 {
    // Rotate a square matrix clockwise: transpose, then reverse each row.
    static void rotate(int[][] matrix) {
        int n = matrix.length;

        // Transpose the matrix.
        for (int row = 0; row < n; row++) {
            for (int col = row + 1; col < n; col++) {
                int temp = matrix[row][col];
                matrix[row][col] = matrix[col][row];
                matrix[col][row] = temp;
            }
        }

        // Reverse every row.
        for (int[] row : matrix) {
            for (int left = 0, right = n - 1; left < right; left++, right--) {
                int temp = row[left];
                row[left] = row[right];
                row[right] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        rotate(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
}
