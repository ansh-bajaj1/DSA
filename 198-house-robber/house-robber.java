class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp,-1);
        return solve(nums,nums.length-1,dp);
    }
    private int solve(int[] nums, int i,int[] dp){
        if(i==0) return nums[i];
        if(i<0) return 0;
        if(dp[i]!=-1) return dp[i];
        int a = nums[i]+solve(nums,i-2,dp);
        int b= 0+solve(nums,i-1,dp);
        dp[i]= Math.max(a,b);
        return dp[i];
    }
}