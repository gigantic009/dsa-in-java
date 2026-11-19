import java.util.*;

public class TransposeMatrix {
    // Transpose: rows become columns and columns become rows.
    // A new matrix allows this to work for rectangular matrices too.
    static int[][] transpose(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        int[][] result = new int[cols][rows];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                result[col][row] = matrix[row][col];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        System.out.println(Arrays.deepToString(transpose(matrix)));
    }
}
