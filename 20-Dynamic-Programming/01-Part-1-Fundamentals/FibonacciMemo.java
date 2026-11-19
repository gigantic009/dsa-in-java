// Fibonacci with memoization avoids repeated recursive subproblems.
import java.util.*;
public class FibonacciMemo {
 public static int fib(int n){int[]memo=new int[n+1];Arrays.fill(memo,-1);return solve(n,memo);}
 private static int solve(int n,int[]memo){if(n<=1)return n;if(memo[n]!=-1)return memo[n];memo[n]=solve(n-1,memo)+solve(n-2,memo); // Cache computed result before returning.
  return memo[n];}
}