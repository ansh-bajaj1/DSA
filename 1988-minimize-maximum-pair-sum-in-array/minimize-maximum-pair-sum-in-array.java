class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int max= Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]+nums[nums.length-i-1]);
        }
        return max;
    }
}