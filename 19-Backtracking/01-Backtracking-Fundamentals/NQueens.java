import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Places n queens on an n-by-n chessboard so that no two queens attack.
 * LeetCode 51: N-Queens.
 */
public class NQueens {

    public static List<List<String>> solve(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative.");
        }

        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];

        for (char[] row : board) {
            Arrays.fill(row, '.');
        }

        place(0, board, result);
        return result;
    }

    private static void place(int row, char[][] board, List<List<String>> result) {
        // All rows have been filled: save a snapshot of the board.
        if (row == board.length) {
            List<String> solution = new ArrayList<>();
            for (char[] boardRow : board) {
                solution.add(new String(boardRow));
            }
            result.add(solution);
            return;
        }

        // Try placing a queen in each column of this row.
        for (int col = 0; col < board.length; col++) {
            if (isSafe(row, col, board)) {
                board[row][col] = 'Q';
                place(row + 1, board, result);
                board[row][col] = '.'; // Undo before testing the next column.
            }
        }
    }

    // Only previous rows need checking because rows are filled top to bottom.
    private static boolean isSafe(int row, int col, char[][] board) {
        for (int previousRow = 0; previousRow < row; previousRow++) {
            int distance = row - previousRow;

            if (board[previousRow][col] == 'Q'
                    || (col - distance >= 0
                        && board[previousRow][col - distance] == 'Q')
                    || (col + distance < board.length
                        && board[previousRow][col + distance] == 'Q')) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("4-Queens solutions: " + solve(4).size()); // 2
    }
}
