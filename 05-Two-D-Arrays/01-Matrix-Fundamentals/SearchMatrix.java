public class SearchMatrix {
    // Binary search treats the matrix as one sorted array.
    // This requires each row to continue the sorted order of the previous row.
    static boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int low = 0, high = rows * cols - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Convert the flattened index into row and column indices.
            int value = matrix[mid / cols][mid % cols];

            if (value == target) return true;
            if (value < target) low = mid + 1;
            else high = mid - 1;
        }

        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 3, 5},
            {7, 9, 11},
            {13, 15, 17}
        };

        System.out.println(searchMatrix(matrix, 9));
    }
}
