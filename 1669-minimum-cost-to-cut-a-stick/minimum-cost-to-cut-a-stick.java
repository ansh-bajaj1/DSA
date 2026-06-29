class Solution {
    public int minCost(int n, int[] cuts) {
        int[] arr = new int[cuts.length+2];
        arr[0]=0;
        for(int i=1;i<arr.length-1;i++) arr[i]=cuts[i-1];
        arr[arr.length-1]=n;
        Arrays.sort(arr);
        Integer[][] dp = new Integer[arr.length][arr.length];
        return solve(1,cuts.length,arr,dp);
    }
    private int solve(int i, int j , int[] cuts,Integer[][] dp){
        if(i>j) return 0;
        if(dp[i][j]!=null) return dp[i][j];
        int m = Integer.MAX_VALUE;
        for(int k=i;k<=j;k++){
            int c=cuts[j+1]-cuts[i-1]+solve(i,k-1,cuts,dp)+solve(k+1,j,cuts,dp);
            m=Math.min(m,c);
        }
        return dp[i][j]= m;
    }
}