import java.util.*;

class Solution {

    int n, m;
    int max = 0;

    public int getMaximumGold(int[][] grid) {
         n = grid.length;
        m = grid[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] > 0) {
                    dfs(grid, i, j, 0);
                }
            }
        }
        return max;
    }

    public void dfs(int[][] grid, int i, int j, int ans) {

        if (i < 0 || i >= n || j < 0 || j >= m || grid[i][j] == 0) {
            return;
        }

        ans += grid[i][j];

        int temp = grid[i][j];
        grid[i][j] = 0;

        max = Math.max(max, ans);

        dfs(grid, i + 1, j, ans);
        dfs(grid, i - 1, j, ans);
        dfs(grid, i, j + 1, ans);
        dfs(grid, i, j - 1, ans);

        grid[i][j] = temp;
    }
}