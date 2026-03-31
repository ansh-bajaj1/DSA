class Solution {
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        int[] dp = new int[nums.length];
        int[] dp1 = new int[nums.length];
        Arrays.fill(dp,-1);
        Arrays.fill(dp1,-1);
        int[] t1 = new int[nums.length-1];
        int[] t2 = new int[nums.length-1];
        int k=0;
        for(int i=1;i<nums.length;i++){ if(i!=0) t1[k++]=nums[i];}
        k=0;
        for(int i=0;i<nums.length-1;i++) { if(i!=nums.length-1)t2[k++]=nums[i];}
        return Math.max(solve(t1,t1.length-1,dp),solve(t2,t2.length-1,dp1));
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