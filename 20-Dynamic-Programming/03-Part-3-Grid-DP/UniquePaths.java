// Count grid paths moving only right or down.
public class UniquePaths {
 public static int count(int m,int n){int[][]dp=new int[m][n];for(int r=0;r<m;r++)dp[r][0]=1;for(int c=0;c<n;c++)dp[0][c]=1;
  for(int r=1;r<m;r++)for(int c=1;c<n;c++)dp[r][c]=dp[r-1][c]+dp[r][c-1]; // Combine paths from top and left.
  return dp[m-1][n-1];}
}