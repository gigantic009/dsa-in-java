import java.util.Arrays;
import java.util.Scanner;

public class RotateMatrix90 {
    // Rotate an n x n matrix 90 degrees clockwise in place.
    // Transpose swaps positions across the main diagonal; reversing each row
    // then moves the transposed columns into clockwise-rotated positions.
    static void rotate(int[][] matrix) {
        int n = matrix.length;

        // Transpose: only visit cells above the diagonal to avoid double swaps.
        for (int row = 0; row < n; row++) {
            for (int col = row + 1; col < n; col++) {
                int temp = matrix[row][col];
                matrix[row][col] = matrix[col][row];
                matrix[col][row] = temp;
            }
        }

        // Reverse each row to complete the clockwise rotation.
        for (int[] row : matrix) {
            for (int left = 0, right = n - 1; left < right; left++, right--) {
                int temp = row[left];
                row[left] = row[right];
                row[right] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Square matrix size n: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Size must be positive");
            sc.close();
            return;
        }

        int[][] matrix = new int[n][n];
        System.out.println("Enter matrix elements row-wise:");
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                matrix[row][col] = sc.nextInt();
            }
        }

        rotate(matrix);
        System.out.println(Arrays.deepToString(matrix));
        sc.close();
    }
}