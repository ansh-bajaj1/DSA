class Solution {
    public int minDistance(String word1, String word2) {
        Integer dp[][] = new Integer[word1.length()+1][word2.length()+1];
        return solve(word1,word2,0,0,dp);
    }
    private int solve(String w1, String w2, int i , int j,Integer dp[][]){
        if(i==w1.length()) {
            return w2.length() - j;
        }
        if(j==w2.length()){
            return w1.length() - i;
        }
        if(dp[i][j]!=null) return dp[i][j];
        if(w1.charAt(i) == w2.charAt(j)) {
    return  dp[i][j]=solve(w1, w2, i+1, j+1,dp);
        }
    
    return dp[i][j]= 1+Math.min(solve(w1,w2,i+1,j,dp),Math.min(solve(w1,w2,i,j+1,dp),solve(w1,w2,i+1,j+1,dp)));
    }
}