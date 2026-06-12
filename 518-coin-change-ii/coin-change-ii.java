class Solution {
    public int change(int amount, int[] coins) {
        Integer[][] dp = new Integer[coins.length][amount+1];
        return solve(coins.length-1,coins,amount,dp);
    }
    private int solve(int i, int[] coins,int sum,Integer[][] dp){
        if(sum==0) return 1;
        if(i<0) return 0;
        if(dp[i][sum]!=null) return dp[i][sum];
        int ntake=solve(i-1,coins,sum,dp);
        int take=0;
        if(coins[i]<=sum){
            take = solve(i,coins,sum-coins[i],dp);
        }
        return dp[i][sum]=take+ntake;
    }
}