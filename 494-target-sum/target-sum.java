class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int a = solve(nums,0,0,target);
        return a;
    }
    private int solve(int[] nums, int i, int sum, int target){
        if(i==nums.length){
            if(sum==target) return 1;
            else return 0;
        }
        int p = solve(nums,i+1,sum+nums[i],target);
        int m = solve(nums,i+1,sum-nums[i],target);
        return p+m;
    }
}