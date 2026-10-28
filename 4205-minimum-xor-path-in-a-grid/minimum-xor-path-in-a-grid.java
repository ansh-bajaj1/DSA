class Solution {
    public int minCost(int[][] grid) {
        Integer[][][] dp = new Integer[grid.length][grid[0].length][1024];
        return solve(0, 0, grid, 0,dp);
    }

    public int solve(int i, int j, int[][] grid, int xor,Integer[][][] dp) {
        int m = grid.length;
        int n = grid[0].length;

        if (i >= m || j >= n) {
            return Integer.MAX_VALUE;
        }
        xor ^= grid[i][j];
        if(dp[i][j][xor]!=null) return dp[i][j][xor];
        if (i == m - 1 && j == n - 1) {
            return xor;
        }

        int right = solve(i, j + 1, grid, xor,dp);
        int down = solve(i + 1, j, grid, xor,dp);

        return dp[i][j][xor]= Math.min(right, down);
    }
}