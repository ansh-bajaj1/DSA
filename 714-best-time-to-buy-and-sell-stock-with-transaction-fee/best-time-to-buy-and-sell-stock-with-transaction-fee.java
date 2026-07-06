class Solution {
    public int maxProfit(int[] prices, int fee) {
        Integer[][] dp = new Integer[prices.length][2];
        return solve(0,prices,1,dp,fee);
    }
    private int solve(int i, int[] arr, int buy, Integer[][]dp,int fee){
        if(i==arr.length) return 0;
        if(dp[i][buy]!=null) return dp[i][buy];
        int profit=0;
        if(buy==1){
            profit= Math.max(-arr[i]+solve(i+1,arr,0,dp,fee),0+solve(i+1,arr,1,dp,fee));
        }
        else{
            profit=Math.max(-fee+arr[i]+solve(i+1,arr,1,dp,fee),0+solve(i+1,arr,0,dp,fee));
        }
        return dp[i][buy]=profit;
    }
}