class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
        int a=-1;
    
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            int min = Integer.MAX_VALUE;
            for(int j=i;j<nums.length;j++){
                min=Math.min(min,nums[j]);
            }
            if(max-min<=k){
            a=i;
            break;
            }
        }
        return a;
    }
}