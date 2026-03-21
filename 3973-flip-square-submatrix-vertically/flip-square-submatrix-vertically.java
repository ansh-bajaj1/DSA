class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int[][] arr = new int[grid.length][grid[0].length];
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                arr[i][j] = grid[i][j];
        }
    }
        for(int i=x;i<x+k;i++){
            for(int j=y;j<y+k;j++){
                arr[i][j] = grid[x + k - 1 - (i - x)][j];
            }
        }
        return arr;
    }
}