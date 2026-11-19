import java.util.Scanner;

public class SearchMatrix {
    // Binary search on a matrix whose rows are sorted and whose next row
    // begins with a value greater than the previous row's final value.
    // The matrix can therefore be treated as one flattened sorted array.
    static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0
                || matrix[0] == null || matrix[0].length == 0) {
            return false;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;
        int low = 0, high = rows * cols - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Convert the flattened index into its row and column coordinates.
            int value = matrix[mid / cols][mid % cols];
            if (value == target) {
                return true;
            }
            if (value < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
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
        System.out.println("Enter elements in globally sorted matrix order row-wise:");
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = sc.nextInt();
            }
        }

        System.out.print("Target: ");
        int target = sc.nextInt();
        System.out.println(searchMatrix(matrix, target));
        sc.close();
    }
}