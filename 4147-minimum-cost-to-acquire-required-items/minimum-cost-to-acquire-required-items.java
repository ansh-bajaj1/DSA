class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long a=0;
        if(cost1+cost2<=costBoth){
            return (long) ((long)need1*cost1)+((long)need2*cost2);
        }
        int c = Math.min(need1,need2);
        a+=((long)c*costBoth);
        
        need1-=c;
        need2-=c;
        if(need1>0){
            a+=(long)need1*Math.min(cost1,costBoth);
        }
        else if(need2>0){
            a+=(long)need2*Math.min(cost2,costBoth);
        }
        return a;
    }
}