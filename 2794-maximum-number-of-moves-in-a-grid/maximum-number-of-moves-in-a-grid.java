class Solution {
    public int maxMoves(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int ans = 0;
        Integer[][] dp = new Integer[n][m];
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, solve(grid, i, 0,dp));
        }

        return ans;
    }

    public int solve(int[][] grid, int i, int j,Integer[][] dp) {
        int n = grid.length;
        int m = grid[0].length;

        if (j ==m-1) {
            return 0;
        }
        if(dp[i][j]!=null) return dp[i][j];
        int ans = 0;
        if (i-1>=0 && grid[i-1][j+1] > grid[i][j]) {
            ans = Math.max(ans,1 + solve(grid,i-1,j+1,dp));
        }
        if (grid[i][j+1] > grid[i][j]) {
            ans = Math.max(ans,1 + solve(grid,i,j + 1,dp));
        }
        if (i+1<n && grid[i+1][j+1] > grid[i][j]) {
            ans = Math.max(ans,1 + solve(grid,i+1,j+1,dp));
        }
        return dp[i][j]= ans;
    }

    
}