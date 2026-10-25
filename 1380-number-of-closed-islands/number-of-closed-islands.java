class Solution {
    public int closedIsland(int[][] grid) {
        int c=0;
        int n = grid.length;
        int m = grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==0){
                  boolean t = solve(i,j,grid);
                  if(t) c++;
                }
                
            }
        }
        return c;
    }
    public boolean solve(int i,int j, int[][]grid){
        if(i<0 || i>=grid.length || j>=grid[0].length || j<0){
            return false;
        }
        if(grid[i][j]==1) return true;
        grid[i][j]=1;
        boolean l = solve(i,j-1,grid);
        boolean u = solve(i-1,j,grid);
        boolean r = solve(i,j+1,grid);
        boolean d = solve(i+1,j,grid);

        return  l && u && r && d;
    }
}