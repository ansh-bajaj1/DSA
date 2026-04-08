class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        int MOD = 1000000007;
        for(int i=0;i<queries.length;i++){
            int idx=queries[i][0];
            int r=queries[i][1];
            int k = queries[i][2];
            long v = queries[i][3];
            while(idx<=r){
                nums[idx] = (int)(((long)nums[idx] * v) % MOD);
                idx+=k;
            }
        }
        int x=0;
        for(int i=0;i<nums.length;i++){

           x^=nums[i];
        }
        return x;
    }
}