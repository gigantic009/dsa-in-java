// Length of the longest common subsequence using a dynamic programming table.
public class LongestCommonSubsequence {
    public static int length(String a, String b) {
        int[][] dp = new int[a.length() + 1][b.length() + 1];

        for (int i = 1; i <= a.length(); i++) {
            for (int j = 1; j <= b.length(); j++) {
                if (a.charAt(i - 1) == b.charAt(j - 1)) {
                    // Matching characters extend the LCS of the prefixes.
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    // Otherwise, skip one character from either prefix.
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        return dp[a.length()][b.length()];
    }
}
