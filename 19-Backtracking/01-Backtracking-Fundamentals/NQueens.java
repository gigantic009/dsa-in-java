// Backtracking placement of n queens with column and diagonal conflict checks.
import java.util.*;

public class NQueens {
    public static List<List<String>> solve(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];

        for (char[] row : board) {
            Arrays.fill(row, '.');
        }

        place(0, board, result);
        return result;
    }

    private static void place(int row, char[][] board, List<List<String>> result) {
        if (row == board.length) {
            List<String> solution = new ArrayList<>();
            for (char[] r : board) {
                solution.add(new String(r));
            }
            result.add(solution);
            return;
        }

        for (int col = 0; col < board.length; col++) {
            if (safe(row, col, board)) {
                board[row][col] = 'Q';
                place(row + 1, board, result);
                board[row][col] = '.'; // Undo the placement before trying the next column.
            }
        }
    }

    private static boolean safe(int row, int col, char[][] board) {
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q'
                    || (col - (row - i) >= 0 && board[i][col - (row - i)] == 'Q')
                    || (col + (row - i) < board.length && board[i][col + (row - i)] == 'Q')) {
                return false;
            }
        }

        return true;
    }
}
