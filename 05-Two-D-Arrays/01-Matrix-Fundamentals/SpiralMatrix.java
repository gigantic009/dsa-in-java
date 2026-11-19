import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SpiralMatrix {
    // Visit the current outer layer, then shrink its four boundaries.
    // Boundary checks prevent revisiting cells in single-row/single-column layers.
    static List<Integer> spiral(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0
                || matrix[0] == null || matrix[0].length == 0) {
            return result;
        }

        int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            // Traverse the top boundary from left to right.
            for (int col = left; col <= right; col++) {
                result.add(matrix[top][col]);
            }
            top++;

            // Traverse the right boundary from top to bottom.
            for (int row = top; row <= bottom; row++) {
                result.add(matrix[row][right]);
            }
            right--;

            // The remaining layer may have a bottom boundary.
            if (top <= bottom) {
                for (int col = right; col >= left; col--) {
                    result.add(matrix[bottom][col]);
                }
                bottom--;
            }

            // The remaining layer may have a left boundary.
            if (left <= right) {
                for (int row = bottom; row >= top; row--) {
                    result.add(matrix[row][left]);
                }
                left++;
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
        System.out.println(spiral(readMatrix(sc)));
        sc.close();
    }
}