/** LeetCode 1143: returns the length of the longest common subsequence. */
public class LongestCommonSubsequence {
    public static int length(String a, String b) {
        if (a == null || b == null) throw new IllegalArgumentException("Strings must not be null.");
        int[][] dp = new int[a.length() + 1][b.length() + 1];
        // dp[i][j] describes the LCS length of prefixes of lengths i and j.
        for (int i = 1; i <= a.length(); i++)
            for (int j = 1; j <= b.length(); j++)
                if (a.charAt(i - 1) == b.charAt(j - 1))
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                else
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
        return dp[a.length()][b.length()];
    }
    public static void main(String[] args) { System.out.println(length("abcde","ace")); // 3
    }
}