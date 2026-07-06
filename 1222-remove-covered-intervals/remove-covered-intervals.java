class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        int c=0;
        for(int i=0;i<intervals.length;i++){
            for(int j=0;j<intervals.length;j++){
                if(i!=j && intervals[j][0]<=intervals[i][0] && intervals[j][1]>=intervals[i][1]){
                c++;
                break;
                }
            }
        }
        return Math.abs(intervals.length-c);
    }
}