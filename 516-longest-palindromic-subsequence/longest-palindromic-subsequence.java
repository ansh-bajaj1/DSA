class Solution {
    public int longestPalindromeSubseq(String s) {
        StringBuilder sb = new StringBuilder(s);
        String s2 = sb.reverse().toString();
        Integer[][] dp = new Integer[s.length()+1][s2.length()+1];
        return solve(s.length()-1,s2.length()-1,s,s2,dp);
    }
    public int solve(int i, int j , String s1, String s2,Integer[][] dp){
        if(i<0 || j<0) return 0;
        if(dp[i][j]!=null) return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j)){
            return dp[i][j]= 1+ solve(i-1,j-1,s1,s2,dp);
        }
        else{
            return dp[i][j]= Math.max(solve(i-1,j,s1,s2,dp),solve(i,j-1,s1,s2,dp));
        }
    }
}