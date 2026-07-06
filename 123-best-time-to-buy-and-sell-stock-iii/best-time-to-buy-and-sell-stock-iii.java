class Solution {
    public int maxProfit(int[] prices) {
        Integer[][][] dp = new Integer[prices.length][2][3];
        return solve(0,prices,1,dp,2);
    }
    private int solve(int i, int[] arr, int buy, Integer[][][]dp,int c){
        if(i==arr.length) return 0;
        if(c==0) return 0;
        if(dp[i][buy][c]!=null) return dp[i][buy][c];
        if(buy==1){
            dp[i][buy][c]= Math.max(-arr[i]+solve(i+1,arr,0,dp,c),0+solve(i+1,arr,1,dp,c));
        }
        else{
            dp[i][buy][c]=Math.max(arr[i]+solve(i+1,arr,1,dp,c-1),0+solve(i+1,arr,0,dp,c));
        }
        return dp[i][buy][c];
    }
}