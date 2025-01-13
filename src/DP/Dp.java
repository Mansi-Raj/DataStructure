package DP;

import java.util.*;

public class Dp {

    static final int MOD = 1_000_000_007;

    static long topDown(int n) {
        long[] dp = new long[n + 1];
        Arrays.fill(dp, -1);
        return topDownHelper(n, dp);
    }

    static long topDownHelper(int n, long[] dp) {
        if (n < 2)
            return n;
        if (dp[n] != -1)
            return dp[n];
        return dp[n] = (topDownHelper(n - 1, dp) + topDownHelper(n - 2, dp)) % MOD;
    }

    static long bottomUp(int n) {
        long prev1 = 1;
        long prev2 = 0;
        for (int i = 2; i <= n; i++) {
            long curr = (prev1 + prev2) % MOD;
            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }
}
