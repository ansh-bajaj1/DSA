class Solution {
    public String shortestCommonSupersequence(String str1, String str2) {
        
        int[][] dp = new int[str1.length()+1][str2.length()+1];
        int n = str1.length();
        int m = str2.length();
        StringBuilder sb = new StringBuilder();
       for(int i = 1; i <= n; i++){
    for(int j = 1; j <= m; j++){
            if(str1.charAt(i-1)==str2.charAt(j-1))
            dp[i][j]=1+dp[i-1][j-1];
            else{
                dp[i][j]= Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
       }
       int i=str1.length();
    int j=str2.length();
        while(i>0 && j>0){
            if(str1.charAt(i-1)==str2.charAt(j-1)){
                sb.append(str1.charAt(i-1));
                i--;
                j--;
            }
            else{
                if(dp[i-1][j]>dp[i][j-1]){
                    sb.append(str1.charAt(i-1));
                    i--;
                }
                else{
                    sb.append(str2.charAt(j-1));
                    j--;
                }
            }
        }
            while(i>0){
                sb.append(str1.charAt(i-1));
                i--;
            }
            while(j>0){
                sb.append(str2.charAt(j-1));
                j--;
            }
            
        
        return sb.reverse().toString();
    }
}