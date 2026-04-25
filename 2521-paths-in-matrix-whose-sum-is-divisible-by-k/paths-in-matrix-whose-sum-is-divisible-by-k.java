class Solution {
    static final int m = 1000000007;

    public int numberOfPaths(int[][] grid, int k) {
        int n = grid.length, m = grid[0].length;
        Integer[][][] dp = new Integer[n][m][k];
        return solve(grid, 0, 0, 0, k, dp);
    }

    private int solve(int[][] grid, int i, int j, int mod, int k, Integer[][][] dp) {
        if (i >= grid.length || j >= grid[0].length) return 0;
        mod = (mod + grid[i][j]) % k;

        if (i == grid.length - 1 && j == grid[0].length - 1) {
            return (mod == 0) ? 1 : 0;
        }
        if (dp[i][j][mod] != null) return dp[i][j][mod];
        int right = solve(grid, i, j + 1, mod, k, dp);
        int down  = solve(grid, i + 1, j, mod, k, dp);

        return dp[i][j][mod] = (right + down)%m;
    }
}