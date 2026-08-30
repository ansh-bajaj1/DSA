class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min=Integer.MAX_VALUE;
        int i=0,j=0,s=0;
        while(j<nums.length){
            s+=nums[j];
            while(s>target){
                min=Math.min(min,j-i+1);
                s-=nums[i];
                i++;
            }
            if(s==target){
                min=Math.min(min,j-i+1);
            }
            j++;
        }
        return (min==Integer.MAX_VALUE)?0:min;
    }
}