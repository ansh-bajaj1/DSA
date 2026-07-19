class Solution {
    public boolean canJump(int[] nums) {
        Boolean[] dp = new Boolean[nums.length];
        return solve(0,nums,dp);
    }
    private boolean solve(int i, int[] nums,Boolean[]dp){
        if(i>=nums.length) return false;
        if(i==nums.length-1) return true;
        if(dp[i]!=null) return dp[i];
        for(int j=i+1;j<=i+nums[i];j++)
        if(solve(j,nums,dp)) return dp[i]= true;


        return dp[i]=false;
    }
}