class Solution {
    public int coinChange(int[] coins, int amount) {
        Integer[][] dp = new Integer[amount + 1][coins.length];

        int ans = solve(coins, amount, coins.length - 1, dp);
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }

    private int solve(int[] coins, int amount, int i, Integer[][] dp) {

        if (i == 0) {
            if (amount % coins[0] == 0)
                return amount / coins[0];
            return Integer.MAX_VALUE;
        }
        if (dp[amount][i] != null)
            return dp[amount][i];

        int notTake = solve(coins, amount, i - 1, dp);
        int take = Integer.MAX_VALUE;
        if (coins[i] <= amount) {
        int res = solve(coins, amount - coins[i], i, dp);
            if (res != Integer.MAX_VALUE) {
                take = 1 + res;
            }
        }
        return dp[amount][i] = Math.min(take, notTake);
    }
}
