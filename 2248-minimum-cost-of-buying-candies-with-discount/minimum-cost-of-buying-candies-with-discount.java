class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int s=0;
        for(int i=0;i<cost.length;i++){
            if((cost.length-i)%3!=0){
                s+=cost[i];
            }
        }
        return s;
    }
}