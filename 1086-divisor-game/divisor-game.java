class Solution {
    public boolean divisorGame(int n) {
        Boolean[] dp = new Boolean[n + 1];
        return canWin(n, dp);
    }
    private boolean canWin(int n, Boolean[] dp) {
        if (n == 1) return false;

        if (dp[n] != null) return dp[n];

        for (int x = 1; x < n; x++) {
            if (n % x == 0) {
            if (!canWin(n - x, dp)) {
                return dp[n] = true;
             }
            }
        }

        return dp[n] = false;
    }
}