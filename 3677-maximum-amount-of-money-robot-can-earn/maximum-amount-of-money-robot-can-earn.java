class Solution {
   int a = Integer.MIN_VALUE;
    int s = Integer.MIN_VALUE;  

    public int maximumAmount(int[][] coins) {
        int[][][]dp  = new int[coins.length][coins[0].length][3];

        for(int i=0;i<coins.length;i++){
            for(int j=0;j<coins[0].length;j++){
                for(int k=0;k<3;k++){
                    dp[i][j][k]=Integer.MIN_VALUE;
                }
            }
        }
        return solve(coins,0,0,2,dp);
    }
   private int solve(int[][] coins, int i, int j, int t,int[][][]dp) {

        if (i >= coins.length || j >= coins[0].length) {
            return Integer.MIN_VALUE;
        }

        if (i == coins.length - 1 && j == coins[0].length - 1) {
            if (coins[i][j] < 0 && t > 0) return 0;
            return coins[i][j];
        }
        if(dp[i][j][t]!=Integer.MIN_VALUE) return dp[i][j][t];

        int a = Integer.MIN_VALUE;
        int s = Integer.MIN_VALUE;

        if (coins[i][j] > 0) {
            dp[i][j][t] = coins[i][j] + Math.max(solve(coins, i, j + 1, t,dp),solve(coins, i + 1, j, t,dp));
            return dp[i][j][t];
        } else {
            a = coins[i][j] + Math.max(solve(coins, i, j + 1, t,dp),solve(coins, i + 1, j, t,dp));

            if (t > 0) {
                s = Math.max(solve(coins, i, j + 1, t - 1,dp),solve(coins, i + 1, j, t - 1,dp));
            }

            dp[i][j][t]= Math.max(a, s);
            return dp[i][j][t];
        }
    }
}