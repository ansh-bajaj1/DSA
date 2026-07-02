class Solution {
    Boolean[][][] dp;
    public boolean findSafeWalk(List<List<Integer>> grid, int health) {
        dp = new Boolean[grid.size()][grid.get(0).size()][health + 1];
        return solve(grid, 0, 0, health);
    }

    private boolean solve(List<List<Integer>> grid, int i, int j, int h) {

        if (i < 0 || j < 0 || i >= grid.size() || j >= grid.get(0).size())
        return false;

        if (grid.get(i).get(j) == -1)
        return false;
        h -= grid.get(i).get(j);

        if (h < 1)
        return false;

        if (i == grid.size() - 1 && j == grid.get(0).size() - 1)
        return true;

        if (dp[i][j][h] != null)
        return dp[i][j][h];

        int temp = grid.get(i).get(j);
        grid.get(i).set(j, -1);

        boolean ans =solve(grid, i, j - 1, h) ||solve(grid, i, j + 1, h) || solve(grid, i - 1, j, h) || solve(grid, i + 1, j, h);

        grid.get(i).set(j, temp);
        return dp[i][j][h]=ans;
    }
}