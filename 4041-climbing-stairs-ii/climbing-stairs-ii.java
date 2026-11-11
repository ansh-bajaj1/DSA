class Solution {
    public int climbStairs(int n, int[] costs) {
        Integer[] dp = new Integer[n+1];
        return solve(0,n,costs,dp);
    }
    public int solve(int i, int n , int[] costs,Integer[] dp){
        if(i==n) return 0;
        if(dp[i]!=null) return dp[i];
        int min = Integer.MAX_VALUE;
        int j=i+1;
        if(j<=n){
            min=Math.min(min,costs[j-1]+(j-i)*(j-i)+solve(j,n,costs,dp));
        }
         j=i+2;
        if(j<=n){
            min=Math.min(min,costs[j-1]+(j-i)*(j-i)+solve(j,n,costs,dp));
        }
         j=i+3;
        if(j<=n){
            min=Math.min(min,costs[j-1]+(j-i)*(j-i)+solve(j,n,costs,dp));
        }
        return dp[i]=min;
    }
}