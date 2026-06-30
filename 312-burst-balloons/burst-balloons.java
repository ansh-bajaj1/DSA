class Solution {
    public int maxCoins(int[] nums) {
        int[] arr = new int[nums.length+2];
        arr[0]=1;
        arr[arr.length-1]=1;
        for(int i=1;i<=nums.length;i++){
            arr[i]=nums[i-1];
        }
        Integer[][] dp = new Integer[arr.length][arr.length];
        return solve(1,nums.length,arr,dp);
    }
    private int solve(int i, int j, int[] nums,Integer[][] dp){
        if(i>j) return 0;
        if(dp[i][j]!=null) return dp[i][j];
        int max = Integer.MIN_VALUE;
        for(int k=i;k<=j;k++){
            int c=nums[i-1]*nums[k]*nums[j+1]+solve(i,k-1,nums,dp)+solve(k+1,j,nums,dp);
            max=Math.max(max,c);
        }
        return dp[i][j]= max;
    }
}