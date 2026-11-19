import java.util.Arrays;
import java.util.Scanner;

public class SetMatrixZeroes {
    // O(1) extra space: the first row and column act as marker storage.
    // Separate flags preserve whether those boundary lines originally contained 0.
    static void setZeroes(int[][] matrix) {
        if (matrix == null || matrix.length == 0
                || matrix[0] == null || matrix[0].length == 0) {
            return;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean firstRowHasZero = false;
        boolean firstColHasZero = false;

        // Remember the original zeroes in the first column.
        for (int row = 0; row < rows; row++) {
            if (matrix[row][0] == 0) {
                firstColHasZero = true;
            }
        }

        // Remember the original zeroes in the first row.
        for (int col = 0; col < cols; col++) {
            if (matrix[0][col] == 0) {
                firstRowHasZero = true;
            }
        }

        // Mark the corresponding first-row/first-column cells for interior zeroes.
        for (int row = 1; row < rows; row++) {
            for (int col = 1; col < cols; col++) {
                if (matrix[row][col] == 0) {
                    matrix[row][0] = 0;
                    matrix[0][col] = 0;
                }
            }
        }

        // Apply row markers to interior cells.
        for (int row = 1; row < rows; row++) {
            if (matrix[row][0] == 0) {
                for (int col = 1; col < cols; col++) {
                    matrix[row][col] = 0;
                }
            }
        }

        // Apply column markers to interior cells.
        for (int col = 1; col < cols; col++) {
            if (matrix[0][col] == 0) {
                for (int row = 1; row < rows; row++) {
                    matrix[row][col] = 0;
                }
            }
        }

        // Finally clear the boundary lines if they originally contained a zero.
        if (firstRowHasZero) {
            Arrays.fill(matrix[0], 0);
        }
        if (firstColHasZero) {
            for (int row = 0; row < rows; row++) {
                matrix[row][0] = 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Rows: ");
        int rows = sc.nextInt();
        System.out.print("Columns: ");
        int cols = sc.nextInt();

        if (rows <= 0 || cols <= 0) {
            System.out.println("Dimensions must be positive");
            sc.close();
            return;
        }

        int[][] matrix = new int[rows][cols];
        System.out.println("Enter elements row-wise:");
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = sc.nextInt();
            }
        }

        setZeroes(matrix);
        System.out.println(Arrays.deepToString(matrix));
        sc.close();
    }
}