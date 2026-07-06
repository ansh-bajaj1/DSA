class Solution {
    public int maxProfit(int[] arr) {
        int[][][] dp = new int[arr.length+1][2][3];
        for(int buy=0;buy<=1;buy++){
            for(int c=0;c<=2;c++){
                dp[arr.length][buy][c]=0;
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int buy=0;buy<=1;buy++){
                dp[i][buy][0]=0;
            }
        }


        for(int i=arr.length-1;i>=0;i--){
            for(int buy=0;buy<=1;buy++){
                for(int c=1;c<=2;c++){
            if(buy==1){
            dp[i][buy][c]= Math.max(-arr[i]+dp[i+1][0][c],0+dp[i+1][1][c]);
        }
        else{
            dp[i][buy][c]=Math.max(arr[i]+dp[i+1][1][c-1],0+dp[i+1][0][c]);
        }
                }
            }
        }
        return dp[0][1][2];
    }
}