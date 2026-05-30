class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int a=0,ans=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    int s = nums[i]+nums[j]+nums[k];
                     a = Math.abs(target-s);
                     if(a<min) ans = s;
                    min=Math.min(min,a);
                }
            }
        }
        return ans;
    }
}