/** LeetCode 62: counts paths moving only right or down. */
public class UniquePaths {
    public static int count(int m, int n) {
        if (m <= 0 || n <= 0) throw new IllegalArgumentException("Dimensions must be positive.");
        int[][] dp = new int[m][n];
        for (int r = 0; r < m; r++) dp[r][0] = 1;
        for (int c = 0; c < n; c++) dp[0][c] = 1;
        for (int r = 1; r < m; r++)
            for (int c = 1; c < n; c++)
                dp[r][c] = Math.addExact(dp[r - 1][c], dp[r][c - 1]);
        return dp[m - 1][n - 1];
    }
    public static void main(String[] args) { System.out.println(count(3,7)); // 28
    }
}