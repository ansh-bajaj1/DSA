class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[][] dp = new int[triangle.size()][triangle.size()];
        for(int i = 0; i < triangle.size(); i++){
                Arrays.fill(dp[i], -1);
        }
        for(int j=0;j<triangle.get(triangle.size()-1).size();j++) 
        dp[triangle.size()-1][j]=triangle.get(triangle.size()-1).get(j);
        for(int i =triangle.size()-2;i>=0;i--){
            for(int j = 0;j < triangle.get(i).size(); j++){
              dp[i][j]= triangle.get(i).get(j)+Math.min(dp[i+1][j], dp[i+1][j+1]);
            }
        }
        return dp[0][0];
    }
}
//     private int solve(List<List<Integer>> triangle,int i, int j,int[][] dp){
        
//         if(i == triangle.size() - 1){
//             return dp[i][j]= triangle.get(i).get(j);
//         }
//         if(dp[i][j]!=-1) return dp[i][j];
//         dp[i][j]= triangle.get(i).get(j)+Math.min(solve(triangle,i+1,j,dp),solve(triangle,i+1,j+1,dp));
//         return dp[i][j];
//     }
// }