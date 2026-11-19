/** Transpose a rectangular matrix. O(rows*columns) time and output space. */
import java.util.Arrays;
public class TransposeMatrix {
    static int[][] transpose(int[][] matrix) {
        // Dimensions switch: original columns become result rows.
        int[][] result = new int[matrix[0].length][matrix.length];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                result[col][row] = matrix[row][col]; // Swap row/column coordinates.
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6}};
        System.out.println(Arrays.deepToString(transpose(matrix)));
    }
}