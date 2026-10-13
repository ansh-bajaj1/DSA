class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]*=nums[i];
        }
        Arrays.sort(nums);
        long a =0;
        for(int i=0;i<nums.length/2;i++){
                a-= (long)nums[i];
        }
        for(int i=nums.length/2;i<nums.length;i++){
             a+=(long)nums[i];
        }
        return a;
    }
}