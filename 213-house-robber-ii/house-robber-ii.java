class Solution {
    public int rob(int[] nums) {
        Integer[] dp = new Integer[nums.length];
        Integer[] dp2 = new Integer[nums.length];
        if(nums.length==1) return nums[0];
        return Math.max(solve(1,nums.length-1,nums,dp),solve(0,nums.length-2,nums,dp2));
    }
    private int solve(int i ,int end, int[] nums, Integer[]dp){
        if(i>end) return 0;
        if(dp[i]!=null) return dp[i];
         int nt = solve(i+1,end,nums,dp);
         int t = nums[i]+ solve(i+2,end,nums,dp);
        return dp[i]= Math.max(nt,t);
    }
}