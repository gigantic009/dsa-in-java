import java.util.Arrays;
import java.util.Scanner;

public class TransposeMatrix {
    // A rectangular matrix needs a new array because row/column dimensions swap.
    // Original (row, col) becomes transposed (col, row).
    static int[][] transpose(int[][] matrix) {
        if (matrix == null || matrix.length == 0
                || matrix[0] == null || matrix[0].length == 0) {
            return new int[0][0];
        }

        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] result = new int[cols][rows];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                result[col][row] = matrix[row][col];
            }
        }
        return result;
    }

    static int[][] readMatrix(Scanner sc) {
        System.out.print("Rows: ");
        int rows = sc.nextInt();
        System.out.print("Columns: ");
        int cols = sc.nextInt();

        if (rows <= 0 || cols <= 0) {
            throw new IllegalArgumentException("Dimensions must be positive");
        }

        int[][] matrix = new int[rows][cols];
        System.out.println("Enter matrix elements row-wise:");
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = sc.nextInt();
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = readMatrix(sc);
        System.out.println(Arrays.deepToString(transpose(matrix)));
        sc.close();
    }
}