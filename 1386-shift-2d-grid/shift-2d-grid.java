class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;

        while (k > 0) {
            int[][] temp = new int[n][m];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (j < m - 1) {
                        temp[i][j + 1] = grid[i][j];
                    } else if (i < n - 1) {
                        temp[i + 1][0] = grid[i][j];
                    } else {
                        temp[0][0] = grid[i][j];
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    grid[i][j] = temp[i][j];
                }
            }

            k--;
        }

        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                row.add(grid[i][j]);
            }
            list.add(row);
        }

        return list;
    }
}