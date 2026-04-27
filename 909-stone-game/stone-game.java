class Solution {
    public boolean stoneGame(int[] piles) {
        int n = piles.length;
        Integer[][] dp = new Integer[n][n];
        return solve(piles, 0, n - 1, dp) > 0;
    }

    private int solve(int[] piles, int i, int j, Integer[][] dp) {
        if (i == j) return piles[i];
        if (dp[i][j] != null) return dp[i][j];
        
        int a = piles[i] - solve(piles, i + 1, j, dp);
        int b = piles[j] - solve(piles, i, j - 1, dp);

        dp[i][j] = Math.max(a, b);
        return dp[i][j];
    }
}