class Solution {
    public int climbStairs(int n) {
        Integer[] dp = new Integer[n+1];
        return solve(n,dp);
    }
    private int solve(int i,Integer[] dp){
        if(i<=0){
            return 0;
        }
        if(i<=2) return i;
        if(dp[i]!=null) return dp[i];
        int a = solve(i-1,dp);
        int b =solve(i-2,dp);
        dp[i]=a+b;
        return dp[i];

    }
}