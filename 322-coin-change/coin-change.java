class Solution {
    public int coinChange(int[] coins, int amount) {
        Integer dp[][] = new Integer[10001][coins.length+1];
        int a= solve(coins, amount, coins.length - 1,dp);
        return a==Integer.MAX_VALUE?-1:a;
    }

    private int solve(int[] coins, int amount, int i,Integer dp[][]) {
        if (i == 0) {
            if (amount % coins[0] == 0) {
                return amount / coins[0];
            } else {
                return Integer.MAX_VALUE;
            }
        }
        if(dp[amount][i]!=null) return dp[amount][i];
        int ntake = 0 + solve(coins, amount, i - 1,dp);
        int take = Integer.MAX_VALUE;
        if (coins[i] <= amount) {
            int a = solve(coins, amount - coins[i], i,dp);
            if (a != Integer.MAX_VALUE)
                take = 1 + a;
        }
        return dp[amount][i]=Math.min(take, ntake);
    }
}