package Dynamic_programming;
import java.util.*;


public class fibonacciDp {
    public static int tabulation(int n){

        int dp[] = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i=2;i<=n;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }

    public static int memoization(int n, int[] memo) {
        if (n <= 1) {
            return 1;
        }
        if (memo[n] != 0) {
            return memo[n];
        }
        memo[n] = memoization(n - 1, memo) + memoization(n - 2, memo);
        return memo[n];
    }

    public static void main(String[] args) {
        int n = 7;
        System.out.println(tabulation(n));

        int memo[] = new int[n+1];
        Arrays.fill(memo,0);

        System.out.println(memoization(n,memo));
    }

}