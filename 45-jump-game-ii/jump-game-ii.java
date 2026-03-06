class Solution {
    public int jump(int[] nums) {
        int[] memo = new int[nums.length];
        Arrays.fill(memo,-1);
        return fun(nums,0,memo);
    }
    private int fun(int[] nums, int i,int[] memo){
        if(i>=nums.length-1) return 0;
        if(memo[i]!=-1) return memo[i];
        int min = Integer.MAX_VALUE;
      
        for(int j=1;j<=nums[i];j++){
             int ans =fun(nums,i+j,memo);
             if(ans!=Integer.MAX_VALUE)
            min=Math.min(min,1+ans);
            
        }
        memo[i]=min;
        return memo[i];
    }
}