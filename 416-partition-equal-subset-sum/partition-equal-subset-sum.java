class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        if(sum%2!=0) return false;
        Boolean[][] dp = new Boolean[nums.length][sum+1];
        return solve(nums.length-1,nums,sum/2,dp);
    }
    private boolean solve(int i, int[] arr,int sum,Boolean[][]dp){
        if(sum==0) return true;
        if(i==0){
            return sum==0;
        }
        if(dp[i][sum]!=null) return dp[i][sum];
        boolean ntake = solve(i-1,arr,sum,dp);
        boolean take=false;
        if(arr[i]<=sum) take = solve(i-1,arr,sum-arr[i],dp);
        return dp[i][sum]=take || ntake;
    }
}