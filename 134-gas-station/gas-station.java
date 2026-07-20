class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int s1=0,s2=0;
        for(int i=0;i<gas.length;i++){
            s1+=gas[i];
            s2+=cost[i];
        }
        if(s2>s1) return -1;

        int ans=0,total=0;
        for(int i=0;i<gas.length;i++){
            total=total+gas[i]-cost[i];
            if(total<0){
                total =0;
                ans=i+1;
            }
        }
        return ans;
    }
}