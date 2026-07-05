class Solution {
    public int maxProfit(int[] prices) {
        Integer[][] dp = new Integer[prices.length][2];
        return solve(0,prices,1,dp);
    }
    private int solve(int i, int[] arr, int buy, Integer[][]dp){
        if(i==arr.length) return 0;
        if(dp[i][buy]!=null) return dp[i][buy];
        int profit=0;
        if(buy==1){
            profit= Math.max(-arr[i]+solve(i+1,arr,0,dp),0+solve(i+1,arr,1,dp));
        }
        else{
            profit=Math.max(arr[i]+solve(i+1,arr,1,dp),0+solve(i+1,arr,0,dp));
        }
        return dp[i][buy]=profit;
    }
}