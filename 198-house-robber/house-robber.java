class Solution {
    public int rob(int[] nums) {
        Integer[] dp = new Integer[nums.length];
        
        return solve(0,nums,dp);
    }
    private int solve(int i , int[] nums, Integer[]dp){
        if(i>=nums.length) return 0;
        if(dp[i]!=null) return dp[i];
         int nt = solve(i+1,nums,dp);
         int t = nums[i]+ solve(i+2,nums,dp);
        return dp[i]= Math.max(nt,t);
    }
}