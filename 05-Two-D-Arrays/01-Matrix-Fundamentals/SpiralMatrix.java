import java.util.*;

public class SpiralMatrix {
    // Traverse layer by layer, shrinking the four boundaries.
    static List<Integer> spiral(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            // Traverse the top boundary.
            for (int col = left; col <= right; col++) result.add(matrix[top][col]);
            top++;

            // Traverse the right boundary.
            for (int row = top; row <= bottom; row++) result.add(matrix[row][right]);
            right--;

            // Traverse the bottom boundary only if it still exists.
            if (top <= bottom) {
                for (int col = right; col >= left; col--) result.add(matrix[bottom][col]);
                bottom--;
            }

            // Traverse the left boundary only if it still exists.
            if (left <= right) {
                for (int row = bottom; row >= top; row--) result.add(matrix[row][left]);
                left++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println(spiral(matrix));
    }
}
