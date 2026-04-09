class Solution {
    public int numSquares(int n) {
        Integer[] dp = new Integer[n+1];
        return solve(n,dp);
    }

    private int solve(int n,Integer[] dp) {
        if (n == 0) return 0;
        if(dp[n]!=null) return dp[n];
        int ans = Integer.MAX_VALUE;
        
        
        for (int j = 1; j * j <= n; j++) {
            
            ans = Math.min(ans, 1 + solve(n - j * j,dp));
        }

        return dp[n]=ans;
    }
}