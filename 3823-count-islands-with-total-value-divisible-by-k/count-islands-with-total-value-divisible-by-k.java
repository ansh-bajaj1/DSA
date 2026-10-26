class Solution {
    public int countIslands(int[][] grid, int k) {
        int c=0,s=0;
        int n = grid.length;
        int m = grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]>0){
                  long t = solve(i,j,grid);
                  if(t%k==0) c++;
                }
                
                
            }
        }
        return c;
    }
    public long solve(int i,int j, int[][]grid){
        if(i<0 || i>=grid.length || j>=grid[0].length || j<0){
            return 0;
        }
        if(grid[i][j] == 0) return 0;
        int val = grid[i][j];
        grid[i][j] = 0; 

        long l = solve(i, j - 1, grid);
        long u = solve(i - 1, j, grid);
        long r = solve(i, j + 1, grid);
        long d = solve(i + 1, j, grid);

        return val +l +u +r +d;
    }
}