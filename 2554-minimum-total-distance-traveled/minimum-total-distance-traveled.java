class Solution {
    public long minimumTotalDistance(List<Integer> robot, int[][] factory) {
        Collections.sort(robot);
        Arrays.sort(factory, (a, b) -> a[0] - b[0]);
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<factory.length;i++){
            for(int j=0;j<factory[i][1];j++){
                list.add(factory[i][0]);
            }
        }
        Long[][] dp = new Long[robot.size()][list.size()];
        return solve(0,0,robot,list,dp);
    }
    private long solve(int i,int j, List<Integer> robot, List<Integer> list,Long[][] dp){
        if(i>=robot.size()) return 0;
        if(j>=list.size()) return Long.MAX_VALUE;
        if(dp[i][j]!=null) return dp[i][j];
        long take = solve(i + 1, j + 1, robot, list,dp);
        if(take != Long.MAX_VALUE){
            take += Math.abs(robot.get(i) - list.get(j));
        }        long skip = solve(i,j+1,robot,list,dp);
        return dp[i][j]=Math.min(take,skip);
    }
}