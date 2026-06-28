class Solution {
    public int numDistinct(String s, String t) {
        int i=s.length()-1;
        int j=t.length()-1;
        Integer[][] dp = new Integer[i+1][j+1];
        return solve(i,j,s,t,dp);
    }
    private int solve(int i, int j,String s,String t, Integer[][]dp ){
        if(j<0) return 1;
        if(i<0) return 0;
        
        if(dp[i][j]!=null) return dp[i][j];
        if(s.charAt(i)==t.charAt(j)){
           return dp[i][j] = solve(i-1,j-1,s,t,dp)+solve(i-1,j,s,t,dp);
        }
        else{
          return dp[i][j]=solve(i-1,j,s,t,dp);
        }
    }
}